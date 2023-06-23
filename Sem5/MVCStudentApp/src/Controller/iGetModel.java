package Controller;

import Model.Student;

import java.util.List;
import java.util.Map;

// интерфейс отвечающий за действия соединения с базой данных(Model)
public interface iGetModel {
   // public List<Student1> getAllStudent();
   Map<Long,Student> getAllHashMapStudent();

  String deleteStudentBuyID();


}
