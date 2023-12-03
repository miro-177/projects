import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String timeString1, timeString2;
        int time1Seconds, time2Seconds, diffSeconds;

        System.out.println("Enter time 1 in 24hr format as follows (HH:MM:SS): ");
        timeString1 = scanner.nextLine();

        System.out.println("Enter time 2 in 24hr format as follows (HH:MM:SS): ");
        timeString2 = scanner.nextLine();

        try {
            time1Seconds = timeToSeconds(timeString1);
            time2Seconds = timeToSeconds(timeString2);
            diffSeconds = Math.abs(time1Seconds - time2Seconds);
            System.out.println("Time difference in seconds: " + diffSeconds);
        }
        catch (InvalidTimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int timeToSeconds(String timeString) throws InvalidTimeException {
        String[] parts = timeString.split(":", 3);

        if (parts.length != 3) {
            throw new InvalidTimeException("Enter a valid time: " + timeString);
        }

        int hours, minutes, seconds;
        try {
            hours = Integer.parseInt(parts[0]);
            minutes = Integer.parseInt(parts[1]);
            seconds = Integer.parseInt(parts[2]);
        }
        catch (NumberFormatException e) {
            throw new InvalidTimeException("Invalid time format: " + timeString);
        }

        if (hours < 0 || hours > 23) {
            throw new InvalidTimeException("Hour must be below 24");
        }
        if (minutes < 0 || minutes > 59) {
            throw new InvalidTimeException("Minutes must be less than 60");
        }
        if (seconds < 0 || seconds > 59) {
            throw new InvalidTimeException("Seconds must be less than 60");
        }

        return hours * 60 * 60 + minutes * 60 + seconds;
    }
}