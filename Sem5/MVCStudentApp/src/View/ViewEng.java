package View;

import Controller.iGetView;
import Model.Student;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
// создать клась в англоязычной вьюшкой
public class ViewEng implements iGetView {
    public void printAllStudent(Map<Long,Student> s){
        System.out.println("------List students------");
        for (Map.Entry<Long, Student> longStudent1Entry : s.entrySet()) {
            System.out.println(longStudent1Entry);
        }
        System.out.println("------End list------");

    }

    @Override
    public String prompt(String massage) {
        Scanner in = new Scanner(System.in);
        System.out.println(massage);
        return in.nextLine();
    }
}
