@FunctionalInterface
interface AO {
    void ao(int a, int b);
}

// Approach #1: By using Outer Class
class Addition implements AO {
    public void ao(int a, int b) {
        System.out.printf("Additon of %d and %d is %d\n", a, b, (a + b));
    }
}

public class Test2 {
    public static void main(String[] args) {
        // Approach #1
        AO ao = new Addition();
        ao.ao(10, 20);

        // Approach #2: by using anonymous inner class

        AO ao2 = new AO() {
            public void ao(int a, int b) {
                System.out.printf("From AIC: Additon of %d and %d is %d\n", a, b, (a + b));
            }
        };

        ao2.ao(30, 40);

        AO ao3 = new AO() {
            public void ao(int a, int b) {
                System.out.printf("From AIC: Subtraction of %d and %d is %d\n", a, b, (a - b));
            }
        };

        ao3.ao(100, 40);

        AO ao4 = new AO() {
            public void ao(int a, int b) {
                System.out.printf("From AIC: Multiplication of %d and %d is %d\n", a, b, (a * b));
            }
        };

        ao4.ao(30, 40);

        AO ao5 = new AO() {
            public void ao(int a, int b) {
                System.out.printf("From AIC: Division of %d and %d is %d\n", a, b, (a / b));
            }
        };

        ao5.ao(400, 40);
    }

}
