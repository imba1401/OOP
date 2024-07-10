package com.javalesson.constructors;

import com.javalesson.domainmodel.Employee;

//import java.util.Date; // рекомендует пока использовать импорт с указанием конкретных классов, а так в исключ случаях import java.sql.*;

//import static java.lang.Math.*;

public class ConstructorsMain {
    public static void main(String[] args) {

//        Date date = new Date();
//        double sqrt = sqrt(4);
//        double sqrt1 = sqrt(9);
//        double sin = sin(0.235);

        Employee employee = new Employee();
        Employee employee2 = new Employee("Olga", "student developer", 100);
        Employee employee1 = new Employee("Iva", "student developer", 200);
        System.out.println(employee);
        System.out.println(employee1);


    }
}
