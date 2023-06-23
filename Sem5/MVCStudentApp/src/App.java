import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.FileModel;
import Model.HashModel;
import Model.Model;
import Model.Student;
import View.View;
import View.ViewEng;

public class App {
    public static void main(String[] args) throws Exception {

        Map<Long,Student> student1Map = new HashMap<>();
        student1Map.put(1L,new Student("Ivan", "Orlov", 18));
        student1Map.put(2L,new Student("Kirill", "Petrov", 20));
        student1Map.put(3L,new Student("Tomara", "Smirnova", 21));
        student1Map.put(4L,new Student("Sergey", "Shport", 19));
        student1Map.put(5L,new Student("Inna", "Cheichuk", 18));

        // создаем текстовый файл
        //FileModel fileModel = new FileModel("StudentDBEnglHashMap.txt");
        //fileModel.saveAllStudentToFile(student1Map);

        // создаем прямое подключение к интерфейсу
        //iGetModel newFModel = fileModel;

        iGetModel model = new HashModel(student1Map);
        //iGetView view = new View();
        iGetView viewEng = new ViewEng();


        // запускаем новый подключенный файл через подключенный интерфейс
        Controller controller = Controller.getviewEng(viewEng,model);

        // запускаем контроллер
       // controller.updateEngl();

        // запускаем введение данных пользователем
        controller.run();
    }
}
