import java.util.Scanner;
public class Lab6C {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        int selection;
        int balance = 1000;
        char sentinel;

        System.out.println("Welcome! ");
        System.out.println("You have $1000 in your account. ");
        System.out.println();

        do {
            System.out.println("Menu\n0 - Make a deposit\n1 - make a withdrawal\n2 - Display account value");
            System.out.println();
            System.out.print("Please make a selection: ");
            selection = scanner.nextInt();

            if (selection == 0) {
                System.out.print("How much would you like to deposit? : ");
                int deposit = scanner.nextInt();
                balance += deposit;
                System.out.println("Your current balance is $" + balance);
                System.out.print("Would you like to return to the main menu (Y/N)? :");
                sentinel = scanner.next().charAt(0);
                System.out.println();
            } else if (selection == 1) {
                System.out.print("How much would you like to withdraw? : ");
                int withdrawal = scanner.nextInt();
                balance -= withdrawal;
                System.out.println("Your current balance is $" + balance);
                System.out.print("Would you like to return to the main menu (Y/N)? :");
                sentinel = scanner.next().charAt(0);
                System.out.println();
            } else if (selection == 2) {
                System.out.println("Your current balance is $" + balance);
                System.out.print("Would you like to return to the main menu (Y/N)? :");
                sentinel = scanner.next().charAt(0);
                System.out.println();
            } else {
                System.out.println("Invalid entry, please try again.");
                System.out.print("Would you like to return to the main menu (Y/N)? : ");
                sentinel = scanner.next().charAt(0);
                System.out.println();
            }
        }
        while (sentinel == 'Y' || sentinel == 'y') ;
        System.out.print("Thank you for banking with us!");

    }
}

