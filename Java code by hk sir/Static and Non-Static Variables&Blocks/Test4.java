
public class Test4 {
    static int a;
    static {
        System.out.println("SB");
        int a = 50;
        a = 60;
        Test4.a = 70;
        System.out.println(" a: " + a);
    }

    public static void main(String[] args) {
        System.out.println("main");
        System.out.println(" a: " + a);
    }

}
