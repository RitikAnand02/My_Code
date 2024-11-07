//  Lambada Expression 

interface I1 {
    void m1();
}

interface I2 {
    void m1(int p);
}

interface I3 {
    void m1(int p, int q);
}

interface I4 {
    int m1();
}

interface I5 {
    boolean m1(int p);
}

public class Test3 {
    public static void main(String[] args) {
        I1 i1 = () -> {
            System.out.println("LE1 for I1");
        };
        i1.m1();

        I1 i11 = () -> System.out.println("LE2 for I1");

        i11.m1();

        I2 i2 = (int p) -> System.out.println("LE1 for I2: " + p);
        // i2.m1();
        i2.m1(10);

        I2 i21 = (p) -> System.out.println("LE2 for I2: " + p);
        i21.m1(20);

        I2 i22 = p -> System.out.println("LE3 for I2: " + p);
        i22.m1(30);

        I3 i3 = (p, q) -> System.out.println("LE1 for I3: " + (p + q));
        i3.m1(10, 20);

        I4 i4 = () -> {
            return 5;
        }; // body id mandatory bcz of return
           // i4.m1(); // return value is lost
        int result = i4.m1(); // return value is stored
        System.out.println(result);
        System.out.println(i4.m1());

        // I4 i42 = () -> return 5; //CE

        I4 i43 = () -> 5;
        System.out.println(i43.m1());

        I5 i5 = p -> true;
        System.out.println(i5.m1(5));

        I5 i51 = p -> false;
        System.out.println(i51.m1(5));

        I5 i53 = p -> p < 0;
        System.out.println(i53.m1(5));
        System.out.println(i53.m1(-5));

        I5 i54 = p -> p % 2 != 0;
        System.out.println(i54.m1(5));
        System.out.println(i54.m1(6));
    }

}