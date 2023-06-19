package Services;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Teacher;

public class TeacherService implements iPersonService<Teacher> {
    private int count;
    private String acadDegree;
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }
    
    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, String secondName, int age) {
        Teacher tutor = new Teacher(firstName, secondName, age, acadDegree, count);
        count++;
        teachers.add(tutor);
    }
}
