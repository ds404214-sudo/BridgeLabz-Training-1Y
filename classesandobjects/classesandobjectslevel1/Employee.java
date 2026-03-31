package com.gla.classesandobjects.classesandobjectslevel1;

public class Employee {    String name;
    int id;
    double salary;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "Dinesh";
        e1.id = 101;
        e1.salary = 50000;

        e1.display();
    }
}
