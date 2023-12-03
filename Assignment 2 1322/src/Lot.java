public class Lot {
    private static int nextLotNumber = 1001;
    private int lotNumber;
    private String description;
    private int currentBid;
    private int bidIncrement;
    private boolean sold;

    public Lot() {
        this.lotNumber = nextLotNumber++;
        this.description = "Unknown Item";
        this.currentBid = 0;
        this.bidIncrement = 0;
        this.sold = false;
    }

    public Lot(String description, int startingBid, int bidIncrement) {
        this();
        this.description = description;
        this.currentBid = startingBid;
        this.bidIncrement = bidIncrement;
    }

    public void markSold() {
        this.sold = true;
    }

    public boolean isSold() {
        return this.sold;
    }

    public int getBidIncrement() {
        return this.bidIncrement;
    }

    public String getDescription() {
        return this.description;
    }

    public void setCurrentBid(int currentBid) {
        this.currentBid = currentBid;
    }

    public int nextBid() {
        return this.currentBid + this.bidIncrement;
    }

    @Override
    public String toString() {
        if (this.sold) {
            return "Lot " + this.lotNumber + ". " + this.description + " was sold for $" + this.currentBid;
        } else {
            return "Lot " + this.lotNumber + ". " + this.description + " current bid: $" + this.currentBid + " minimum bid: $" + this.nextBid();
        }
    }
}

