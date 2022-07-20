package PildoraExercises.oop.car_finish;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car(700, 1600, 4, 300, 2000);
        car.setClimateControl("yes");
        car.setLeatherSeats("no");
        System.out.println("The basic platform is: " + car.platformInformation());
        System.out.println("The customer add the follow accessories: ");
        System.out.println(car.getClimateControl() + " and " + car.getLeatherSeats());
        System.out.println("Weight increase to: " + car.getFinalWeight()+" Kg.");
        System.out.println("Final price: $" + car.price());
        System.out.println();

    }
}
