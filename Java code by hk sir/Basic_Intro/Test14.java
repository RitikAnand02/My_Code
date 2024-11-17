public class Test14 {
    static int a = 10;
    int x = 20;

    public static void main(String[] args) {
        Test14 e1 = new Test14();
        Test14 e2 = new Test14();

        System.out.println("a: " + a);
        System.out.println("a: " + Test14.a);
        System.out.println("a: " + e1.a);
        System.out.println("a: " + e2.a);
        System.out.println("x: " + e1.x);
        System.out.println("x: " + e2.x);

    }

}
