package HW_3;

import java.util.ArrayList;

public class FamilyTree {

    private ArrayList<Node> branches = new ArrayList<>();

    enum Type {
        father, mother, son, daughter, brother, sister, husband, spouse
    }

    class Node {

        FamilyMember who;
        Type outcome;
        FamilyMember forWhom;

        public Node(FamilyMember who, Type outcome, FamilyMember forWhom) {
            this.who = who;
            this.outcome = outcome;
            this.forWhom = forWhom;
        }

        public Node(Type outcome, FamilyMember forWhom) {
            this.who = null;
            this.outcome = outcome;
            this.forWhom = forWhom;
        }

        public Node(FamilyMember who, Type outcome) {
            this.who = who;
            this.outcome = outcome;
            this.forWhom = null;
        }

        public String toString() {
            return String.format("<%s %s %s>", who, outcome, forWhom);
        }
    }

    public ArrayList<Node> getBranches() {
        return branches;
    }

    public void addNode(FamilyMember who, Type outcome, FamilyMember forWhom) {
        branches.add(new Node(who, outcome, forWhom));
    }
}