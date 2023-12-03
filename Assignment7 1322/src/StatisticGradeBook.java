import java.util.*;

public class StatisticGradeBook implements Runnable {
    private final int[][] grades;
    private final String[] students = {"Alice", "Bob", "Charlie", "David", "Emily"};

    public StatisticGradeBook() {
        grades = new int[students.length][12];
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < 10; j++) {
                Random random = new Random();
                grades[i][j] = random.nextInt(101);
            }
        }
    }

    public void run() {
        System.out.println("Calculating grades 0 out of 1000");
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Calculating grades " + (i * 100) + " out of 1000");
        }
        System.out.println("All grades calculated");
    }

    public void getStudentGrade(String name) {
        int studentIndex = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                studentIndex = i;
                break;
            }
        }
        if (studentIndex == -1) {
            System.out.println("Student not found");
            return;
        }
        double hwTotal = 0;
        for (int i = 0; i < 10; i++) {
            hwTotal += grades[studentIndex][i];
        }
        double hwAverage = hwTotal / 10;
        double quizTotal = 0;
        for (int i = 0; i < 10; i++) {
            quizTotal += grades[studentIndex][i + 10];
        }
        double quizAverage = quizTotal / 10;
        double midterm = grades[studentIndex][20];
        double finalExam = grades[studentIndex][21];
        double overallAverage = hwAverage * 0.2 + quizAverage * 0.5 + midterm * 0.15 + finalExam * 0.15;
        System.out.println(name);
        for (int i = 0; i < 10; i++) {
            System.out.println("Quiz " + i + ": " + grades[studentIndex][i + 10]);
        }
        System.out.println("Quiz Avg: " + quizAverage);
        for (int i = 0; i < 10; i++) {
            System.out.println("Hw " + i + ": " + grades[studentIndex][i]);
        }
        System.out.println("HW Avg: " + hwAverage);
        System.out.println("Midterm: " + midterm + " Final Exam: " + finalExam);
        System.out.println("Overall Average: " + overallAverage);
    }

    public static void main(String[] args) {
        StatisticGradeBook gradeBook = new StatisticGradeBook();
        Thread t = new Thread(gradeBook);
        t.start();
        System.out.println("What student would you like to see grades for");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        gradeBook.getStudentGrade(name);
    }
}
