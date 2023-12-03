import java.util.Scanner;
import java.util.Random;
public class Lab6B {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        Random r = new Random();
        float randInt;
        int counter = 0;
        float num;

        System.out.print("Enter a number between 1 and 1000: ");
        num = scanner.nextFloat();

        while (num >= 1 && num <= 1000){
            randInt = r.nextFloat(1001);
            randInt = Math.round(randInt);
            ++counter;
            System.out.println("My guess was " + randInt);

            if (randInt == num){
                System.out.println("I guessed the number was " + num + " and it only took me "+ counter + " guesses");
                break;
            }
        }

    }
}

