import java.util.Scanner;
public class Assignment2C {
    public static void main (String[] args){
        int amountUSD;
        float USDinGBP;
        Scanner scanner = new Scanner (System.in);

        System.out.println("[Bisonica Currency Exchange]");
        System.out.println("General Bison welcomes you to Pax Bisconica!");
        System.out.print("How many US Dollars do you have? ");
        amountUSD = scanner.nextInt();

        final float USDtoGBP = .85f;
        USDinGBP = amountUSD * USDtoGBP;
        final float BDtoGBP = USDinGBP / .5f;

        System.out.println(amountUSD + " US Dollar(s) is " + String.format("%.2f", USDinGBP) + " British pound(s), which is worth " + String.format("%.2f", BDtoGBP) + " Bison Dollar(s)! ");

    }
}
