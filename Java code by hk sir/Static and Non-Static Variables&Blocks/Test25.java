public class Test25 {
    static int a = 10;

    static {
        System.out.println("From SB");
        System.out.println(" a: " + a);
       // System.out.println(" b: " + b);
        System.out.println(" b: " + Test25.b);
    }

    public static void main(String[] args) {
        System.out.println("From MM");
        System.out.println(" a: " + a);
        System.out.println(" b: " + b);
    }

    static int b = 20;

}
