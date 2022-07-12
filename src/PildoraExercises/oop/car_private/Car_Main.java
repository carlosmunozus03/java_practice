package PildoraExercises.oop.car_private;

public class Car_Main {
    public static void main(String[] args) {
        Car renault = new Car(4, 1600, 500, 1500, 300, 2000);
        System.out.println("The car has " + renault.getWheels() + " wheels");// instantiation and setting the attributes
    }
}
