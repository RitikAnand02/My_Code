/*
 Redevelop a program to create a Room with its dimensions l and b .
 create a Room in a Bulding with some l and b.
 Perform business operations - findArea() and findPerimeter().
 Using scanner , setter and getter and constructor.. 
 */

public class Room {

    private double l;
    private double b;

    public Room(double l, double b) {
        this.l = l;
        this.b = b;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getL() {
        return l;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public Void findArea() {
        System.out.println("Total Area: " + (l * b));
        return null;
    }

    public Void findPerimeter() {
        System.out.println("Total Perimeter: " + 2 * (l + b));
        return null;
    }

    public void display() {
        System.out.println(" l: " + l);
        System.out.println(" b: " + b);
    }
}
