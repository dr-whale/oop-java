package Model;

import Controller.iGetModel;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashModel implements iGetModel {
    Map<Long, Student> studentMap = new HashMap<>();

    public HashModel(Map<Long, Student> student1Map) {
        this.studentMap = student1Map;
    }

    @Override
    public Map<Long, Student> getAllHashMapStudent() {
        return studentMap;
    }
// метод deleteStudentBuyID удалят выбранный объект пользователем по id и если такого нет в наличии выводит
// соответсвующее обьявление
    @Override
    public String deleteStudentBuyID() {
        System.out.println("Enter id:");
        Scanner scanner = new Scanner(System.in);
        Long id = scanner.nextLong();
        if (studentMap.containsKey(id)) {
            studentMap.remove(id);
            System.out.println("You delete is:" + id);
        } else {
            System.out.println("No this id!!!");
        }
        System.out.println("Enter the command:");
        return scanner.nextLine();
    }
}
