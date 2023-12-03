import java.util.Scanner;
public class Assignment4C {
    public static void main(String[] args)throws InterruptedException{
        Scanner scanner = new Scanner(System.in);

        System.out.println("[Backspace Animation]\nPlease enter your sentence: ");
        String sentence = scanner.nextLine();
        System.out.println("How many letters do you want to backspace?");
        int backSpace = scanner.nextInt();

        String backspace = "\b";

        for(int i = 1; i <= backSpace; i++) {
            if (i == 1) {
                Thread.sleep(500);
            }
            sentence = sentence + backspace;
        }
        System.out.println(sentence);
    }
}

