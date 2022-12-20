package HW_4;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    FamilyMember branch = new FamilyMember();
    List<Subject> society = new ArrayList<Subject>();
    Subject relative1 = new Subject("Иван", "Семенов", 30, Sex.Мужчина);
    Subject relative2 = new Subject("Мария", "Васильева", 27, Sex.Женщина);
    Subject relative3 = new Subject("Сергей", "Громов", 57, Sex.Мужчина);
    Subject relative4 = new Subject("Нина", "Васина", 50, Sex.Женщина);
    Subject relative5 = new Subject("Василий", "Семенов", 29, Sex.Мужчина);
    Subject relative6 = new Subject("Семен", "Васильев", 19, Sex.Мужчина);
    Subject relative7 = new Subject("Анна", "Брызгунова", 86, Sex.Женщина);
    Subject relative8 = new Subject("Олег", "Зубарев", 3, Sex.Мужчина);

    society.add(relative1);
    society.add(relative2);
    society.add(relative3);
    society.add(relative4);
    society.add(relative5);
    society.add(relative6);
    society.add(relative7);
    society.add(relative8);

    branch.addAddiction(relative1, relative2, Interrelation.муж, Interrelation.жена);
    branch.addAddiction(relative1, relative3, Interrelation.отец, Interrelation.отец);
    branch.addAddiction(relative1, relative8, Interrelation.отец, Interrelation.отец);
    branch.addAddiction(relative1, relative4, Interrelation.мать, Interrelation.отец);
    branch.addAddiction(relative1, relative5, Interrelation.брат, Interrelation.брат);
    branch.addAddiction(relative1, relative6, Interrelation.брат, Interrelation.брат);
    branch.addAddiction(relative1, relative7, Interrelation.внук, Interrelation.бабушка);

    branch.addAddiction(relative5, relative8, Interrelation.дядя, Interrelation.племянник);
    branch.addAddiction(relative6, relative8, Interrelation.дядя, Interrelation.племянник);

    branch.addAddiction(relative2, relative8, Interrelation.мать, Interrelation.отец);

    branch.addAddiction(relative8, relative3, Interrelation.внук, Interrelation.дедушка);

    System.out.println(society);

    System.out.println("\n");
    Search.getRelation(relative8, branch);
    System.out.println("\n");
    System.out.println(branch.getRelationship());

  }
}