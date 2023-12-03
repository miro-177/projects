import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String repeatedString = Recursive.repeatNTimes("I must study recursion until it makes sense\n", 100);
        System.out.println(repeatedString);

        // Part 2
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String s1 = scanner.nextLine();
        System.out.print("Enter string 2: ");
        String s2 = scanner.nextLine();

        if (Recursive.isReverse(s1, s2)) {
            System.out.println(s1 + " is the reverse of " + s2);
        } else {
            System.out.println(s1 + " is not the reverse of " + s2);
        }
    }
}