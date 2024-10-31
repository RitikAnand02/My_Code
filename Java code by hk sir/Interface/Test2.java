interface I1 {
    void m1();

    default void m2() {
        System.out.println("m2 from interface I1");
    }
}

class C implements I1 {
    public void m1() {
        System.out.println("m1 is exe from class C");
    }

    public void m2() {
        System.out.println("m2 from interface class C");
    }
}

public class Test2 {
    public static void main(String[] args) {
        C c1 = new C();
        c1.m1();
        c1.m2();
        System.out.println();

        I1 i1 = new C();
        i1.m1();
        i1.m2();

    }
}
