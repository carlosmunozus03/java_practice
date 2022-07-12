package PildoraExercises.oop.car_default;

public class Car_Main {
    public static void main(String[] args) {
        Car renault = new Car(4, 1500, 300, 2000, 500, 1600); //instantiation and setting the object attributes
        System.out.println("This car has " + renault.wheels + " wheels");
    }
}
