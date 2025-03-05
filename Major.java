import java.util.ArrayList;

public class Major {

    public int id;
    public static ArrayList<Major> majorList = new ArrayList<>();
    public String name;
    public final int capacity;
    public int numberOfStudents = 0;

    public Major(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;

        majorList.add(this);
        id = majorList.size();
    }

    public static Major findById(int ID) {
        return majorList.get(ID - 1);
    }

    public void addStudent() {
        if(numberOfStudents < capacity)
            numberOfStudents++;
        else
            System.out.println("The capacity of the " + name + " major has been full.");
    }
}
