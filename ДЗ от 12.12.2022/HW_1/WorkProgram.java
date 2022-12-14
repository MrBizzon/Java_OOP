package HW_1;

import java.util.ArrayList;

public class WorkProgram {
  public static void main(String[] args) {
    var varvara = new Member("Варвара Грицацуева");
    var vasisualiy = new Member("Васисуалий Лоханкин");
    var vasilisa = new Member("Василиса Лоханкина");
    var elizaveta = new Member("Елизавета Лоханкина");
    var semen = new Member("Семён Лоханкин");
    GeoTree gt = new GeoTree();
    gt.append(varvara, vasisualiy);
    gt.append(varvara, vasilisa);
    gt.append(vasisualiy, elizaveta);
    gt.append(vasisualiy, semen);

    System.out.println(new Reserch(gt).spend(varvara, Relationship.parent));
  }

}

class Member {
  public String fullName;

  public Member(String fullName) {
    this.fullName = fullName;
  }

  public String getFullName() {
    return fullName;
  }

}

enum Relationship {
  parent, children
}

class Node {

  Member p1;
  Relationship outcome;
  Member p2;

  public Node(Member p1, Relationship outcome, Member p2) {
    this.p1 = p1;
    this.outcome = outcome;
    this.p2 = p2;
  }

  @Override
  public String toString() {
    return String.format("<%s %s %s>", p1, outcome, p2);
  }
}

class GeoTree {
  private ArrayList<Node> tree = new ArrayList<>();

  public ArrayList<Node> getTree() {
    return tree;
  }

  public void append(Member parent, Member child) {
    tree.add(new Node(parent, Relationship.parent, child));
    tree.add(new Node(child, Relationship.children, parent));
  }
}

class Reserch {
  ArrayList<Node> tree;

  public Reserch(GeoTree geoTree) {
    tree = geoTree.getTree();
  }

  public ArrayList<Member> spend(Member p, Relationship outcome) {
    ArrayList<Member> result = new ArrayList<>();
    for (Node t : tree) {
      if (t.p1.fullName == p.fullName && t.outcome == outcome) {
        result.add(t.p2);
      }
    }
    return result;
  }

}

class Printer {

  public static char[] Member(ArrayList<FamilyMember> findAll) {
    return null;
  }
}