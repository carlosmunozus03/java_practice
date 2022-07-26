package PildoraExercises.oop.employee_5;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee_Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Steve", "Steve@cpn.com", 50000, 2021, 06, 23);
        System.out.println(emp1.finalSalary(5));
        Boss boss1 = new Boss("Roger", "roger@cpn.com", 100000, 2022, 6, 3);
        boss1.setBonus(500);
        System.out.println(boss1.finalSalary());
    }
}

class Employee {
    private String name;
    private String email;
    private double salary;
    private Date start_contract;
    private Date end_contract;

    public Employee(String name, String email, double salary, int year, int month, int day) {
        this.name = name;
        this.email = email;
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year, month, day);
        start_contract = calendar.getTime();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getSalary() {
        return salary;
    }

    public Date getStart_contract() {
        return start_contract;
    }

    public Date getEnd_contract(int year, int month, int day) {
        GregorianCalendar calendar = new GregorianCalendar(year, month, day);
        end_contract = calendar.getTime();
        return end_contract;
    }

    public double finalSalary(double percentage) {
        double raise = salary * percentage / 100;
        double raiseSalary = salary + raise;
        return raiseSalary;
    }
}

class Boss extends Employee {

    public Boss(String name, String email, double salary, int year, int month, int day) {
        super(name, email, salary, year, month, day);
    }

    private double bonus;

    public void setBonus(double b) {
        bonus = b;
    }

    public double finalSalary() {
        double incentive = super.finalSalary(15);
        double bossSalary = bonus + incentive;
        return bossSalary;
    }
}
