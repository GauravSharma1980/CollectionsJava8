package com.immutableclass;

public final class ImmutableStudent {

    private final int id;
    private final String name;

    public Age getAge() {
        Age cloneAge = new Age();
        cloneAge.setYear(this.age.getYear());
        cloneAge.setMonth(this.age.getMonth());
        cloneAge.setDay(this.age.getDay());
        return cloneAge;
    }

    private final Age age;


    /*public ImmutableStudent(int id, String name,Age age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }*/

    public ImmutableStudent(int id, String name,Age age) {
        this.name = name;
        this.id = id;
        Age cloneAge = new Age();
        cloneAge.setYear(age.getYear());
        cloneAge.setDay(age.getDay());
        cloneAge.setMonth(age.getMonth());
        this.age = cloneAge;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {

        Age age = new Age();
        age.setDay(1);
        age.setMonth(1);
        age.setYear(1992);
        ImmutableStudent student = new ImmutableStudent(1, "Alex", age);

        System.out.println("Alex age year before modification = " + student.getAge().getYear());
        age.setYear(1993);
        System.out.println("Alex age year after modification = " + student.getAge().getYear());

        student.getAge().setYear(2000);
        System.out.println("again there is a change"+student.getAge().getYear());

    }
}