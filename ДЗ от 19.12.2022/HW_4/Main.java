package HW_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    FamilyMember branch = new FamilyMember();
    List<Subject> society = new ArrayList<Subject>();
    Subject relative1 = new Subject("Иван", "Зубарев", 27, Sex.мужчина);
    Subject relative2 = new Subject("Екатерина", "Зубарева", 25, Sex.женщина);
    Subject relative3 = new Subject("Семен", "Бабенко", 99, Sex.мужчина);
    Subject relative4 = new Subject("Светлана", "Зубарева", 51, Sex.женщина);
    Subject relative5 = new Subject("Василий", "Бабенко", 77, Sex.мужчина);
    Subject relative6 = new Subject("Иван", "Бабенко", 75, Sex.мужчина);
    Subject relative7 = new Subject("Раиса", "Брызгунова", 75, Sex.женщина);
    Subject relative8 = new Subject("Олег", "Зубарев", 54, Sex.мужчина);
    Subject relative9 = new Subject("Михаил", "Брызгунов", 76, Sex.мужчина);
    Subject relative10 = new Subject("Лидия", "Зубарева", 75, Sex.женщина);
    Subject relative11 = new Subject("Виктор", "Зубарев", 78, Sex.мужчина);

    society.add(relative1);
    society.add(relative2);
    society.add(relative3);
    society.add(relative4);
    society.add(relative5);
    society.add(relative6);
    society.add(relative7);
    society.add(relative8);
    society.add(relative9);
    society.add(relative10);
    society.add(relative11);

    branch.addAddiction(relative1, relative2, Interrelation.брат, Interrelation.сестра);
    branch.addAddiction(relative1, relative3, Interrelation.правнук, Interrelation.прадед);
    branch.addAddiction(relative1, relative4, Interrelation.внучатыйПлемянник, Interrelation.мать);
    branch.addAddiction(relative1, relative5, Interrelation.брат, Interrelation.внучатыйДедушка);
    branch.addAddiction(relative1, relative7, Interrelation.внук, Interrelation.бабушка);
    branch.addAddiction(relative1, relative9, Interrelation.внук, Interrelation.дедушка);
    branch.addAddiction(relative1, relative10, Interrelation.внук, Interrelation.бабушка);
    branch.addAddiction(relative1, relative11, Interrelation.внук, Interrelation.дедушка);
    branch.addAddiction(relative1, relative8, Interrelation.сын, Interrelation.отец);
    branch.addAddiction(relative2, relative8, Interrelation.дочь, Interrelation.отец);
    branch.addAddiction(relative5, relative8, Interrelation.дядя, Interrelation.племянник);
    branch.addAddiction(relative6, relative8, Interrelation.дядя, Interrelation.племянник);
    branch.addAddiction(relative8, relative3, Interrelation.внук, Interrelation.дедушка);
    branch.addAddiction(relative8, relative10, Interrelation.сын, Interrelation.мать);
    branch.addAddiction(relative8, relative11, Interrelation.сын, Interrelation.отец);

    System.out.println(society);
    Comparator ageSocietyComparator = new FamilyMember();
    Collections.sort(society, ageSocietyComparator);
    System.out.println("\n");
    Search.getRelation(relative8, branch);
    System.out.println("\n");
    System.out.println(branch.getAddiction());

  }
}