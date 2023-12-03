import java.util.Scanner;
public class Lab4C {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Welcome!");
        System.out.print("Please input a number: ");
        float number = scanner.nextFloat();
        System.out.println();

        System.out.println("What would you like to do to this number: ");
        System.out.println("0- Get the additive inverse of the number");
        System.out.println("1- Get the reciprocal of the number");
        System.out.println("2- Square the number");
        System.out.println("3- Cube the number");
        System.out.println("4- Exit the program");
        System.out.println();
        int action = scanner.nextInt();

        switch (action){
            case 0:
                float addInv = number * -1f;
                System.out.println();
                System.out.println("The additive inverse of " + number + " is " + addInv);
                break;
            case 1:
                float reciprocal = 1f / number;
                System.out.println();
                System.out.println("The reciprocal of " + number + " is " + reciprocal);
                break;
            case 2:
                float square = number * number;
                System.out.println();
                System.out.println("The square of " + number + " is " + square);
                break;
            case 3:
                float cube = number * number * number;
                System.out.println();
                System.out.println("The cube of " + number + " is " + cube);
                break;
            case 4:
                System.out.println();
                System.out.println("Thank you, goodbye! ");
                break;
            default:
                System.out.println();
                System.out.println("Invalid input, please try again! ");
                break;
        }
    }
}

