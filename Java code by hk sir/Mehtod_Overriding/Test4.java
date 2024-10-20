public class Test4 {
    static void m1(byte b) {
        System.out.println("byte-param");
    }

    public static void main(String[] args) {
       // m1(50);

        m1((byte) 50);

        byte b = 50;
        m1(b);
    }

}
