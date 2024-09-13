package p1;

public class Test1 {
    private int a = 10;
    int b = 20;
    protected int c = 30;
    public int d = 40;

    public static void main(String[] args) {
        Test1 a1 = new Test1();

        System.out.println("a1.a: " + a1.a);
        System.out.println("a1.b: " + a1.b);
        System.out.println("a1.c: " + a1.c);
        System.out.println("a1.d: " + a1.d);

    }
}