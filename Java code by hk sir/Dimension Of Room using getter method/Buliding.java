public class Buliding {
    public static void main(String[] args) {
        Room r1 = new Room();

        System.out.println("r1 values");

        r1.display();

        System.out.println();
        r1.findArea();

        System.out.println();
        r1.setL(700);
        r1.setB(100);

        System.out.println("\n r1 values");
        r1.display();

        System.out.println();
        r1.findArea();

        r1.findPerimeter();
    }
}
