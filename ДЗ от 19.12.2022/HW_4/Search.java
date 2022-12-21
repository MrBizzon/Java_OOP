package HW_4;

import java.util.Iterator;
import java.util.List;

public class Search {
    public static void getRelation(Subject subject, Interrelation relation, FamilyMember tree) {
        List<Addiction> value = tree.getAddiction();
        Iterator<Addiction> cursor = value.iterator();
        while (cursor.hasNext()) {
            Addiction comparable = cursor.next();
            if (comparable.getAddiction().getFirstname().equals(subject.getFirstname())
                    && comparable.getAddiction().getFirstname().equals(subject.getFirstname())
                    && comparable.getRelation() == relation) {
                System.out.println(comparable);
            }
        }
    }

    public static void getRelation(Interrelation relation, FamilyMember tree) {
        List<Addiction> value = tree.getAddiction();
        Iterator<Addiction> cursor = value.iterator();
        while (cursor.hasNext()) {
            Addiction comparable = cursor.next();
            if (comparable.getRelation() == relation) {
                System.out.println(comparable);
            }
        }
    }

    public static void getRelation(Subject subject, FamilyMember tree) {
        List<Addiction> value = tree.getAddiction();
        Iterator<Addiction> cursor = value.iterator();
        while (cursor.hasNext()) {
            Addiction comparable = cursor.next();
            if (comparable.getAddiction().getFirstname().equals(subject.getFirstname())
                    && comparable.getAddiction().getSurname().equals(subject.getSurname())) {
                System.out.println(comparable);
            }
        }
    }
}