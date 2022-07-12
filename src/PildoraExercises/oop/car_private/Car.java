package PildoraExercises.oop.car_private;

public class Car {
    //attributes
    private int wheels;
    private int engine;
    private int weight;
    private int height;
    private int width;
    private int length;

    //constructor

    public Car(int wheels, int engine, int weight, int height, int width, int length) {
        this.wheels = wheels;
        this.engine = engine;
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.length = length;
    }

    //setters and getters (method to connect this class with others)

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
