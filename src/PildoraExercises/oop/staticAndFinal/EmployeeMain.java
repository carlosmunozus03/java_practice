package PildoraExercises.oop.staticAndFinal;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{new Employee("Danna"), new Employee("Josh"), new Employee("Patrick"),
                new Employee("Tara"), new Employee("Christopher"), new Employee("Mary")};

        for (Employee employee : employees) {
            System.out.println(employee.generalInformation());
        }
    }
}

class Employee {
    private final String name;
    private String section;
    private int id;
    private static int nextId = 1;

    public Employee(String name) { // initials characters
        this.name = name;
        section = "Administration";
        id = nextId++;
    }

    public String generalInformation() {
        return "Id: " + id + " Name: " + name + " Section: " + section;
    }
}