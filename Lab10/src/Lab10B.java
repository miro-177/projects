/*
Class: CSE 1321L
Section: J51
Term: Fall
Instructor: Jaskirat Sohal
Name: Miroslav Ostrovski
Assignment#: 5
 */
import java.util.Scanner;

public class Lab10B {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter width: ");
        double width = scanner.nextFloat();
        System.out.print("Enter height: ");
        double height = scanner.nextFloat();
        isValid(width,height);

        System.out.println();

        char response;
        System.out.print("Do you want to enter another width and height (Y/N)? : ");
        response = scanner.next().charAt(0);

        System.out.println();

        while (response == 'Y' || response == 'y') {
            System.out.print("Enter width: ");
            width = scanner.nextFloat();
            System.out.print("Enter height: ");
            height = scanner.nextFloat();
            isValid(width,height);
            System.out.println();
            System.out.print("Do you want to enter another width and height (Y/N)? : ");
            response = scanner.next().charAt(0);
            System.out.println();
        }

        System.out.println("Program Ends");
    }
    public static void isValid (double num1, double num2) {
        boolean isValid = num1 + num2 > 30;
        if (isValid) {
            System.out.println("This is a valid rectangle");
            area(num1, num2);
            perimeter(num1, num2);
        }
        else {
            System.out.println("This is an invalid rectangle");
        }
    }
    public static void area (double num1, double num2) {
        double area;
        area = num1 * num2;
        System.out.println("The area is: "+area);
    }
    public static void perimeter(double num1, double num2) {
        double perimeter;
        perimeter = (2f * num1) + (2f * num2);
        System.out.println("The perimeter is "+perimeter);
    }
}
