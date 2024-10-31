
interface I1 {
    void m1();

    default void m2() {
        System.out.println("m2 from I1");
    }

}

class A implements I1 {
    public void m1() {
        System.out.println("m1 from class A");
    }
}

class B implements I1 {
    public void m1() {
        System.out.println("m1 from class B");
    }
}

public class Test1 {
    public static void main(String[] args) {
        I1 i1;

        i1 = new A();
        i1.m1();
        i1.m2();

        i1 = new B();
        i1.m1();
        i1.m2();
    }
}
