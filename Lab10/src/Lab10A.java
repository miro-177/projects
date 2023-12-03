/*
Class: CSE 1321L
Section: J51
Term: Fall
Instructor: Jaskirat Sohal
Name: Miroslav Ostrovski
Assignment#: 5
 */
import java.util.Scanner;

public class Lab10A {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = scanner.nextInt();
        min(num1,num2);
        max(num1, num2);
        average(num1,num2);
    }
    public static void min (int num1, int num2) {
        int min;
        if (num1 < num2) {
            min = num1;
        }
        else {
            min = num2;
        }
        System.out.println("Min is "+min);
    }
    public static void max(int num1, int num2) {
        int max;
        if (num1 > num2) {
            max = num1;
        }
        else {
            max = num2;
        }
        System.out.println("Max is "+max);
    }
    public static void average(int num1, int num2) {
        int average = (num1+num2)/2;
        System.out.println("Average is "+average);
    }
}