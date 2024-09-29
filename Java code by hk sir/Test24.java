class Example {
    int x;
    int y;

    void set(int p, int q) {
        x = p;
        y = q;
    }

    void display() {
        System.out.println(x);
        System.out.println(y);
    }
}

public class Test24 {

    public static void main(String[] args) {
        Example e1 = new Example();
        Example e2 = new Example();

        e1.set(10, 20);
        e2.set(15, 16);

        e1.display();
        e2.display();

        e1.set(30, 40);
        e2.set(17, 18);

        e1.display();
        e2.display();
    }
}