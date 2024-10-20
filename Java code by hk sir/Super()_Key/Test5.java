class A {
    static int a = 10;
    int x = 20;
}

class B extends A {
    static int a = 30;
    int x = 40;

    void m1() {
        System.out.println("a: " + a);
        System.out.println("x: " + x);

        System.out.println("a: " + super.a);
        System.out.println("a: " + super.x);
    }
}

public class Test5 {
    public static void main(String[] args) {
        B b1 = new B();
        b1.m1();

        A a1 = new A();

        // System.out.println(super.a);
        // System.out.println(super.x);

        System.out.println(b1.a);
        System.out.println(b1.x);

        System.out.println(a1.a);
        System.out.println(a1.x);
    }

}
