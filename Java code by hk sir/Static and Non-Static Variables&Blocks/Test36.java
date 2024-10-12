class Example {
    static int a = m1();
    static {
        System.out.println("Example SB");
    }

    int x = m2();
    {
        System.out.println("Example NSB");
    }

    Example() {
        System.out.println("Example Constructor");
    }

    static int m1() {
        System.out.println("Example SV is Created");
        return 10;
    }

    int m2() {
        System.out.println("Example NSV is created");
        return 20;
    }

    void abc() {
        System.out.println("Example abc");
    }
}

class Test36 extends Example {
    static int b = m3();
    static {
        System.out.println("Example SB");
    }

    int y = m4();
    {
        System.out.println("Example NSB");
    }

    Test36() {
        System.out.println("Example Constructor");
    }

    static int m3() {
        System.out.println("Example SV is Created");
        return 30;
    }

    int m4() {
        System.out.println("Example NSV is created");
        return 40;
    }

    void abc() {
        System.out.println("Example abc");
    }

    public static void main(String[] args) {
        System.out.println("Main");
        Test36 s = new Test36();
        s.abc();
        s.abc();
    }
}
