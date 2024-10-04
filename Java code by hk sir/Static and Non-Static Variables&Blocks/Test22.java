class Example {
    static int a = m1();

    static {
        System.out.println("EX SB1 is executed");
    }

    static int m1() {
        System.out.println("EX SV1 is executed");
        return 10;
    }

    static {
        System.out.println("EX SB2 is executed");
    }

    static int b = m2();

    static int m2() {
        System.out.println("EX SV2 is executed");
        return 20;
    }

    static void m4() {
        System.out.println("EX SM is executed");
    }

    public static void main(String[] args) {
        System.out.println("EX MM is executed");
    }

    static {
        System.out.println("EX SB3 is executed");
    }

    static int c = m3();

    static int m3() {
        System.out.println("EX SV3 is executed");
        return 30;
    }
}

public class Test22 {
    static {
        System.out.println("SB SB execution start");
        System.out.println("Example.a: " + Example.a);
        System.out.println("SA SB is execution end");
    }

    public static void main(String[] args) {
        System.out.println("SB MM execution start");
        System.out.println("Example.a: " + Example.a);
        System.out.println("Example.b: " + Example.b);
        System.out.println("Example.c: " + Example.c);
        Example.m4();
        System.out.println("SB MM is execution end");
    }

}
