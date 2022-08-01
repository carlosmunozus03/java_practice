package PildoraExercises.oop.person.person_1;

public class PersonMain {
    public static void main(String[] args) {
        Person[] persons = {new Employee("Raul Franz", 40000), new Alumni("Marie Walker", "Medicine")};
        for (Person person : persons) {
            System.out.println(person.information());
        }
    }
}
//person, employee, alumni

abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String information();
}

class Employee extends Person {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        super(name);
//        this.name=name; No correct, use getName at the super class
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String information() {
        return "The employee name is " + super.getName() + " and the salary is: " + salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Alumni extends Person {
    private String name;
    private String career;

    public Alumni(String name, String career) {
        super(name);
        this.career = career;
    }

    @Override
    public String information() {
        return "The alumni name is: " + super.getName() + " and is studying " + career;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }
}