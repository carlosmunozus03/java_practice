package PildoraExercises.oop.employee_4;

public class Employee_Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{new Employee("Rafael", "rafael@cpn.com", 45000, 2015, 3, 3),
                new Employee("Larry", "larry@cpn.com", 50000, 2014, 5, 28)};


        for (Employee employee: employees){
            System.out.println("Name: "+employee.getName()+"\nEmail: "+employee);
        }
    }
}