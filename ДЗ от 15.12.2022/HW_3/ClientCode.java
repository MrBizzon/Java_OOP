package HW_3;

import HW_3.FamilyTree.Type;

public class ClientCode {
  public static void main(String[] args) {

    var varvara = new FamilyMember("Варвара Грицацуева");
    var vasisualiy = new FamilyMember("Васисуалий Лоханкин");
    var semen = new FamilyMember("Семён Лоханкин");
    var vasilisa = new FamilyMember("Василиса Лоханкина");
    var elizaveta = new FamilyMember("Елизавета Лоханкина");

    FamilyTree familytree = new FamilyTree();

    familytree.addNode(varvara, Type.spouse, vasisualiy);
    familytree.addNode(semen, Type.son, vasisualiy);
    familytree.addNode(vasilisa, Type.daughter, vasisualiy);
    familytree.addNode(elizaveta, Type.daughter, vasisualiy);

    LearningTree child = new LearningTree(familytree);
    System.out.println(Conclusion.Member(child.findAll(vasisualiy, Type.son)) + (char) 27 + "[33m");
    System.out.println(Conclusion.Member(child.findAll(vasisualiy, Type.daughter)) + (char) 27 + "[35m");
  }
}