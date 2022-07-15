package PildoraExercises.oop.employee_1;

import java.util.*;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Carlos", 50_000, 2013, 5, 13);
        System.out.println("Name: " + employee.getName() + "\nSalary: " + employee.getSalary() + "\nEnd contract " +
                "date: "
                + employee.getEndContract() + "\nBase salary: " + employee.getSalary() + "\nSalary at the end of " +
                "contract " + employee.raiseSalary(5));
    }
}

class Employee {
    //attributes
    private String name;
    private double salary;
    private Date endContract;

    // constructor
    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        endContract = calendar.getTime();
    }

    //methods
    public String getName() { //getter
        return name;
    }

    public double getSalary() { //getter
        return salary;
    }

    public Date getEndContract() { //getter
        return endContract;
    }

    public double raiseSalary(double percentage) {
        double raise = salary * percentage / 100;
        double newSalary = salary + raise;
        return newSalary;
    }
}
