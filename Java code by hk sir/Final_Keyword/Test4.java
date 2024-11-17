public class Test4 {
    static void m1(int p) throws IllegalArgumentException {

        if (p <= 0) {
            throw new IllegalArgumentException("Do not pass -ve value");
        }

        System.out.println("correct value is passed: " + p);

    }

    public static void main(String[] args) {
        System.out.println("main start");
        // m1(5);
        try {
            m1(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("main end");
    }

}
