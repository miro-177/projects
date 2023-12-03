import java.util.Arrays;

public class Student {
    private int[] quizScores;
    private int[] homeworkScores;
    private int midtermGrade;
    private int finalExamGrade;
    private double quizAverage;
    private double homeworkAverage;
    private double overallAverage;
    private String name;
    private int id;

    public Student(String line) {
        String[] parts = line.split(",");
        this.name = parts[0];
        this.id = Integer.parseInt(parts[1]);
        this.quizScores = new int[10];
        for (int i = 2; i < 12; i++) {
            this.quizScores[i - 2] = Integer.parseInt(parts[i]);
        }
        this.homeworkScores = new int[10];
        for (int i = 12; i < 22; i++) {
            this.homeworkScores[i - 12] = Integer.parseInt(parts[i]);
        }
        this.midtermGrade = Integer.parseInt(parts[22]);
        this.finalExamGrade = Integer.parseInt(parts[23]);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void calcQuizAverage() {
        Arrays.sort(quizScores);
        int sum = 0;
        for (int i = 1; i < 10; i++) {
            sum += quizScores[i];
        }
        this.quizAverage = (double) sum / 9;
    }

    public void calcHWAverage() {
        Arrays.sort(homeworkScores);
        int sum = 0;
        for (int i = 1; i < 10; i++) {
            sum += homeworkScores[i];
        }
        this.homeworkAverage = (double) sum / 9;
    }

    public void calcOverallAverage() {
        this.overallAverage = 0.4 * quizAverage + 0.1 * homeworkAverage
                + 0.2 * midtermGrade + 0.3 * finalExamGrade;
    }

    public String getGrade() {
        return String.format("%s, %d, %.2f, %.2f, %.2f",
                name, id, quizAverage, homeworkAverage, overallAverage);
    }
}
