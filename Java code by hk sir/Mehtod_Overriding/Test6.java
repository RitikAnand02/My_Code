public class Test6 {
    static void m1(int i, float f) {
        System.out.println("int , float");
    }

    static void m1(float f, int i) {
        System.out.println("float , int");
    }

    public static void main(String[] args) {
        m1(5, 6f);
        m1(5f, 6);
        // m1(5,6);
    }
}
