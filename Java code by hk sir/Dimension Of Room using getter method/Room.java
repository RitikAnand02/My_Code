/*
 Develop a program to create a Room with its dimensions l and b .
 create a Room in a Bulding with some l and b.
 Perform business operations - findArea() and findPerimeter().
 */

 public class Room {

    private double l;
    private double b;

    public Room(double l2, double b2) {
        //TODO Auto-generated constructor stub
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

    public void findArea() {
        System.out.println("Total Aera: " + (l * b));
    }

    public void findPerimeter() {
        System.out.println("Perimeter: " + (2 * (l + b)));
    }

    public void display() {
        System.out.println(" l: " + l);
        System.out.println(" b: " + b);
    }
}
