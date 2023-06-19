package StudentDomen;

import java.util.List;

public class AverageAge<Worker extends Person> {
    public double averAge(List<Worker> var) {
        double sum = 0;
        for (Worker age : var) {
            sum += age.getAge();
        }
        return sum / var.size();
    }
}
