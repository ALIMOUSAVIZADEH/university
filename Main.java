
public class Main {
    public static void main(String[] args) {

        Major major1 = new Major("mathematics", 40);
        Major major2 = new Major("computerscience", 45);

        Person person1 = new Person("Ahmad", "40313053");
        Person person2 = new Person("Behrooz", "40312365");
        Person person3 = new Person("Tannaz", "40312047");
        Person person4 = new Person("Ali", "40312046");
        Person person5 = new Person("Hashem", "40312050");

        Student students[] = new Student[3];
        students[0] = new Student(person1.id, 1399, 1);
        students[1] = new Student(person2.id, 1398, 1);
        students[2] = new Student(person3.id, 1397, 2);

        for (int i = 0; i < 3; i++) {
            if (Person.findById(students[i].personID) != null) {
                students[i].name = Person.findById(students[i].personID).name;
            } else {
                System.out.println("This person hasn't been existed.");
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Name: " + students[i].name + " -- Student Code: " + students[i].studentID);
        }

        System.out.println();

        Professor professor1 = new Professor(4, 1);
        Professor professor2 = new Professor(5, 2);

        String nameOfProfessor1 = "";
        String nameOfProfessor2 = "";

        if (Person.findById(professor1.personID) != null) {
            nameOfProfessor1 = Person.findById(professor1.personID).name;
        } else {
            nameOfProfessor1 = "This person hasn't been existed.";
        }
        if (Person.findById(professor2.personID) != null) {
            nameOfProfessor2 = Person.findById(professor2.personID).name;
        } else {
            nameOfProfessor2 = "This person hasn't been existed.";
        }

        String professorId1 = String.valueOf(professor1.id);
        String professorId2 = String.valueOf(professor2.id);

        System.out.println("Name: " + nameOfProfessor1 + " -- Professor ID: " + professorId1);
        System.out.println("Name: " + nameOfProfessor2 + " -- Professor ID: " + professorId2);
        System.out.println();

        Course course1 = new Course("ds", 3);
        Course course2 = new Course("bp", 3);
        Course course3 = new Course("ap", 3);

        PresentedCourse presentedCourse1 = new PresentedCourse(1, 1, 40);
        PresentedCourse presentedCourse2 = new PresentedCourse(2, 1, 28);
        PresentedCourse presentedCourse3 = new PresentedCourse(3, 2, 53);

        presentedCourse1.addStudent(1);
        presentedCourse1.addStudent(2);

        for (int i = 1; i < 4; i++) {
            presentedCourse2.addStudent(i);
        }

        presentedCourse3.addStudent(3);
        for (int i = 0; i < 3; i++) {
            students[i].transcript = new Transcript(i+1);
        }

        students[0].transcript.setGrade(1, 19);
        students[0].transcript.setGrade(2, 17.75);

        students[1].transcript.setGrade(1, 15);
        students[1].transcript.setGrade(2, 18);

        students[2].transcript.setGrade(2, 11);
        students[2].transcript.setGrade(3, 14.4);
        for (int i = 0; i < 3; i++) {
            students[i].transcript.printTranscript();
            System.out.println("gpa: " + students[i].transcript.grtGPA());
            System.out.println();
        }
        
        System.out.println();
    }
}