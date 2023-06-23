package Model;

import java.util.List;
import java.util.Map;

import Controller.iGetModel;

public class Model implements iGetModel {
    private List<Student> studentList;
    public Model(List<Student> student1List){
        this.studentList = student1List;
    }

    @Override
    public Map<Long, Student> getAllHashMapStudent() {
        return null;
    }

    @Override
    public String deleteStudentBuyID() {
return null;
    }
}