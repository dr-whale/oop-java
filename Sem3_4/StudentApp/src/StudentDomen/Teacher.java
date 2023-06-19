package StudentDomen;

public class Teacher extends Person{
    private String acadDegree;
    private int id;
    public Teacher(String firstName, String secondName, int age, String acadDegree, int id) {
        super(firstName, secondName, age);
        this.acadDegree = acadDegree;
        this.id = id;
    }
}
