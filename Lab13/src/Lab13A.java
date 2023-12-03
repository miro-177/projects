public class Lab13A {
    public static void main(String[] args) {
        BuildingBlueprint buildingOne = new BuildingBlueprint();
        BuildingBlueprint buildingTwo = new BuildingBlueprint(30, 30, .75);
        System.out.println("Year 2020:");
        System.out.println("Building 1 has " + buildingOne.getStories() + " floors, " + buildingOne.getNumApartments() + " apartments, and is " + buildingOne.getOccRate() + "% occupied. Full? " + buildingOne.getFull());
        System.out.println("Building 2 has " + buildingTwo.getStories() + " floors, " + buildingTwo.getNumApartments() + " apartments, and is " + buildingTwo.getOccRate() + "% occupied. Full? " + buildingTwo.getFull());
        System.out.println("\nMany years pass.\n");

        buildingOne.setOccRate(0);
        buildingTwo.setOccRate(1);

        System.out.println("Year 2043:");
        System.out.println("Building 1 has " + buildingOne.getStories() + " floors, " + buildingOne.getNumApartments() + " apartments, and is " + buildingOne.getOccRate() + "% occupied. Full? " + buildingOne.getFull());
        System.out.println("Building 2 has " + buildingTwo.getStories() + " floors, " + buildingTwo.getNumApartments() + " apartments, and is " + buildingTwo.getOccRate() + "% occupied. Full? " + buildingTwo.getFull());
        System.out.println("\nLooks like people prefer taller buildings.");
    }
}
