import java.util.Scanner;
public class Lab4B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter the day: ");
        String day = scanner.nextLine();

        switch (day){
            case "Monday":
            case "monday":
            case "Wednesday":
            case "wednesday":
                System.out.println("I have class today! ");
                break;
            case "Friday":
            case "friday":
                System.out.println(" It's Friday! Friday! Gotta get down on Friday! ");
                break;
            default:
                System.out.println("I should use this time to do my homework. ");
        }


    }
}
