import java.util.Scanner;
public class Assignment3B {
    public static void main(String[]args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("[Martial Arts Belt]");
        System.out.print("What belt grade are you? ");
        int grade = scanner.nextInt();

        switch (grade)
        {
            case 10, 9:
                System.out.print("You have a white belt,\n");
                break;

            case 8, 7:
                System.out.print("You have a yellow belt,\n");
                break;

            case 6, 5:
                System.out.print("You have a blue belt,\n");
                break;

            case 4, 3:
                System.out.print("You have a green belt,\n");
                break;

            case 2, 1:
                System.out.print("You have a brown belt,\n");
                break;

            case 0:
                System.out.print("You have a black belt,\n");
                break;

            default:
                System.out.println("You have no belt...");
        }

        switch (grade)
        {
            case 9, 8, 6, 4, 2:
                System.out.println("with 1 stripe! ");
                break;
            case 7, 5, 3, 1:
                System.out.print("with 2 stripes! ");
                break;
            case 10, 0:
                System.out.println("with no stripes! ");
                break;
        }
    }
}

