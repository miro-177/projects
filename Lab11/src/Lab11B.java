import java.util.Scanner;
public class Lab11B {
    public static void main (String[] args) {
        boolean eight = false;
        boolean upper = false;
        boolean digit = false;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = scanner.next();
        String[] split = password.split("");

        int i = 0;
        for (String character : split) {
            char value = character.charAt(i);
            boolean ch1 = Character.isUpperCase(value);

            if (ch1) {
                upper = true;
            }

            try {
                int num = Integer.parseInt(character);
                digit = true;
                break;
            }
            catch (NumberFormatException ignored) {
            }
        }

        if (password.length() >= 8) {
            eight = true;
        }

        if (eight && digit && upper) {
            System.out.println("Valid Password");
        }
        else {
            System.out.println("Invalid password");
        }
        System.out.println("\nProgram Ends");
    }
}