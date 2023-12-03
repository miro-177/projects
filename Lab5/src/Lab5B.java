import java.util.Scanner;
public class Lab5B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        switch (number % 2) {
            case (0):
                System.out.print("This number is divisible by 2 ");
                break;
            default:
                switch (number % 5)
                {
                    case (0):
                        if (number % 3 == 0)
                        {
                            System.out.print("This number is divisible by 3");
                            return;
                        }
                        else
                        {
                            System.out.print("This number is divisible by 5 ");
                            return;
                        }
                }
                switch (number % 3) {
                    case (0):
                        System.out.print("This number is divisible by 3");
                        break;
                    default:
                        System.out.print("This number is undetermined");
                        break;
                }

        }
    }
}
