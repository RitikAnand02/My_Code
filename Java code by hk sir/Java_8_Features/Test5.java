interface I2 {
    void m1(String s);
}

class A {
    void abc() {
        System.out.println("NP abc");
    }

    void abc(int i) {
        System.out.println("IP abc");
    }

    void abc(String i) {
        System.out.println("SP abc");
    }
}

public class Test5 {
    public static void main(String[] args) {
        I2 i1 = (String s) -> {
            new A().abc(s);
        };
        i1.m1("ritik");

        I2 i2 = new A()::abc;
        i2.m1("Nit");

        I2 i3 = (String s) -> {
            new A().abc(s.toLowerCase());
        };
        i3.m1("ritik");

        I2 i4 = new A()::abc;
        i4.m1("ritik");

        I2 i5 = (String s) -> System.out.println(s);
        I2 i6 = System.out::println;
        i6.m1("Hyd");
    }

}
