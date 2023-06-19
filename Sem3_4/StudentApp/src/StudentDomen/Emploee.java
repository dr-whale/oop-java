package StudentDomen;

public class Emploee extends Person{
    private String special;
    private int id;

    public Emploee(String firstName, String secondName, int age, String special, int id) {
        super(firstName, secondName, age);
        this.special = special;
        this.id = id;
    }
}
