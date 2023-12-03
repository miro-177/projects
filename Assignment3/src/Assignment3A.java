import java.util.Scanner;
public class Assignment3A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[Epic Quest Simulator]");
        System.out.println("Hello stranger! Do you have time to hear my tale?\n1) Yes\n2) No");

        int reply = scanner.nextInt();
        if (reply == 2) {
            System.out.println("Ah, then goodbye...");
        } else if (reply == 1) {
            System.out.println("Thank you! I come from the land of Pax Bisonica. Our country has been taken over by a cruel tyrant!\n1) That's awful\n2) What can I do? ");
        }

        reply = scanner.nextInt();
        if (reply == 1) {
            System.out.println("Alas, it is truly terrible...");
            System.out.println();
            System.out.println("Please, you must journey to Pax Bisonica and free our country!\n1) Okay\n2) No");
        }
        else if (reply == 2)
        {
            System.out.println("Please, you must journey to Pax Bisonica and free our country!\n1) Okay\n2) No");
        }

        reply = scanner.nextInt();

        if (reply == 2)
        {
            System.out.println("Then all is lost...");
        }
        else if (reply == 1)
        {
            System.out.println("Hooray!");
        }


    }
}


