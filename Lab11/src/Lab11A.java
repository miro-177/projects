import java.util.Scanner;
public class Lab11A {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response;
        int action;
        String yes = "yes";

        do {
            System.out.println("Menu\n0) Hello World\n1) Goodbye Moon\n2) Walking on Sunshine");
            System.out.println();
            System.out.print("What would you like to do: ");
            action = scanner.nextInt();

            switch (action) {
                case 0 -> System.out.println("\nHello!\n");
                case 1 -> System.out.println("\nOk, bye.\n");
                case 2 -> System.out.println("\nWHOA!\n");
            }

            System.out.print("Type YES to rerun. ");
            scanner.nextLine();
            response = scanner.nextLine().toLowerCase();
            System.out.println();
        }
        while (response.equals(yes));

        System.out.println("Program Ends");

    }
}