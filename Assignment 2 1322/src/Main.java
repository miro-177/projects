import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Lot> auction = new ArrayList<>();
        mainMenu(auction);
    }
    public static Lot getNextLot(ArrayList<Lot> lots) {
        if (lots.size() != 0) {
            Lot firstLot = lots.get(0);
            lots.remove(0);
            return firstLot;
        }
        else
            return new Lot();
    }

    public static  void addItem(ArrayList<Lot> lots) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the description of this item");
        String description = scanner.nextLine();

        System.out.println("What is the starting bid");
        int startingBid = scanner.nextInt(); scanner.nextLine();

        System.out.println("What is the bid increment");
        int bidIncrement = scanner.nextInt(); scanner.nextLine();

        Lot lot = new Lot(description, startingBid, bidIncrement);
        lots.add(lot);
    }

    public static void bid(Lot lot) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much would you like to bid");
        System.out.println("Minimum bid is "+lot.nextBid());
        int bid = scanner.nextInt(); scanner.nextLine();
        if (bid < lot.nextBid()) {
            System.out.println("Your bid is lower than the required next bid");
        }
        else
            lot.setCurrentBid(bid);
    }

    public static void markSold(Lot lot) {
        lot.markSold();
        System.out.println(lot);
    }

    public static void mainMenu(ArrayList<Lot> lots) {
        Lot currentLot = null;
        int input = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            if (currentLot != null) {
                System.out.println("Current lot:");
                System.out.println(currentLot);
            }
            else
                System.out.println("We are not currently bidding");
            System.out.println();
            System.out.println("1. Add Lot to Auction");
            System.out.println("2. Start bidding on next Lot");
            System.out.println("3. Bid on current Lot" );
            System.out.println("4. Mark current Lot sold");
            System.out.println("5. Quit");
            input = scanner.nextInt(); scanner.nextLine();

            switch (input) {
                case 1 : addItem(lots);

                case 2 : {
                    if (lots.size() == 0) {
                        System.out.println("There is nothing to bid on, add an item first");
                    } else if (currentLot != null && !currentLot.isSold()) {
                        System.out.println("You must mark the current lot as sold before bringing up the next Lot");
                    }
                    else {
                        currentLot = getNextLot(lots);
                    }
                }
                case 3 : {
                    if (currentLot == null || currentLot.getDescription().equals("Unknown item") || currentLot.isSold()) {
                        System.out.println("You must first bring a Lot up for bidding");                    }
                    else
                        bid(currentLot);
                }
                case 4 : {
                    if (currentLot == null || currentLot.getDescription().equals("Unknown item") || currentLot.isSold()) {
                        System.out.println("You must first bring a Lot up for bidding");
                    }
                    else
                        currentLot.markSold();
                    System.out.println(currentLot);
                }
            }
        }
        while (input != 5);
    }
}