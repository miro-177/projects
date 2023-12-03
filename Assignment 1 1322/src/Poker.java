import java.util.ArrayList;
public class Poker {
    private PlayingCards deck;
    private ArrayList<String> hand1 = new ArrayList<String>();
    private ArrayList<String> hand2 = new ArrayList<String>();

    public void dealHands() {
        for (int i = 0; i < 5; i++) {
            hand1.add(deck.getNextCard());
            hand2.add(deck.getNextCard());
        }
    }

    Poker() {
        deck = new PlayingCards();
        deck.Shuffle();
        dealHands();
    }

    Poker(ArrayList<String> hand1, ArrayList<String> hand2) {
        this.hand1 = hand1;
        this.hand2 = hand2;
    }

    public void showHand(int num) {
        if (num == 1) {
            System.out.println("Player 1's Hand: ");
            for (String hand1 : hand1) {
                System.out.print(hand1 + ",");
            }
        } else {
            System.out.println("Player 2's Hand: ");
            for (String hand2 : hand2) {
                System.out.print(hand2 + ",");
            }
        }
    }

    public int[] countSuite(ArrayList<String> hand) {
        int[] numSuite = new int[4];
        for (String card : hand) {
            String[] secCards = card.split(" ");
            String secCard = secCards[2];

            if (secCard.equals("Clubs")) {
                numSuite[0] += 1;
            } else if (secCard.equals("Diamonds")) {
                numSuite[1] += 1;
            } else if (secCard.equals("Hearts")) {
                numSuite[2] += 1;
            } else if (secCard.equals("Spades")) {
                numSuite[3] += 1;
            }
        }
        return numSuite;
    }

    public int[] countValues(ArrayList<String> hand) {
        int[] counts = new int[15];
        for (String card : hand) {
            String count = card.substring(0, 1);
            switch (count) {
                case "A":
                    counts[1]++;
                    break;
                case "2":
                    counts[2]++;
                    break;
                case "3":
                    counts[3]++;
                    break;
                case "4":
                    counts[4]++;
                    break;
                case "5":
                    counts[5]++;
                    break;
                case "6":
                    counts[6]++;
                    break;
                case "7":
                    counts[7]++;
                    break;
                case "8":
                    counts[8]++;
                    break;
                case "9":
                    counts[9]++;
                    break;
                case "1":
                    counts[10]++;
                    break;
                case "J":
                    counts[11]++;
                    break;
                case "Q":
                    counts[12]++;
                    break;
                case "K":
                    counts[13]++;
                    break;
            }
        }
        return counts;
    }

    public int numPairs(int[] counts) {
        int pairs = 0;
        for (int count : counts) {
            if (count == 2) {
                pairs++;
            }
        }
        return pairs;
    }

    public int threeOfAKind(int[] counts) {
        int trios = 0;
        for (int count : counts) {
            if (count == 3) {
                trios++;
            }
        }
        return trios;
    }

    public int fourOfAKind(int[] counts) {
        int fours = 0;
        for (int count : counts) {
            if (count == 4) {
                fours++;
            }
        }
        return fours;
    }

    public boolean fullHouse(int[] counts) {
        int threeOfAKind = threeOfAKind(counts);
        int numPairs = numPairs(counts);

        if (threeOfAKind > 0 && numPairs > 0) {
            return true;
        }
        return false;
    }

    public static boolean straight(int[] counts) {
        boolean straight = false;
        int count = 0;
        for (int i : counts) {
            if (i == 1) {
                count++;
                if (count == 5) {
                    straight = true;
                    break;
                }
            } else {
                count = 0;
            }
        }
        if (!straight && counts[1] == 1 && counts[10] == 1 && counts[11] == 1 && counts[12] == 1 && counts[13] == 1) {
            straight = true;
        }

        return straight;
    }

    public boolean flush(int[] counts) {
        for (int count : counts) {
            if (count == 5) {
                return true;
            }
        }
        return false;
    }

    public boolean straightFlush(int[] countValues, int[] countSuites) {
        return flush(countSuites) && straight(countValues);
    }

    public boolean royalFlush(int[] countValues, int[] countSuites) {
        return countValues[10] == 1 && countValues[11] == 1 && countValues[12] == 1 && countValues[13] == 1 && countValues[1] == 1 && straight(countValues);
    }

    public String scoreHand(int hand) {
        int[] countValues;
        int[] countSuites;
        if (hand == 1) {
            countValues = countValues(hand1);
            countSuites = countSuite(hand1);
        } else {
            countValues = countValues(hand2);
            countSuites = countSuite(hand2);
        }
        if (royalFlush(countValues,countSuites)){
            return "RoyalFlush";
        }
        else if (straightFlush(countValues,countSuites)) {
            return "StraightFlush";
        }
        else if (flush(countValues)) {
            return "Flush";
        }
        else if (straight(countValues)) {
            return "Straight";
        }
        else if (fullHouse(countValues)){
            return "FullHouse";
        }
        else if (fourOfAKind(countValues) > 0 ){
            return "4 Of A Kind";
        }
        else if (threeOfAKind(countValues) > 0 ){
            return "3 Of A Kind";
        }
        else if (numPairs(countValues) == 2){
            return "Two Pairs";
        }
        else if (numPairs(countValues) == 1){
            return "One Pair";
        }
        return "HighCard";

    }
}


