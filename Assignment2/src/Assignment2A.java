import java.util.Scanner;

public class Assignment2A {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numberPeople, groups, remainder;

        System.out.print("How many people are in your group: ");
        numberPeople = scanner.nextInt();

        System.out.print("How many people do you want: ");
        groups = scanner.nextInt();

        remainder = numberPeople % groups;

        System.out.print("If we divide " + numberPeople + " in " + groups + " groups evenly, " + remainder + " person/people will be left without a group.");
    }
}
