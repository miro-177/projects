import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Choose from the following:");
            System.out.println("0. Quit");
            System.out.println("1. Multiply 2 numbers");
            System.out.println("2. Divide 2 numbers");
            System.out.println("3. Modulus 2 numbers");
            choice = scanner.nextInt();
            if (choice == 1) {
                System.out.print("Enter first number: ");
                int a = scanner.nextInt();
                System.out.print("Enter second number: ");
                int b = scanner.nextInt();
                int result = RecursiveMath.recursive_multiply(a, b);
                System.out.println("Answer: " + result);
            } else if (choice == 2) {
                System.out.print("Enter first number: ");
                int a = scanner.nextInt();
                System.out.print("Enter second number: ");
                int b = scanner.nextInt();
                int result = RecursiveMath.recursive_div(a, b);
                System.out.println("Answer: " + result);
            } else if (choice == 3) {
                System.out.print("Enter first number: ");
                int a = scanner.nextInt();
                System.out.print("Enter second number: ");
                int b = scanner.nextInt();
                int result = RecursiveMath.recursive_mod(a, b);
                System.out.println("Answer: " + result);
            }
        }
    }
}

