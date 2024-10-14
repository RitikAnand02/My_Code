class A {
    static int a = 10;
    int x = 10;
}

class B extends A {

    static void m1() {
        // System.out.println(super.a);
        // System.out.println(super.x);
    }

    void m2() {
        System.out.println(super.a);
        System.out.println(super.x);
    }
}

public class Test3 {
    public static void main(String[] args) {
        B b1 = new B();
        b1.m2();
    }

}
