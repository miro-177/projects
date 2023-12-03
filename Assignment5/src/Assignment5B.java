/*
Class: CSE 1321L
Section: J51
Term: Fall
Instructor: Jaskirat Sohal
Name: Miroslav Ostrovski
Assignment#: 5
 */
import java.util.Scanner;

public class Assignment5B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[What's your sign?]");
        System.out.print("What month were you born? ");
        int month = scanner.nextInt();
        if (month > 12) {
            System.out.println("That is not a valid month...");
        }
        System.out.print("And what day? ");
        int day = scanner.nextInt();

        String[][] zodiacs = new String[month+1][day+1];

        for (int i = 0; i < month; i++) {
            for (int j = 0; j < day; j++) {
                if (month == 12 && day == 22 || month == 1 && day <= 19) {
                    zodiacs[month][day] = "Capricornus";
                }
                else if (month == 1 && day <= 31 || month == 2 && day <= 18 ) {
                    zodiacs[month][day] = "Aquarius";
                }
                else if (month == 2 && day <= 31 || month == 3 && day <= 20 ) {
                    zodiacs[month][day] = "Pisces";
                }
                else if (month == 3 && day <= 31 || month == 4 && day <= 19 ) {
                    zodiacs[month][day] = "Aries";
                }
                else if (month == 4 && day == 20 || month == 5 && day <= 20 ) {
                    zodiacs[month][day] = "Taurus";
                }
                else if (month == 5 && day == 21 || month == 6 && day <= 21 ) {
                    zodiacs[month][day] = "Gemini";
                }
                else if (month == 6 && day == 22 || month == 7 && day <= 22 ) {
                    zodiacs[month][day] = "Cancer";
                }
                else if (month == 7 && day == 23 || month == 8 && day <= 22 ) {
                    zodiacs[month][day] = "Leo";
                }
                else if (month == 8 && day == 23 || month == 9 && day <= 22 ) {
                    zodiacs[month][day] = "Virgo";
                }
                else if (month == 9 && day == 23 || month == 10 && day <= 23 ) {
                    zodiacs[month][day] = "Libra";
                }
                else if (month == 10 && day == 24 || month == 11 && day <= 21 ) {
                    zodiacs[month][day] = "Scorpius";
                }
                else if (month == 11 && day == 22 || month == 12 && day <= 21 ) {
                    zodiacs[month][day] = "Sagittarius";
                }
            }
        }

        System.out.println();
        System.out.println("Your sign is "+zodiacs[month][day]+"!");
    }
}
