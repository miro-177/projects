/*
Class: CSE 1321L
Section: J51
Term: Fall
Instructor: Jaskirat Sohal
Name: Miroslav Ostrovski
Lab#: 9
 */
import java.util.Scanner;
public class Lab9B {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[11];
        System.out.println("Please enter 11 numbers: ");
        int counter = 1;
        int mid;
        int min = 0;
        int max = numbers.length-1;
        boolean contains = false;

        for (int i = 0; counter <= 11 ; i++) {
            System.out.print("Integer " + counter + ": ");
            int input = scanner.nextInt();
            numbers[i] = input;
            counter++;
        }

        for (int i = 0; i < numbers.length-1; i++)
        {
            for (int j = 0; j < numbers.length-1; j++) {
                if (numbers[j] > numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        System.out.println();

        System.out.print("What is the target number: ");
        int target = scanner.nextInt();

        System.out.println();
        System.out.print("The sorted set is: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();
        System.out.println();

        while (max >= min) {
            mid = (min + max)/2;
            System.out.println("Low is "+min);
            System.out.println();
            System.out.println("High is "+max);
            System.out.println();
            System.out.println("Mid is "+mid);
            System.out.println();
            System.out.println("Searching");
            System.out.println();
            if (target < numbers[mid]) {
                max = mid - 1;
            }
            else if (target == numbers[mid]) {
                contains = true;
                break;
            }
            else {
                min = mid + 1;
            }
        }

        for (int number : numbers) {
            if (number == target) {
                System.out.println("The target is in the set.");
                contains = true;
                break;
            }
        }

        if (!contains) {
            System.out.println("The target is not in the set.");
        }
    }
}


