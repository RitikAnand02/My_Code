class A {
    int x = 10;
}

class B extends A {
    int y = 20;
}

public class Test39 {
    public static void main(String[] args) {
        B b1 = new B();
        A a1 = new B();

        System.out.println(b1.x);
        System.out.println(b1.y);

        System.out.println(a1.x);
        // System.out.println(a1.y);
        System.out.println(((B) a1).y);
    }
}
