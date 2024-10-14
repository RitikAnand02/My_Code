class A {
    A(int x) {
        System.out.println("Hi");
    }
}

class B extends A {
    B(int x) {
        super(x);
        System.out.println("Hello");
    }

    void display() {
        System.out.println("HRU?");
    }
}

public class Test1 {
    public static void main(String[] args) {
        B b1 = new B(5);
        b1.display();
    }
}
