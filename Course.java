import java.util.ArrayList;

public class Course {

    public int id;
    public static ArrayList<Course> courseList = new ArrayList<>();
    public String title;
    public int units;

    public Course(String title, int units) {
        this.title = title;
        this.units = units;

        courseList.add(this);
        id = courseList.size();
    }

    public static Course findById(int ID) {
        return courseList.get(ID - 1);
    }
}
