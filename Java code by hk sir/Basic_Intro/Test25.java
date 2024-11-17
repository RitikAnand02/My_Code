class Example {
    int x;
    int y;

    Example() {
        x = 10;
        y = 20;
    }

    Example(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Example(Example e) {
        this.x = e.x;
        this.y = e.y;
    }

    public void display() {
        System.out.println(x + " " + y);
    }
}

public class Test25 {
    public static void main(String[] args) {
        Example e1 = new Example();
        Example e2 = new Example(15, 16);

        e1.display();
        e2.display();
        System.out.println();

        e2.x = 45;
        e2.y = 55;

        Example e3 = new Example(e2);
        e2.display();
        e3.display();
        System.out.println(e2 == e3);
        System.out.println();

        Example e4 = e2;
        e2.display();
        e4.display();
        System.out.println(e2 == e4);

    }

}
