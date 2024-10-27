abstract class Example {
    abstract void m1();
}

class Sample extends Example {
    void m1() {
        System.out.println("m1 from sample");
    }
}

public class Test {
    public static void main(String[] args) {
        // Example e1 = new Example()
        Example e1 = new Sample();
        e1.m1();

    }
}
