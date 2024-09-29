import java.util.Scanner;

public class Buliding {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter Length: ");
        double l = scn.nextDouble();

        System.out.print("Enter Breadth: ");
        double b = scn.nextDouble();

        Room r1 = new Room(l, b);

        System.out.println("r1 values");
        r1.display();

        System.out.println();
        r1.findPerimeter();

        System.out.println();
        r1.findArea();

        System.out.println();

        System.out.print("Enter modified Length: ");
        r1.setL(scn.nextDouble());

        System.out.print("\n Enter modified Breadth: ");
        r1.setB(scn.nextDouble());

        System.out.println("r1 changed values");
        r1.display();

        System.out.println();
        r1.findPerimeter();

        System.err.println();
        r1.findArea();
        scn.close();
    }

}
