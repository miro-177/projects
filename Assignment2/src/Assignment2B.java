import java.util.Scanner;
public class Assignment2B {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        float keyFrame1, keyFrame2, framesPassed, current30, current60;
        int totalDistance;

        System.out.println("[Lerping!]");

        System.out.print("Enter the x coordinate for KeyFrame#1: ");
        keyFrame1 = scanner.nextInt();

        System.out.print("Enter the x coordinate for KeyFrame#2: ");
        keyFrame2 = scanner.nextInt();

        System.out.print("How many frames have passed? ");
        framesPassed = scanner.nextInt();

        totalDistance = (int) (keyFrame2 - keyFrame1);
        current30 = keyFrame1+(totalDistance * (framesPassed/30));
        current60 = keyFrame1+(totalDistance * (framesPassed/60));

        System.out.println();
        System.out.println("The character has to move " + totalDistance + " frames in second.");

        if (current30 == (int) current30) {
            System.out.println("At 30 FPS, their current X position would be " + (String.format("%.4f", current30)));
            System.out.println("At 60 FPS, their current X position would be " + (String.format("%.4f", current60)));
        }
    }
}

