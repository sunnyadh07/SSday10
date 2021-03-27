import java.sql.SQLOutput;
import java.util.ArrayList;

public class BiologyClassroom implements Classroom{
    private String classroomName;
    private ArrayList<Student> students;

    @Override
    public String addStudent() {
        return addStudent() + "has been added.";
    }

    @Override
    public String removeStudent(int id) {
        return null;
    }
}
