public class Test20 {
    static int a = m1();

    static int m1() {
        System.out.println("m1 is executed");
        return 5;
    }

    public static void main(String[] args) {
        System.out.println("mm is execution is started");
        System.out.println("a: " + a);
        m1();
        System.out.println("mm is execution is ended");
    }

}
