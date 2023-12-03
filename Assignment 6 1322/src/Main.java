import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        float bitcoinPrice = getDollarPrice(getData());
        System.out.printf("Current bitcoin price: $%.2f\n", bitcoinPrice);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Buy Bitcoin");
            System.out.println("2. Get current value");
            System.out.println("3. Get change in value for a person");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter the bitcoin price: ");
                float price = scanner.nextFloat();
                scanner.nextLine();
                buyBitCoin(price);
            } else if (choice == 2) {
                getCurrentValue(bitcoinPrice);
            } else if (choice == 3) {
                System.out.print("Enter the name of the person: ");
                String name = scanner.nextLine();
                float originalInvestment = 0;
                float bitcoinsOwned = 0;
                try {
                    originalInvestment = Float.valueOf((float) getPersonFromFile(name, "initialInvestmentUSD.txt"));
                    bitcoinsOwned = Float.valueOf((float) getPersonFromFile(name, "clientBC.txt"));
                } catch (PersonNotFound e) {
                    System.out.println(e.getMessage());
                    continue;
                }
                float currentValue = bitcoinsOwned * bitcoinPrice;
                float changeInValue = currentValue - originalInvestment;
                System.out.printf("%s has %.6f bitcoins worth $%.2f (original investment: $%.2f, change in value: $%.2f)\n", name, bitcoinsOwned, currentValue, originalInvestment, changeInValue);
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
        scanner.close();
    }

    public static ArrayList<String> getData() throws IOException {
        Socket socket = new Socket("api.coindesk.com", 80);

        PrintWriter out = new PrintWriter(socket.getOutputStream());

        out.print("GET http://api.coindesk.com/v1/bpi/currentprice.json HTTP/1.0\n\n");
        out.flush();

        
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        ArrayList<String> response = new ArrayList<>();
        String line;
        while ((line = in.readLine()) != null) {
            response.add(line);
        }

        socket.close();
        return response;
    }

    public static float getDollarPrice(ArrayList<String> lines) {
        boolean header=true;
        String json="";
        for(String line : lines) {
            if(line.equals("")) {
                header=false;
                continue;
            }
            if(header==false) {
                json=line;
                break;
            }
        }
        //System.out.println("Json: "+json);
        String[] jsonParts=json.split(":");
        String priceLine=jsonParts[19];
        String justPrice=priceLine.replace("},\"GBP\"","");
        float price=Float.parseFloat(justPrice);
        return price;
    }

    public static void buyBitCoin(float price) throws IOException {
        File file = new File("initialInvestmentUSD.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(":");
            String name = parts[0];
            float investment = Float.parseFloat(parts[1]);
            float bitcoins = investment / price;
            System.out.printf("%s bought %.6f bitcoins for $%.2f\n", name, bitcoins, investment);
        }
        reader.close();
    }

    public static void createClientBCFile(ArrayList<String> initialInvestmentData, float bitcoinPrice) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("clientBC.txt"));

        for (String line : initialInvestmentData) {
            String[] parts = line.split(":");
            String name = parts[0];
            float dollars = Float.parseFloat(parts[1]);
            float bitcoins = dollars / bitcoinPrice;

            writer.write(name + ":" + bitcoins + "\n");
        }

        writer.close();
    }

    public static void getCurrentValue(float bitcoinPrice) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("clientBC.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(":");
            String name = parts[0];
            float bitcoins = Float.parseFloat(parts[1]);
            float value = bitcoins * bitcoinPrice;
            System.out.printf("%s has %.6f bitcoins worth $%.2f\n", name, bitcoins, value);
        }
        reader.close();
    }

    public static class PersonNotFound extends Exception {
        public PersonNotFound(String message) {
            super(message);
        }
    }

    public static double getPersonFromFile(String nameToSearch, String fileName) throws PersonNotFound {
        try {
            Scanner scanner = new Scanner(new File(fileName));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] tokens = line.split(":");
                String name = tokens[0].trim();
                if (name.equals(nameToSearch)) {
                    double price = Double.parseDouble(tokens[1].trim());
                    return price;
                }
            }
            throw new PersonNotFound("Person not found in file: " + fileName);
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + fileName);
            return 0.0;
        }
    }

}

