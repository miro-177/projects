import java.util.Scanner;

public class Assignment1A {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter the width (in pixels): " );
        float width = scanner.nextFloat();

        System.out.print("Enter the length (in pixels) " );
        float height = scanner.nextFloat();

        System.out.print("Enter the resolution (PPI): ");
        int ppi = scanner.nextInt();

        width = width/ppi;
        height = height/ppi;

        System.out.printf("At " +ppi+ " PPI, the image is " + width + "" + "\" wide by " + height + "\" high.");

    }
}

