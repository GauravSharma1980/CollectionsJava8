package com.readings;

interface EmployeeEmpty {
    Employee get();
}

interface EmployeeWithName {
    Employee get(String name);
}


public class Employee {

    private String name;

    Employee() {
        System.out.println("Empty Constructor");
    }

    Employee(String name) {
        System.out.println("Name Constructor");
        this.name = name;
    }

    public String toString() {
        return "name: " + name;
    }

    public static void main(String[] args) {

        EmployeeEmpty empEmpty = Employee::new;

        System.out.println("Constructor isn't called yet");
        System.out.println(empEmpty.get());

        EmployeeWithName employeeWithName = Employee::new;

        System.out.println("Secon try...."+employeeWithName.get("gaurav"));

    }
}
