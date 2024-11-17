// Sample program to throw an exception...

public class Test3 {
    static void m1(int p) { // this mehtod must accepts only +ve number . if -ve number is passed, throw and
                            // exeception.
        if (p <= 0) {
            throw new IllegalArgumentException();
        }

        System.out.println("correct value is passed: " + p);

    }

    public static void main(String[] args) {
        System.out.println("main start");
        m1(5);
        // m1(-5);
        System.out.println("main end");
    }

}