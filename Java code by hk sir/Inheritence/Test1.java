class A {
    static int a = 10;
    int x = 20;
}

public class Test1 extends A {
    public static void main(String[] args) {
        System.out.println(a);
        // System.out.println(x);

        Test1 a1 = new Test1();
        System.out.println(a1.x);
    }

}
