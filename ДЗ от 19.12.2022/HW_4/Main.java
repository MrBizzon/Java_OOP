package HW_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    FamilyMember tree = new FamilyMember();
    List<Subject> people = new ArrayList<Subject>();
    Subject human1 = new Subject("Name1", "Surname1", 30, Sex.MALE);
    Subject human2 = new Subject("Name2", "Surname2", 27, Sex.FEMALE);
    Subject human3 = new Subject("Name3", "Surname3", 57, Sex.MALE);
    Subject human4 = new Subject("Name4", "Surname4", 50, Sex.FEMALE);
    Subject human5 = new Subject("Name5", "Surname5", 29, Sex.MALE);
    Subject human6 = new Subject("Name6", "Surname6", 19, Sex.MALE);
    Subject human7 = new Subject("Name7", "Surname7", 86, Sex.FEMALE);
    Subject human8 = new Subject("Name8", "Surname8", 3, Sex.MALE);

    people.add(human1);
    people.add(human2);
    people.add(human3);
    people.add(human4);
    people.add(human5);
    people.add(human6);
    people.add(human7);
    people.add(human8);

    tree.addAddiction(human1, human2, Interrelation.HUSBAND, Interrelation.WIFE);
    tree.addAddiction(human1, human3, Interrelation.SON, Interrelation.FATHER);
    tree.addAddiction(human1, human8, Interrelation.FATHER, Interrelation.SON);
    tree.addAddiction(human1, human4, Interrelation.MOTHER, Interrelation.SON);
    tree.addAddiction(human1, human5, Interrelation.BROTHER, Interrelation.BROTHER);
    tree.addAddiction(human1, human6, Interrelation.BROTHER, Interrelation.BROTHER);
    tree.addAddiction(human1, human7, Interrelation.GRANDSON, Interrelation.GRANDMA);

    tree.addAddiction(human5, human8, Interrelation.UNCLE, Interrelation.NEPHEW);
    tree.addAddiction(human6, human8, Interrelation.UNCLE, Interrelation.NEPHEW);

    tree.addAddiction(human2, human8, Interrelation.MOTHER, Interrelation.SON);

    tree.addAddiction(human8, human3, Interrelation.GRANDSON, Interrelation.GRANDPA);

    System.out.println(people);

    Comparator agePeopleComparator = new FamilyMember();
    Collections.sort(people, agePeopleComparator);

    System.out.println(people);

    System.out.println("-------------------");
    // Search.getRelation(human8,tree);
    // System.out.println(tree.getRelationship());
    // Collections.sort(tree.);
    System.out.println("-------------------\n");

  }
}