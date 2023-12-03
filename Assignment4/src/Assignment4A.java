import java.util.Scanner;
public class Assignment4A {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        String input = "";
        int Italy = 0, Costa_Rica = 0, Pax_Bisonica = 0, Ghana = 0;
        int max = 0;
        String mostPop = "";
        System.out.println("[CCSE Study Abroad Survey]");
        while (! input.equals("Quit"))
        {
            ++ counter;
            System.out.println("Student #"+counter+": Which country should we go to for our next study abroad program? ");
            System.out.println("Italy");
            System.out.println("Costa Rica");
            System.out.println("Pax Bisonica");
            System.out.println("Ghana");
            System.out.println("(Type Quit to end the survey)");
            input = scanner.nextLine();


            switch(input){
                case "Italy":
                    Italy++;
                    if (Italy > max)
                    {
                        max = Italy;
                        mostPop = "Italy";
                    }
                    System.out.println("Thank You!");
                    break;
                case "Costa Rica":
                    Costa_Rica++;
                    if (Costa_Rica > max)
                    {
                        max = Costa_Rica;
                        mostPop = "Costa Rica";
                    }
                    System.out.println("Thank You!");
                    break;
                case "Pax Bisonica":
                    Pax_Bisonica++;
                    if (Pax_Bisonica > max)
                    {
                        max = Pax_Bisonica;
                        mostPop = "Pax Bisonica";
                    }
                    System.out.println("Thank You!");
                    break;
                case "Ghana":
                    Ghana++;
                    if (Ghana > max)
                    {
                        max = Ghana;
                        mostPop = "Ghana";
                    }
                    System.out.println("Thank You!");
                    break;
            }
            System.out.println();
        }
        System.out.println("[Results]");
        System.out.println("Italy: " + Italy);
        System.out.println("Costa Rica: " + Costa_Rica);
        System.out.println("Pax Bisonica: " + Pax_Bisonica);
        System.out.println("Ghana: " + Ghana);
        System.out.println();
        System.out.println("Next year's study abroad program will take place in "+ mostPop +".");
    }
}

