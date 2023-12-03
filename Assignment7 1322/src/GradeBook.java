import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class GradeBook {
    private LinkedList<Student> students;

    public GradeBook(String filename) {
        students = new LinkedList<>();
        try {
            Scanner scanner = new Scanner(new File(filename));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Student student = new Student(line);
                students.add(student);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Student getStudent(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    public void getStudentGrade(String name) {
        Student student = getStudent(name);
        if (student != null) {
            System.out.println(student.getGrade());
        }
    }

    public LinkedList<String> getAllStudentNames() {
        LinkedList<String> names = new LinkedList<>();
        for (Student student : students) {
            names.add(student.getName());
        }
        return names;
    }
}
