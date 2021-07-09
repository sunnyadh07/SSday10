import java.util.ArrayList;

public class ChemistryClassrooms implements Classroom{
    private String classroomName;
    private ArrayList<Student> students;

    public ChemistryClassrooms(String classroomName, ArrayList<Student> students) {
        this.classroomName = classroomName;
        this.students = students;
    }

    public String getClassroomName() {
        return classroomName;
    }

    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String addStudent() {
        return null;
    }

    @Override
    public String removeStudent(int id) {

        return null;
    }
}
