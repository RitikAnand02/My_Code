class Example {
    int x;

    void m1() {
        System.out.println(x);
    }
}

public class Test21 {

    public static void main(String[] args) {
        Example e1 = new Example();
        Example e2 = new Example();

        System.out.println(e1.x);
        System.out.println(e2.x);
        System.out.println();

        e1.m1();
        e2.m1();

        e1.x = 15;
        e2.x = 16;

        System.out.println();

        e1.m1();
        e2.m1();

    }
}