import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student carolina = new Student(34, "Carolina", "ljfsdk");
        ArrayList<Student> biologyStudents = new ArrayList<>();
        biologyStudents.add(carolina);

        BiologyClassroom biologyClass = new BiologyClassroom("Biology",biologyStudents);
        biologyStudents.remove(Integer.valueOf(34));{
            System.out.println("Student has been removed");
        }

    }
}
