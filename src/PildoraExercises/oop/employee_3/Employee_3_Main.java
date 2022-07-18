package PildoraExercises.oop.employee_3;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee_3_Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
                new Employee("Sebastian", 55000, 2019, 5, 22),
                new Employee("Martina",
                        65000, 2020, 6, 17),
                new Employee("Carol", 70000, 2021, 10, 25),
                new Employee("Bob", 75000, 2022, 3,
                        28)};
        for (Employee employee : employees) {
            System.out.println("Name: " + employee.getName() + "\nSalary: " + employee.getSalary() + "\nEnd contract " +
                    "date: " + employee.getEndContract() + "\nFinal Salary: " + employee.finalSalary(5));
            System.out.println();
        }
    }
}

class Employee {
    private String name;
    private double salary;
    private Date endContract;

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Date getEndContract() {
        return endContract;
    }

    public double finalSalary(double percentage) {
        double increase = salary * percentage / 100;
        double newSalary = salary + increase;
        double endSalary = newSalary;
        return endSalary;
    }

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year, month, day);
        endContract = calendar.getTime();
    }
}
