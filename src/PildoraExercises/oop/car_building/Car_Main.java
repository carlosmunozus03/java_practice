package PildoraExercises.oop.car_building;

public class Car_Main {
    public static void main(String[] args) {
        Car myCar = new Car(4, 1600, 500, 1700, 300, 2000); //set constructor
        myCar.selectColor("Metallic green");
        myCar.restOfWeight(1000);
        myCar.setLeather("yes");
        myCar.setAir("yes");
        System.out.println(myCar.generalInformation());
        System.out.println();
        System.out.println("The final product is:");
        System.out.println(myCar.showColor() + ".");
        System.out.println("Total weight: Platform: " + myCar.getWeight() + " Kg + " + " rest of the elements: " + myCar.carWeight() + " Kg = " + myCar.totalWeight() + " Kg.");
        System.out.println("Accessories: " + myCar.isLeather());
        System.out.println("Accessories: " + myCar.getAir());

    }
}
