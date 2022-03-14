//import java.io.*;

interface Vehicle {
    // interface contains methods of abstarct type only
    void Gear(int x);

    void Speed(int s);

}

// class implemented the interface
class Bike implements Vehicle {
    int speed;
    int gear;

    // implementation of interface methods
    public void Gear(int x) {
        gear = x;
    }

    public void Speed(int s) {
        speed = speed + s;
    }

    void color() {
        System.out.println("3. Color = Black");
    }

    // method to display details
    void bikeDetails() {
        System.out.println("*** BIKE DETAils ***");
        System.out.println("1. Gear = " + gear);
        System.out.println("2. Speed = " + speed);

        color();
    }

}

// class ferrari implements vehicle class
class Ferrari implements Vehicle {
    int speed;
    int gear;

    public void Gear(int x) {
        gear = x;
    }

    public void Speed(int s) {
        speed = speed + s;
    }

    void color() {
        System.out.println("3. Color = RED");
    }

    void FerrariDetails() {
        System.out.println(" ");
        System.out.println("*** FERRARI DETAils ***");
        System.out.println("1. Gear = " + gear);
        System.out.println("2. Speed = " + speed);

        color();
    }

}

public class Interface_1 {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.gear = 3;
        b.speed = 150;
        b.bikeDetails();

        Ferrari f = new Ferrari();
        f.gear = 4;
        f.speed = 350;
        f.FerrariDetails();
    }

}
