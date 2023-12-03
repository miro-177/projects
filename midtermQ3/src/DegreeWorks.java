import java.util.ArrayList;
public class DegreeWorks {
    private ArrayList<String> required;
    private ArrayList<String> completed;
    public DegreeWorks(String major, ArrayList<String> passedCourses) {
        required = new ArrayList<String>();
        completed = passedCourses;
        if (major.equals("CS")) {
            cs();
        } else if (major.equals("IT")) {
            it();
        }
    }
    private void cs() {
        required.add("CSE1321");
        required.add("CSE1321L");
        required.add("CSE1322");
        required.add("CSE1322L");
        required.add("CS3305");
    }
    private void it() {
        required.add("CSE1321");
        required.add("CSE1321L");
        required.add("IT1114");
    }
    public void leftToTake() {
        for (String course : required) {
            if (!completed.contains(course)) {
                System.out.println("Must take:" + course);
            }
        }
    }
}

