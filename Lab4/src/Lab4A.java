import java.util.Scanner;
public class Lab4A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the score of your exam: ");
        float score = scanner.nextFloat();
        score = Math.round(score);

        if (score >= 98) {
            System.out.println("Letter grade is: A+");
        }
        else if (score >= 95){
            System.out.println("Letter grade is: A");
        }
        else if (score >= 92){
            System.out.println("Letter grade is: A-");
        }
        else if (score >= 89) {
            System.out.println("Letter grade is: B+");
        }
        else if (score >= 86){
            System.out.println("Letter grade is: B");
        }
        else if (score >= 83){
            System.out.println("Letter grade is: B-");
        }
        else if (score >= 80){
            System.out.println("Letter grade is: C+");
        }
        else if (score >= 77){
            System.out.println("Letter grade is: C");
        }
        else if (score >= 74){
            System.out.println("Letter grade is: C-");
        }
        else if (score >= 71){
            System.out.println("Letter grade is: D+");
        }
        else if (score >= 68){
            System.out.println("Letter grade is: D");
        }
        else if (score >= 65){
            System.out.println("Letter grade is: D-");
        }
        else if (score <= 64){
            System.out.println("Letter grade is: F");
        }


    }
}

