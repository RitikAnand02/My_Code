class A {
    static int a = m1();

    static int m1() {
        System.out.println("A SV");
        return 10;
    }

    static {
        System.out.println("A SB");
    }

    public static void main(String[] args) {
        System.out.println("A MM"); // not execute because the main method is not in main class.
    }

}

class Test27 extends A {
    static int b = m2();

    static int m2() {
        System.out.println("B SV");
        return 20;
    }

    static {
        System.out.println("B SB");
    }

    public static void main(String[] args) {
        System.out.println("B MM");
    }

}
