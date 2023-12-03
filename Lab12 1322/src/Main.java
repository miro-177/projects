import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BlueRayCollection collection = new BlueRayCollection();
        int choice = -1;

        while (choice != 0) {
            System.out.println("Choose an option:");
            System.out.println("0. Quit");
            System.out.println("1. Add BlueRay to collection");
            System.out.println("2. See collection");

            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter the title: ");
                scanner.nextLine();
                String title = scanner.nextLine();
                System.out.print("Enter the director: ");
                String director = scanner.nextLine();
                System.out.print("Enter the year of release: ");
                int yearOfRelease = scanner.nextInt();
                System.out.print("Enter the cost: ");
                double cost = scanner.nextDouble();

                collection.add(title, director, yearOfRelease, cost);
            } else if (choice == 2) {
                collection.show_all();
            }
        }
    }
}
