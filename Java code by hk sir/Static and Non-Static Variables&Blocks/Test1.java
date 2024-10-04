public class Test1 {

    static int a;
    static {
        System.out.println("SB");
    }

    public static void main(String[] args) {
        System.out.println("main");
        System.out.println(" a: " + a);
    }
}
