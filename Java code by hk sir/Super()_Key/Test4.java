class A {
    static int a = 10;
    int x = 20;
}

class B extends A {
    static int a = 50;
    int x = 60;

    void m1() {
        System.out.println("a: " + a);
        System.out.println("x: " + x);
    }
}

public class Test4 {
    public static void main(String[] args) {
        B b1 = new B();
        b1.m1();

        System.out.println(b1.a);
        System.out.println(b1.x);

    }
}
