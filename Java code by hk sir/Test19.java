public class Test19 {
    static int a = 10;
    int x = 20;

    static void m1() {

        System.out.println(a);

        Test19 e1 = new Test19();
        Test19 e2 = new Test19();

        System.out.println(e1.x);
        System.out.println(e2.x);
    }

    void m2() {
        System.out.println(a);
    }

    public static void main(String[] args) {
        m1();
        Test19 e1 = new Test19();
        e1.m2();
    }

}
