public class Test9 {
    static int a;
    static {
        System.out.println("SB1");
        a = 10;
    }
    static int b;
    static {
        System.out.println("SB2");
        b = 20;
    }

    public static void main(String[] args) {
        System.out.println("main");
        System.out.println(" a: " + a);
        System.out.println(" b: " + b);

    }

}
