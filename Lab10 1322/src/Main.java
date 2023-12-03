import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader(getFileName("first")));
            BufferedReader reader2 = new BufferedReader(new FileReader(getFileName("second")));

            String line1 = reader1.readLine();
            String line2 = reader2.readLine();
            int lineNumber = 1;

            while (line1 != null && line2 != null) {
                if (!line1.equals(line2)) {
                    System.out.println("Line " + lineNumber);
                    System.out.println("< " + line1);
                    System.out.println("> " + line2);
                }
                line1 = reader1.readLine();
                line2 = reader2.readLine();
                lineNumber++;
            }

            if (line1 != null || line2 != null) {
                System.out.println("Files have different number of lines");
            }

            reader1.close();
            reader2.close();
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    private static String getFileName(String ordinal) throws IOException {
        System.out.print("Enter the " + ordinal + " file name: ");
        BufferedReader reader = new BufferedReader(new FileReader("/dev/tty"));
        String fileName = reader.readLine();
        reader.close();
        return fileName;
    }
}