public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            String fold_string = PaperFold.paperFold(i);
            System.out.println("For " + i + " folds we get: " + fold_string + "\n");
        }
    }
}