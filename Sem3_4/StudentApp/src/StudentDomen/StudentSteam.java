package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup>, Comparable<StudentSteam> {
    private int idStream;
    private List<StudentGroup> group;

    public StudentSteam(int idStream, List<StudentGroup> group) {
        this.idStream = idStream;
        this.group = group;
    }

    public List<StudentGroup> getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "StudentSteam{" +
                "numberSteam='" + idStream + '\'' +
                ", groups=" + group +
                '}';
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            public int current = 0;

            @Override
            public boolean hasNext() {
                return current < group.size();
            }

            @Override
            public StudentGroup next() {
                if (!hasNext()) {
                    return null;
                }
                return group.get(current++);
            }

        };
    }

    @Override
    public int compareTo(StudentSteam o) {
         return group.size() - o.group.size();
    }
}