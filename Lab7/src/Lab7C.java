import java.util.Scanner;
public class Lab7C {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a value for the size: ");
        int n = scanner.nextInt();

        System.out.println("This is the requested "+ n +"x"+ n + " box: ");

        for(int i = 1; i <= n; i++)
        {
            for(int j = n; j >= i; j--)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
