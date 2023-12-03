import java.util.Scanner;

public class Assignment6B {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[What's my datatype?]");
        System.out.println();
        System.out.print("Enter an int: ");
        int userInteger = scanner.nextInt();
        System.out.print("Enter a string: ");
        scanner.nextLine();
        String userString = scanner.nextLine();
        System.out.print("Enter a float: ");
        float userFloat = scanner.nextFloat();
        System.out.print("Enter a char: ");
        char userChar = scanner.next().charAt(0);
        System.out.print("Enter a boolean: ");
        boolean userBool = scanner.nextBoolean();

        System.out.println();
        System.out.println("What datatype do you want to check?");
        scanner.nextLine();
        String input = scanner.nextLine().toLowerCase();

        switch (input) {
            case "char" -> WhatsMyType(userChar);
            case "string" -> WhatsMyType(userString);
            case "float" -> WhatsMyType(userFloat);
            case "int" -> WhatsMyType(userInteger);
            case "boolean" -> WhatsMyType(userBool);
        }
    }
    public static String WhatsMyType(int input) {
        String value = String.valueOf(input);
        System.out.println();
        System.out.println("\'"+input+"\'"+ " is an int value!");
        return value;
    }
    public static String WhatsMyType(String input) {
        System.out.println();
        System.out.println("\'"+input+"\'"+ " is a String value!");
        return input;
    }
    public static String WhatsMyType(float input) {
        String value = String.valueOf(input);
        System.out.println();
        System.out.println("\'"+input+"\'"+ " is a float value!");
        return value;
    }
    public static String WhatsMyType(char input) {
        String value = String.valueOf(input);
        System.out.println();
        System.out.println("\'"+input+"\'"+ " is a char value!");
        return value;
    }
    public static String WhatsMyType(boolean input) {
        System.out.println();
        String value = String.valueOf(input);
        System.out.println("\'"+input+"\'"+ " is a boolean value!");
        return value;
    }
}
