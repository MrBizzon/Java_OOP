package HW_4;

public class Addiction {
    private Subject subject1;
    private Subject subject2;
    private Interrelation relation;

    public Addiction(Subject subject1, Subject subject2, Interrelation relation) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.relation = relation;
    }

    public Subject getAddiction() {
        return this.subject1;
    }

    public Subject getRelationAddiction() {
        return this.subject2;
    }

    public Interrelation getRelation() {
        return relation;
    }

    @Override
    public String toString() {
        return String.format("%s это %s для %s", this.subject1.getFirstname() + " " + this.subject1.getSurname(),
                this.relation, this.subject2.getFirstname() + " " + this.subject2.getSurname());
    }
    

}