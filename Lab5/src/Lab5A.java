import java.util.Scanner;
public class Lab5A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you have a driving permit (Y/N)? ");
        char permit = scanner.nextLine().charAt(0);

        if (permit == 'Y' || permit == 'y')
        {
            System.out.print("Do you have a commercial driving license (Y/N)? ");
            char commercial = scanner.nextLine().charAt(0);

            if (commercial == 'Y' || commercial == 'y')
            {
                System.out.print("Congratulations! You can purchase a vehicle, let's start talking options!");
            }
            else
            {
                System.out.print("Commercial driving license is a prerequisite to purchase a vehicle!");
            }


        }
        else if (permit == 'N' || permit == 'n')
        {
            System.out.print("Driving permit is a prerequisite to purchase a vehicle! ");
        }
    }
}
