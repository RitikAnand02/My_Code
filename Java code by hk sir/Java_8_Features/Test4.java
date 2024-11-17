interface I1 {
    void m1();
}

class A {
    static void abc() {
        System.out.println("Hi");
    }

    void bbc() {
        System.out.println("Hello");
    }

    A() {
        System.out.println("HRU?");
    }
}

public class Test4 {
    public static void main(String[] args) {
        I1 i1 = () -> {
            System.out.println("Hi");
        };
        I1 i2 = () -> {
            A.abc();
        };
        I1 i3 = A::abc; // static method reference

        I1 i4 = () -> {
            new A().bbc();
        };
        I1 i5 = new A()::bbc; // non - static method reference

        I1 i6 = () -> {
            new A();
        };
        I1 i7 = A::new; // constructor reference

        i1.m1();
        i2.m1();
        i3.m1();
        i4.m1();
        i5.m1();
        i6.m1();
        i7.m1();
    }
}
