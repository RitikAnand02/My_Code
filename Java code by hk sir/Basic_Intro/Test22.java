class Example {
    int x;
    int y;

    void m1(Example e) {
        x = x + 1;
        y = y + 2;

        e.x = e.x + 3;
        e.y = e.y + 4;
    }
}

public class Test22 {
    public static void main(String[] args) {
        Example e1 = new Example();
        Example e2 = new Example();

        e1.m1(e2);
        System.out.println(e1.x + "..." + e1.y);
        System.out.println(e2.x + "..." + e2.y);

        e2.m1(e1);
        System.out.println(e1.x + "..." + e1.y);
        System.out.println(e2.x + "..." + e2.y);

        e1.m1(e1);
        System.out.println(e1.x + "..." + e1.y);
        System.out.println(e2.x + "..." + e2.y);

        e2.m1(e2);
        System.out.println(e1.x + "..." + e1.y);
        System.out.println(e2.x + "..." + e2.y);
    }
}
