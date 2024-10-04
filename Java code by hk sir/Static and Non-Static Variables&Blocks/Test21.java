public class Test21 {
    static int a = m1();

    static int m1() {
        System.out.println("SV1:a");
        return 10;
    }

    static {
        System.out.println("SB1");
    }

    static int b = m2();

    static int m2() {
        System.out.println("SV2:b");
        return 20;
    }

    static void m4() {
        System.out.println("SM");
    }

    public static void main(String[] args) {
        System.out.println("MM");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
    }

    static int c = m3();

    static int m3() {
        System.out.println("SV3:c");
        return 30;
    }

    static {
        System.out.println("SB2");
    }
}
