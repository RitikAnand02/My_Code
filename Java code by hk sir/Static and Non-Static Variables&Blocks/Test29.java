class A {
    static int a = 10;
    static {
        System.out.println("In A SB");
        System.out.println("a: " + a);
        // System.out.println("b: " + b);
        System.out.println("b: " + Test29.b);
        // System.out.println("b: " + Test29.getB());
    }

    public static void main(String[] args) {
        System.out.println("\nIn A main");
        System.out.println("a: " + a);
        System.out.println("b: " + Test29.b);
    }

}

class Test29 extends A {
    static int b = 20;

    static {
        System.out.println("\nIn B SB");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        // System.out.println("b: " + B.b);
        // System.out.println("b: " + B.getB());
    }

    public static void main(String[] args) {
        System.out.println("In B main");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
