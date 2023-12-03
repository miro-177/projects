import java.util.ArrayList;
public class MainQ3 {
    public static void main(String[] args) {
        ArrayList<String> completedCourses = classesTaken();

        DegreeWorks dw = new DegreeWorks("CS", completedCourses);
        dw.leftToTake();
    }
    public static ArrayList<String> classesTaken() {
        ArrayList<String> courses = new ArrayList<String>();
        courses.add("CSE1321");
        courses.add("CSE1321L");
        return courses;

    }
}