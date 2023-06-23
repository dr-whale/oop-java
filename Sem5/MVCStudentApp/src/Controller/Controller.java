package Controller;

import Model.Model;
import Model.Student;
import View.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// создадим класс инструмент контролирующий работу всей логики
public class Controller {
private iGetView view;
private iGetView viewEng;
private iGetModel model;
private Map<Long,Student> students;

    public Controller(iGetView viewEng, iGetModel model) {
        this.viewEng = viewEng;
        this.model = model;
    }

    public static Controller getviewEng(iGetView viewEng,iGetModel model){
        return new Controller(viewEng,model);
    }
    public void getAllStudent(){
        students = model.getAllHashMapStudent();
    }
    // тестируем полон лист или нет
    public boolean testData(){
        if(students.size() > 0){
            return true;
        }else {
            return false;
        }
    }
    // соеденяем вьюшку(View) с баззой данных(Model) способами: MVP и MVC
    public void update(){
        //MVP
        getAllStudent();
        if (testData()){
            viewEng.printAllStudent(students);
        }
        else {
            System.out.println("Список студентов пуст!");
        }
        //MVC
        //view.pritnAllStudent(model.getAllStudents());
    }

    public void updateEngl(){
        //MVP
        getAllStudent();
        if (testData()){
            viewEng.printAllStudent(students);
        }
        else {
            System.out.println("List student is empty!");
        }
        //MVC
        //view.pritnAllStudent(model.getAllStudents());
    }

       // метод запроса ввода данных пользователем
    public void run()
    {
        Commands com = Commands.NONE;
        boolean getNewIteration = true;
        while (getNewIteration) {
            String command = viewEng.prompt("Enter the command:");
            com = Commands.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                    getNewIteration = false;
                    System.out.println("Exit the program!");
                    break;
                case LIST:
                    getAllStudent();
                    viewEng.printAllStudent(students);
                    break;
                case DELETE:
                    model.deleteStudentBuyID();
                    viewEng.printAllStudent(students);
                    break;
            }
        }
    }
}
