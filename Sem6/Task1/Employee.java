import java.util.Date;

public class Employee {
    private String name;
    private Date dob;
    private int baseSalary;

    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }

    // Добавлен новый класс для расчета чистой зарплаты (net salary)
    public class SalaryCalculator {
        public int calculateNetSalary() {
            int tax = (int) (baseSalary * 0.25);
            return baseSalary - tax;
        }
    }
}
