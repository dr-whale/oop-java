package Model;

public class Student extends Person /*implements Comparable<Student1>*/ {
    public Student(String firstName, String secondName, int age) {
        super(firstName, secondName, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", age=" + super.getAge() +
                '}';
    }
    // переопределим метод compareTo интерфейса Comparable для сортировки по studentId
//    @Override
//    public int compareTo(Student1 o) {
//        return (int) (this.studentId1 - o.studentId1);
//    }
}
