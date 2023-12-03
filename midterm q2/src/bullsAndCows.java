public class bullsAndCows {
    public static String bullsAndCows(String correctWord, String guessedWord) {
        int bulls = 0;
        int cows = 0;
        correctWord = correctWord.toLowerCase();
        guessedWord = guessedWord.toLowerCase();
        char[] correctChars = correctWord.toCharArray();
        char[] guessedChars = guessedWord.toCharArray();
        for (int i = 0; i < guessedChars.length; i++) {
            if (guessedChars[i] == correctChars[i]) {
                bulls++;
            } else {
                for (int j = 0; j < correctChars.length; j++) {
                    if (guessedChars[i] == correctChars[j]) {
                        cows++;
                        break;
                    }
                }
            }
        }
        return "Bulls: " + bulls + ", Cows: " + cows;
    }
}

