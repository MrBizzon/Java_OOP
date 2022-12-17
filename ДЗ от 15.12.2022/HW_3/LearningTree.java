package HW_3;

import java.util.ArrayList;

public class LearningTree {
  ArrayList<FamilyTree.Node> tree;

  public LearningTree(FamilyTree famTree) {
    tree = famTree.getBranches();
  }

  public ArrayList<FamilyMember> findAll(FamilyMember whose, FamilyTree.Type re) {
    ArrayList<FamilyMember> result = new ArrayList<>();
    for (FamilyTree.Node t : tree) {
      if (t.forWhom.getFullName() == whose.getFullName() && t.outcome == re) {
        result.add(t.who);
      }
    }
    return result;
  }
}