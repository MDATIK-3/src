import java.util.*;

abstract class Vehicle {
    String make;
    int manufacturingYear;

    public Vehicle(String make, int manufacturingYear) {
        this.make = make;
        this.manufacturingYear = manufacturingYear;
    }

    abstract void display();
}

class Car extends Vehicle {
    int numDoors;

    public Car(String make, int manufacturingYear, int numDoors) {
        super(make, manufacturingYear);
        this.numDoors = numDoors;
    }

    @Override
    void display() {
        System.out.println("Car Make: " + make + ", Year: " + manufacturingYear + ", Doors: " + numDoors);
    }
}

class Motorcycle extends Vehicle {
    boolean hasSidecar;

    public Motorcycle(String make, int manufacturingYear, boolean hasSidecar) {
        super(make, manufacturingYear);
        this.hasSidecar = hasSidecar;
    }

    @Override
    void display() {
        String sidecarStatus = hasSidecar ? "with Sidecar" : "without Sidecar";
        System.out.println("Motorcycle Make: " + make + ", Year: " + manufacturingYear + ", " + sidecarStatus);
    }
}

public class final_exam1 {
    public static void main(String[] args) {
        Car car = new Car("Tesla", 2024, 4);
        Motorcycle motorcycle = new Motorcycle("Honda", 2023, true);

        car.display();
        motorcycle.display();
    }
}

