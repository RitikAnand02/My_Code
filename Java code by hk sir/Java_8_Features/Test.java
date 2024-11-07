interface AO { // functional interface
    void ao(int a, int b);
}

class Calc {
    void calculate(AO a) {
        a.ao(10, 20);
    }
}

public class Test {
    public static void main(String[] args) {
        Calc c1 = new Calc();
        c1.calculate((int a, int b) -> System.out.println(a + b));

        c1.calculate((int a, int b) -> System.out.println(a - b));

        c1.calculate((int a, int b) -> System.out.println(a * b));

        c1.calculate((int a, int b) -> System.out.println(a / b));

    }

}
