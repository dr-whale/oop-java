package Controllers;

import StudentDomen.Teacher;
import Services.TeacherService;

public class TeacherController implements iPersonController<Teacher> {
    private final TeacherService tService = new TeacherService();

    @Override
    public void create(String firstName, String secondName, int age) {
        tService.create(firstName,secondName,age);
    }    
}
