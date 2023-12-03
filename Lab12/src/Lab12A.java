import java.util.Scanner;
public class Lab12A {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Chair chair = new Chair();
        System.out.println("You are about to create a chair.");
        System.out.print("How many legs does your chair have: ");
        chair.numofLegs = scanner.nextInt();
        System.out.print("Is your chair rolling (true/false): ");
        chair.rolling = scanner.nextBoolean();
        System.out.print("What is your chair made of: ");
        chair.material = scanner.next();
        System.out.println();

        System.out.print("Your chair has "+chair.numofLegs+" legs, ");
        if (chair.rolling) {
            System.out.println("is rolling, and is made of "+chair.material+".");
        }
        else
            System.out.println("is not rolling, and is made of "+chair.material+".");

        System.out.println();
        System.out.println("This program is going to change that.");
        System.out.println();

        chair.numofLegs = 4;
        chair.rolling = false;
        chair.material = "wood";

        System.out.print("Your chair has "+chair.numofLegs+" legs, is not rolling, and is made of "+chair.material+".");
    }
}