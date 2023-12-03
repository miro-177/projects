import java.util.Scanner;

public class Assignment1B {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter your average lab grade: ");
        float labGrade = scanner.nextFloat();

        System.out.print("Enter your average assignment grade: ");
        float assignmentGrade = scanner.nextFloat();

        System.out.print("Enter your midterm exam grade: ");
        float midGrade = scanner.nextFloat();

        System.out.print("Enter your final exam grade: ");
        float finalGrade = scanner.nextFloat();

        labGrade = labGrade * .1f;
        assignmentGrade = assignmentGrade * .4f;
        midGrade = midGrade * .2f;
        finalGrade = finalGrade * .3f;

        System.out.println("Your weighted lab average is " + labGrade + ".");
        System.out.println("Your weighted assignment average is " + assignmentGrade + ".");
        System.out.println("Your weighted mid term exam average is " + midGrade + ".");
        System.out.println("Your weighted final exam average is " + finalGrade + ".");

        System.out.println("Adding numbers....");

        float totalGrade = labGrade + assignmentGrade + midGrade + finalGrade;
        System.out.println("Your final grade in CSE 1321L is " + totalGrade + ".");

    }
}

