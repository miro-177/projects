abstract class Customer {
    private char letter;
    private int number;
    private static int nextA = 1;
    private static int nextB = 1;
    private static int nextC = 1;
    private static int nextD = 1;

    public Customer() {
        letter = 'X';
        number = 0;
    }

    public Customer(char letter) {
        if (letter == 'A') {
            this.letter = letter;
            this.number = nextA++;
        } else if (letter == 'B') {
            this.letter = letter;
            this.number = nextB++;
        } else if (letter == 'C') {
            this.letter = letter;
            this.number = nextC++;
        } else if (letter == 'D') {
            this.letter = letter;
            this.number = nextD++;
        } else {
            this.letter = 'X';
            this.number = 0;
            System.out.println("Error, letter must be A, B, C or D");
        }
    }

    protected String getTicketNumber() {
        return "" + letter + number;
    }

    public abstract String getCustomerInfo();
}
