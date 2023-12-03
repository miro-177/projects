public class BuildingBlueprint {
    private final int stories;
    private final int numApartments;
    private double occRate;
    private boolean full = false;
    BuildingBlueprint() {
        this.stories = 10;
        this.numApartments = 20;
        this.occRate = 1.0;
        this.full = true;
    }
    BuildingBlueprint(int stories, int numApartments, double occRate) {
        this.stories = stories;
        this.numApartments = numApartments;
        this.occRate = occRate;
        if (occRate == 1.0) {
            this.full = true;
        }
    }
    public void setOccRate (double occupancyRate) {
        this.occRate = occupancyRate;
        full = occRate == 1;
    }
    public int getOccRate() {
        return (int) (occRate * 100);
    }
    public int getStories() {
        return stories;

    }
    public int getNumApartments() {
        return numApartments;
    }
    public boolean getFull() {
        return full;
    }
}
