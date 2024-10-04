public class Test2 {
    static int a;
    static {
        System.out.println("SB");
        a = 50;
    }

    public static void main(String[] args) {
        System.out.println("main");
        System.out.println(" a: " + a);
    }
}
