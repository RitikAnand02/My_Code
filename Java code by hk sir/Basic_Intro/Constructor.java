/*
 - Develop a constructor program to run above the logic.
 - create objects by using both constructors.
 - Display both objects values on console.
 */

class Example {
    private int x;
    private int y;

    // no para constructors
    Example() {
        x = 10;
        y = 20;
    }

    // para constructors
    Example(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Example e1 = new Example();
        Example e2 = new Example(15,16);

        e1.display();// 10 20 

        e2.display();// 15 16
    }

}
