package HW_4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FamilyMember implements Comparator<Subject> {
    private List<Addiction> connection = new ArrayList<>();

    public List<Addiction> getAddiction() {
        return connection;
    }

    public void setAddiction(List<Addiction> connections) {
        this.connection.addAll(connections);
    }

    public void addAddiction(Subject subject1, Subject subject2, Interrelation relation1, Interrelation relation2) {
        this.connection.add(new Addiction(subject1, subject2, relation1));
        this.connection.add(new Addiction(subject2, subject1, relation2));
    }

    @Override
    public int compare(Subject o1, Subject o2) {
        return o1.getAge() - o2.getAge();
    }
}