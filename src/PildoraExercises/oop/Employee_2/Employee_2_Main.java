package PildoraExercises.oop.Employee_2;

import java.util.Date;
import java.util.GregorianCalendar;

class Employee {
    //attributes
    private String name;
    private double salary;
    private Date endContract;
    //constructor

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        endContract = calendar.getTime();
    }

    //methods

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Date getEndContract() {
        return endContract;
    }

    public double increaseSalary(double percentage) {
        double increase = salary * percentage / 100;
        double newSalary = increase;
        return newSalary;
    }
}

public class Employee_2_Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Daniela", 60000, 2020, 4, 12);
        Employee employee2 = new Employee("Patrick", 50000, 2021, 6, 15);

    }
}
