package PildoraExercises.oop.car_finish;

public class Van extends Car {
    private int max_cargo;
    private int max_seats;

    public Van(int weight, int engine, int wheels, int width, int length, int max_cargo, int max_seats) {
        super(weight, engine, wheels, width, length); // this is the dad constructor (Car)
        this.max_cargo = max_cargo;
        this.max_seats = max_seats;
    }
}
