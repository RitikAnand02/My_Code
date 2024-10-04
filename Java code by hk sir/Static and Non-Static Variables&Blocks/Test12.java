public class Test12 {
    static int a = m1();

    static int m1() {
        System.out.println("SV is executed");
        return 10;
    }

    public static void main(String[] args) {
        System.out.println("MM is executed");
        System.out.println(" a: " + a);
    }

}
