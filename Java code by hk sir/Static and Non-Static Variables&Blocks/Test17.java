public class Test17 {
    static int a = m1();

    static int m1() {
        System.out.println("SV a is created");
        return 10;
    }

    static int m2() {
        System.out.println("SV b is created");
        return 20;
    }

    public static void main(String[] args) {
        System.out.println("In main");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    static int b = m2();

    static void m3() {
        System.out.println("m3 is executed");
    }
}

class Test17_1 {
    public static void main(String[] args) {
        System.out.println("Test main start");
        Test17.m3();
        System.out.println("Test main end");

    }
}
