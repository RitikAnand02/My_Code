public class Test5 {
    static int a;
    static {
        System.out.println("SB");
        int a = 50;
        a = 60;
        Test5.a = 70;
        System.out.println(" a: " + a);
        System.out.println(" a: " + Test5.a);
    }

    public static void main(String[] args) {
        System.out.println("main");
        System.out.println(" a: " + a);
    }

}
