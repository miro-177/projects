import java.util.Scanner;
public class Lab5C {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter x: ");
        int x = scanner.nextInt();
        System.out.print("Enter y: ");
        int y = scanner.nextInt();

        if (x > 0 && y > 0)
        {
            System.out.println("This point is in the first quadrant. ");
        }
        else if (x < 0 && y > 0)
        {
            System.out.println("This point is in the second quadrant. ");
        }
        else if (x < 0 && y < 0)
        {
            System.out.println("This point is in the third quadrant. ");
        }
        else if (x > 0 && y < 0)
        {
            System.out.println("This point is in the fourth quadrant. ");
        }
        else if (x == 0 && y < 0 || y > 0)
        {
            System.out.println("This point is on the y axis. ");
        }
        else if (y == 0 && x < 0 || x > 0)
        {
            System.out.println("This point is on the x axis. ");
        }
        else
            System.out.println("This point is the origin. ");
    }
}
