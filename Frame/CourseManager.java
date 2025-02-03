import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private static List<Course> courses = new ArrayList<>();

    public static void addCourse(String name, String amount) {
        courses.add(new Course(name, amount));
    }

    public static List<Course> getCourses() {
        return courses;
    }

    public static String getTotalAmount() {
        int total = 0;
        for (Course course : courses) {
            total += Integer.parseInt(course.amount.replace("/-", "").trim());
        }
        return total + "/-"; 
    }
}

class Course {
    String name;
    String amount;

    public Course(String name, String amount) {
        this.name = name;
        this.amount = amount;
    }
}