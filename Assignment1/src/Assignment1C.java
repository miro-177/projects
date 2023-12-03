import java.util.Scanner;

public class Assignment1C {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter a letter: ");


        char character = scanner.next().charAt(0);

        System.out.println("The next letters after " + character + " are " + (char)(character+1) + ", " + (char)(character+2) + ", and " + (char)(character+3) + "!");


    }
}

