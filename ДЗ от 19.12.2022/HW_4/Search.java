package HW_4;

import java.util.Iterator;
import java.util.List;

public class Search {
    public static void getRelation(Subject person, Relation relation, FamilyMember tree) {
        List<Addiction> elements = tree.getRelationship();
        Iterator<Addiction> iterator = elements.iterator();
        while (iterator.hasNext()) {
            Addiction comparable = iterator.next();
            if (comparable.getPerson().getFirstname().equals(person.getFirstname())
                    && comparable.getPerson().getFirstname().equals(person.getFirstname())
                    && comparable.getRelation() == relation) {
                System.out.println(comparable);
            }
        }
    }

    public static void getRelation(Relation relation, FamilyMember tree) {
        List<Addiction> elements = tree.getRelationship();
        Iterator<Addiction> iterator = elements.iterator();
        while (iterator.hasNext()) {
            Addiction comparable = iterator.next();
            if (comparable.getRelation() == relation) {
                System.out.println(comparable);
            }
        }
    }

    public static void getRelation(Subject person, FamilyMember tree) {
        List<Addiction> elements = tree.getRelationship();
        Iterator<Addiction> iterator = elements.iterator();
        while (iterator.hasNext()) {
            Addiction comparable = iterator.next();
            if (comparable.getPerson().getFirstname().equals(person.getFirstname())
                    && comparable.getPerson().getSurname().equals(person.getSurname())) {
                System.out.println(comparable);
            }
        }
    }
}