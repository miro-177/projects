import java.util.Scanner;
public class Assignment3C {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String augS = "";
        String blueT = "";
        float version;

        System.out.println("[App Checklist]");
        System.out.print("What mobile device do you have? ");
        String device = scanner.next();

        if (device.equals("Android")) {
            System.out.print("What version do you have? ");
            version = scanner.nextFloat();

            {
                System.out.println("I'm sorry, our app does not support your device.");
            }

            if (version < 11) {
                System.out.print("Does your device support Augmented Reality? ");
                augS = scanner.next();
            }

            if (version >= 11 || augS.equals("Yes")) {
                System.out.println("Congratulations, you can run the app! ");
            }
            else
            {
                System.out.println("I'm sorry, our app does not support your device.");
            }
        }
        else if (device.equals("Apple"))
        {
            System.out.print("What version do you have? ");
            version = scanner.nextFloat();
            if (version < 12)
            {
                System.out.print("Does you device support Bluetooth connections? ");
                blueT = scanner.next();
            }
            if (blueT.equals("Yes") || version >= 12)
            {
                System.out.println("Congratulations, you can run the app! ");
            }
            else
            {
                System.out.println("I'm sorry, our app does not support your device.");
            }
        }
        else
        {
            System.out.println("I'm sorry, our app does not support your device.");
        }
    }
}
