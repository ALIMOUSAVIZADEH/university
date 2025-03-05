import java.util.ArrayList;

public class PresentedCourse{

    public int id;
    public static ArrayList<PresentedCourse> presentedCoursesList = new ArrayList<>();
    public int courseID;
    public int professorID;
    public int capacity;
    public ArrayList<Integer> studentids;

    public PresentedCourse(int courseID, int professorID, int capacity) {
        this.courseID = courseID;
        this.professorID = professorID;
        this.capacity = capacity;

        studentids = new ArrayList<>(capacity);

        presentedCoursesList.add(this);
        id = presentedCoursesList.size();
    }

    public static PresentedCourse findById(int ID) {
        return presentedCoursesList.get(ID - 1);
    }

    public void addStudent(int studentID) {
        if (studentids.size() < capacity)
            studentids.add(studentID);
        else
            System.out.println("The course's capacity has been full.");
    }
}
