import java.util.Scanner;
public class Assignment7A {
    public static void main(String[] args) {
        String response;
        Scanner scanner = new Scanner(System.in);
        System.out.println("[Finite State Automata]");
        System.out.print("What state do you want to start at? ");
        int state = Integer.parseInt(scanner.nextLine());
        boolean running = true;
        FSA finiteStateAutomata = new FSA(state);
        while(running){
            System.out.println("\nWhat will you do?\n-Go to next state\n-End");
            response = scanner.nextLine().toLowerCase();
            if (response.contains("next")) {
                finiteStateAutomata.goToNextState();
                System.out.println("\nYou're now at state "+finiteStateAutomata.state);
            }
            else if (response.contains("end") && !finiteStateAutomata.end()){
                System.out.println("You can't stop here; you can only stop at state 3.");
            }
            else if (response.contains("end") && finiteStateAutomata.end()){
                running = false;
            }
            else {
                System.out.println("Invalid command.");
            }
        }
    }
}

