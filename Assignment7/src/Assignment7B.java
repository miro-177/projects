import java.util.Random;
import java.util.Scanner;
public class Assignment7B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randInt = new Random();
        boolean allInactive = false;
        int check;
        String response;
        FSA2[] finiteStateAutomatas = new FSA2[3];
        System.out.println("[Array of Finite State Automata]");

        for(int i = 0; i < 3; i++) {
            int random = randInt.nextInt(4);
            finiteStateAutomatas[i] = new FSA2();
            finiteStateAutomatas[i].state = random;
            System.out.println("Machine #"+i+" is at state "+random);
        }

        System.out.println();

        do {
            System.out.println("What will you do?\n-Check the current status\n-Go to next state\n-End");
            response = scanner.nextLine().toLowerCase().trim();
            if (response.contains("check")) {
                response = "check";
            }
            else if (response.contains("next")) {
                response = "next";
            }
            switch (response) {
                case "check" -> {
                    System.out.print("What machine will you look at? ");
                    check = scanner.nextInt();
                    System.out.print("\nMachine " + check);
                    if (finiteStateAutomatas[check].isActive()) {
                        System.out.print(" is active and at state " + finiteStateAutomatas[check].showCurrentState() + "\n\n");
                    } else {
                        System.out.print(" is not active and at state " + finiteStateAutomatas[check].showCurrentState() + "\n\n");
                    }
                }
                case "next" -> {
                    System.out.print("What machine will you advance? ");
                    check = scanner.nextInt();
                    finiteStateAutomatas[check].goToNextState();
                    System.out.println("\nMachine " + check + " is now at state " + finiteStateAutomatas[check].showCurrentState() + "\n");
                }
                case "end" -> {
                    System.out.print("What machine will you stop? ");
                    check = scanner.nextInt();
                    finiteStateAutomatas[check].active = false;
                    System.out.println("\nMachine #" + check + " is not active\n");
                }
                default -> {
                    System.out.println("\nInvalid command.");
                    continue;
                }
            }
            scanner.nextLine();
            if (!finiteStateAutomatas[0].active && !finiteStateAutomatas[1].active && !finiteStateAutomatas[2].active) {
                allInactive = true;
                System.out.println("All machines have been turned off.");
            }
        }
        while(!allInactive);
    }
}