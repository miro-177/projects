import java.util.Scanner;

public class MainQ2 {
    private static bullsAndCows BullsAndCows;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctWord = "march";
        String guessedWord;
        String result;
        do {
            System.out.print("Enter your guess: ");
            guessedWord = scanner.nextLine();
            result = BullsAndCows.bullsAndCows(correctWord, guessedWord);
            System.out.println(result);
        } while (!guessedWord.equalsIgnoreCase(correctWord));
    }
}

