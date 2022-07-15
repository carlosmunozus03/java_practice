package PildoraExercises.oop.car_finish;

public class Car {
    //platform attributes
    private int weight;
    private int engine;
    private int wheels;
    private int width;
    private int length;

    //car attributes
    private String color;
    private int car_weight;
    boolean leather_seats, climate_control;
    //constructor

    public Car(int weight, int engine, int wheels, int width, int length) {
        this.weight = weight;
        this.engine = engine;
        this.wheels = wheels;
        this.width = width;
        this.length = length;
    }

    //methods

    public String platformInformation() {
        return "Platform information:\n Weight: " + weight + " Kg." + "\n Engine: " + engine + " cc." + "\n Wheels: " + wheels + " wheels." + "\n Width: " + width + " cm." + "\n Length: " + length + " cm.\n";
    }

    public int price() {
        int basicPrice = 10000;
        if (leather_seats) {
            basicPrice += 2000;
        }
        if (climate_control) {
            basicPrice += 1500;
        }
        return basicPrice;
    }
    //getters and setters

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFinalWeight() {
        car_weight = weight;
        if (leather_seats) {
            car_weight += 400;
        } else if (climate_control) {
            car_weight += 50;
        }
        return car_weight;
    }

    public String getLeatherSeats() {
        if (leather_seats) {
            return "The car have a premium leather seats";
        } else {
            return "Car have standard seats";
        }
    }

    public void setLeatherSeats(String leather_seats) {
        if (leather_seats.equalsIgnoreCase("yes")) {
            this.leather_seats = true;
        } else {
            this.leather_seats = false;
        }
    }

    public String getClimateControl() {
        if (climate_control) {
            return "The car have a climate control whit air conditioner";
        } else {
            return "Car doesn't a climate control";
        }
    }

    public void setClimateControl(String climate_control) {
        if (climate_control.equalsIgnoreCase("yes")) {
            this.climate_control = true;
        } else {
            this.climate_control = false;
        }
    }
}
