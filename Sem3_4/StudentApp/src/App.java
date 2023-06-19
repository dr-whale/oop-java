import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import StudentDomen.AverageAge;
import StudentDomen.Emploee;
import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentSteam;
import StudentDomen.Teacher;

public class App {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Алексей", "Сидоров", 19, 12));
        students.add(new Student("Екатерина", "Иванова", 22, 8));
        students.add(new Student("Андрей", "Петров", 20, 5));
        students.add(new Student("Мария", "Смирнова", 21, 2));
        students.add(new Student("Дмитрий", "Чернов", 19, 9));

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Александр", "Соколов", 30, "Преподаватель", 12));
        teachers.add(new Teacher("Анна", "Павлова", 35, "Кандидат наук", 5));
        teachers.add(new Teacher("Михаил", "Иванов", 38, "Степень 2", 8));
        teachers.add(new Teacher("Елена", "Козлова", 31, "Преподаватель", 19));
         
        List<Emploee> emploees = new ArrayList<>();
        emploees.add(new Emploee("Елена", "Петрова", 51, "Администратор", 9));
        emploees.add(new Emploee("Алексей", "Соколов", 29, "Библиотекарь", 12));
        emploees.add(new Emploee("Михаил", "Иванов", 42, "Охранник", 7));
        emploees.add(new Emploee("Александр", "Семенов", 45, "Исследователь", 10));

        AverageAge<Student> studentAverageAge = new AverageAge<>();
        double averageAgeStudents = studentAverageAge.averAge(students);
        System.out.println("Средний возраст студента: " + averageAgeStudents);

        AverageAge<Teacher> teacherAverageAge = new AverageAge<>();
        double averageAgeTeachers = teacherAverageAge.averAge(teachers);
        System.out.println("Средний возраст учителя: " + averageAgeTeachers);

        AverageAge<Emploee> emploeeAverageAge = new AverageAge<>();
        double averageAgeEmploees = emploeeAverageAge.averAge(emploees);
        System.out.println("Средний возраст сотрудника: " + averageAgeEmploees);


        /*
        Student s1 = new Student("Мария", "Иванова", 21, 12);
        Student s2 = new Student("Алексей", "Смирнов", 19, 3);
        Student s3 = new Student("Екатерина", "Петрова", 20, 6);
        Student s4 = new Student("Дмитрий", "Соколов", 23, 9);
        Student s5 = new Student("Анна", "Попова", 22, 2);
        Student s6 = new Student("Илья", "Морозов", 19, 5);
        Student s7 = new Student("Анастасия", "Васильева", 18, 7);
        Student s8 = new Student("Максим", "Лебедев", 22, 8);
        Student s9 = new Student("Ольга", "Козлова", 20, 11);

        List<Student> studentList1 = new ArrayList<>();
        List<Student> studentList2 = new ArrayList<>();
        List<Student> studentList3 = new ArrayList<>();

        studentList1.add(s1);studentList2.add(s4);studentList3.add(s7);
        studentList1.add(s2);studentList2.add(s5);studentList3.add(s8);
        studentList1.add(s3);studentList2.add(s6);studentList3.add(s9);

        StudentGroup group1 = new StudentGroup(studentList1, 1);
        StudentGroup group2 = new StudentGroup(studentList2, 2);
        StudentGroup group3 = new StudentGroup(studentList3, 3);

        List<StudentGroup> groupList1 = new ArrayList<>();
        List<StudentGroup> groupList2 = new ArrayList<>();
        List<StudentGroup> groupList3 = new ArrayList<>();

        groupList1.add(group3);
        groupList2.add(group2);
        groupList2.add(group1);
        groupList3.add(group2);
        groupList3.add(group3);
        groupList3.add(group3);

        StudentSteam steam1 = new StudentSteam(2,groupList3);
        StudentSteam steam2 = new StudentSteam(3,groupList2);
        StudentSteam steam3 = new StudentSteam(1,groupList1);

        List<StudentSteam> steamList = new ArrayList<>();

        steamList.add(steam1);
        steamList.add(steam2);
        steamList.add(steam3);

        Collections.sort(steamList);
        Collections.sort(groupList1);
        Collections.sort(groupList2);
        Collections.sort(groupList3);

        for (StudentSteam s :steamList) {
            System.out.println(s.getGroup().size());
            for (StudentGroup g :s) {
                System.out.println(g);
            }
        }
        */
    }
}
