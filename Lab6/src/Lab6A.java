import java.util.Scanner;
public class Lab6A {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter 10 numbers and this program will display the largest.");
        System.out.println();
        int largest = 0;
        int posInt;
        for (int i = 1; i <= 10;i++) {
            System.out.print("Please enter number " + i + ": ");
            posInt = scanner.nextInt();


            if (posInt > largest) {
                largest = posInt;
            }
        }
        System.out.println();
        System.out.println("The largest number was " + largest);
    }
}

