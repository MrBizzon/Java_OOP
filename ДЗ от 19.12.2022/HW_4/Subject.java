package HW_4;

public class Subject implements Comparable<Subject> {
    private final String firstName;
    private final String surName;
    private final Integer age;
    private final Sex sex;

    public Subject(String firstName, String surName, Integer birthDate, Sex sex) {
        this.firstName = firstName;
        this.surName = surName;
        this.age = birthDate;
        this.sex = sex;
    }

    public String getFirstname() {
        return this.firstName;
    }

    public String getSurname() {
        return this.surName;
    }

    public Integer getAge() {
        return this.age;
    }

    public Sex getSex() {
        return this.sex;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", firstName, surName, age, sex);
    }

    @Override
    public int compareTo(Subject o) {
        return this.getAge() - o.getAge();
    }
}