import java.util.*;

public class Assignment6C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[Connect Four]");
        int rows = 4;
        int columns = 5;
        String[][] board = new String[rows][columns];
        int column;
        int player = 1;
        char play;
        boolean playing = true;

        while (playing) {
            System.out.print("Player " + player + ", enter a column: ");
            column = scanner.nextInt();

            if (player == 1) {
                play = 'X';
                addDisc(board, column, play);
                player = 2;
            } else {
                player = 1;
                play = 'O';
                addDisc(board, column, play);
            }
            printArray(board);
            if (winVertical(board, play)) {
                break;
            }
            if (winHorizontal(board, play)) {

                break;
            }
            if (isBoardFull(board)) {
                System.out.println("The board is full.");
                playing = false;
            }

        }
    }
    public static void printArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length + 1; j++) {
                if (array[i][j] == null) {
                    System.out.print("| ");
                } else {
                    System.out.print("|" + array[i][j]);
                }
            }
            System.out.println();
        }

    }
    public static boolean isBoardFull(String[][] array) {
        boolean full = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] == null) {
                    full = false;
                    break;
                }
            }
        }
        return full;
    }
    public static void addDisc(String[][] array, int column, char player) {
        int counter = 1;

        while (true) {
            if (array[array.length - 1][column] == null) {
                array[array.length - 1][column] = String.valueOf(player);
                break;
            } else if (Objects.equals(array[array.length - 1][column], "X") || Objects.equals(array[array.length - 1][column], "O")) {
                if (array[array.length - counter][column] == null) {
                    array[array.length - counter][column] = String.valueOf(player);
                    break;
                }
            }
            counter++;
        }
    }
    public static boolean winVertical(String[][] array, char player) {
        boolean won = false;
        int number;
        for (int i = 0; i < array.length-3; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (Objects.equals(array[i][j], String.valueOf(player))
                        && Objects.equals(array[i+1][j], String.valueOf(player))
                        && Objects.equals(array[i+2][j], String.valueOf(player))) {
                    won = true;
                    break;
                }
            }
        }
        if (player == 'X') {
            number = 1;
        }
        else {
            number = 2;
        }

        if (won) {
            System.out.println("Player "+number + " wins!");
        }
        return won;
    }
    public static boolean winHorizontal (String[][] array, char player) {
        boolean won = false;
        int count = 0;
        int number;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (Objects.equals(array[i][j], String.valueOf(player))) {
                    count++;
                } else {
                    count = 0;
                }
                if (count >= 4) {
                    won = true;
                    break;
                }
            }
        }

        if (player == 'X') {
            number = 1;
        }
        else {
            number = 2;
        }

        if (won) {
            System.out.println("Player "+number + " wins!");
        }
        return won;
    }
}