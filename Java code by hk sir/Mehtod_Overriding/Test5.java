class Example {
}

class Sample extends Example {
}

class Test {
}

public class Test5 {
    static void m1(Example e) {
        System.out.println("Example-param");
    }

    public static void main(String[] args) {
        m1(new Example());
        m1(new Sample());
        m1(null);
        // m1(new Test());
        // m1("abc");
    }

}
