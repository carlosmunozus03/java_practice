package PildoraExercises.oop.car_building;

public class Car {
    //attributes platform
    private int wheels;
    private int engine;
    private int weight;
    private int height;
    private int width;
    private int length;

    //specific attributes
    private int car_weight;
    private String color;
    private boolean leather_seats, air_condition;
    //constructor

    public Car(int wheels, int engine, int weight, int height, int width, int length) {
        this.wheels = wheels;
        this.engine = engine;
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.length = length;
    }

    //methods
    public String generalInformation() { // getter
        return "The car platform has the following specifications:" + "\n Wheels number: " + wheels + ". \n " +
                "Engine size: " + engine + " cc. " +
                "\n Platform weight: " + weight + " Kg. " + "\n Height: " + height + " cm. " + "\n Width: " + width +
                " cm. " + "\n Length: " + length + " cm. ";
    }

    public void restOfWeight(int restWeight) { //setter the final weight
        car_weight = restWeight;
    }

    public int carWeight() { //getter car_weight
        return car_weight;
    }

    public int totalWeight() { //getter final weight
        return Math.addExact(weight, car_weight);
    }

    public void selectColor(String newColor) { //setter color
        color = newColor;
    }

    public String showColor() { // getter color
        return "Your color choice is: " + color;
    }

    public void setLeather(String leatherSeats) { //setter boolean
        if (leatherSeats.equalsIgnoreCase("yes")) {
            leather_seats = true;
        } else {
            leather_seats = false;
        }
    }

    public String isLeather() { //getter
        if (leather_seats) {
            return "The car has a fancy leather seats.";
        } else {
            return "Car has a serial seats.";
        }
    }

    public void setAir(String air) { //setter
        if (air.equalsIgnoreCase("yes")) {
            air_condition = true;
        } else {
            air_condition = false;
        }
    }

    public String getAir() { //getter
        if (air_condition) {
            return "The car has an air condition implemented";
        } else {
            return "Car doesn't have air condition";
        }
    }
    //getter and setters

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
