class Test38 {
    static int a = 10;
    static {
        System.out.println("From SB");
        System.out.println(" a: " + a);
       // System.out.println(" b: " + b);

        b = 50;
    }

    public static void main(String[] args) {
        System.out.println("From SB");
        System.out.println(" a: " + a);
        System.out.println(" b: " + b);
    }

    static int b = 20;
}
