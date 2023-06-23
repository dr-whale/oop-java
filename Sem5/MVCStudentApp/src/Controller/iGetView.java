package Controller;

import Model.Student;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

// интерфейс отвечающий за действия соединения с вьющкой(View)
public interface iGetView {
    void printAllStudent(Map<Long,Student> student1s);

    String prompt(String massage);
}
