package com.javalesson.domainmodel;

public class Employee {
    private static int id;
    private int employeeId;
    private String name;
    private String position;
    private int salary;
    private String department;


   public Employee(){// название конструктора должно совпадать с классом, если с мал буквы иначе ругается что метод
//        //а методы нельзя называть как класс
//        // этот конструктор называется дефолтным
       this ("А","B", 1);
       System.out.println("Empty construstor called");
    }

    public Employee(String name, String position, int salary) {
        this (name,position,salary, "IT");
        System.out.println("Constructor with 3 params called");
    }

    public Employee(String name, String position, int salary, String department) {
       employeeId=id++;
       this.name = name;
       this.position = position;
       this.salary = salary;
       this.department = department;
        System.out.println("Constructor with 4 params called");
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Employee.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override //сгенерировать как гет и сет
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
