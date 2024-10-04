public class Test23 {

    int x = m1();

    int m1() {
        System.out.println("NSV1 is executed");
        return 10;
    }

    {
        System.out.println("NSB1 is executed");
    }

    Test23() {
        System.out.println("NPC is executed");
    }

    Test23(String s) {
        System.out.println("SPC is executed");
    }

    {
        System.out.println("NSB2 is executed");
    }

    int y = 20;

    int m2() {
        System.out.println("NSV2 is executed");
        return 20;
    }

    public static void main(String[] args) {
        System.out.println("MM execution start");
        Test23 t1 = new Test23();

        Test23 t2 = new Test23("Ritik");
        System.out.println("MM execution end");
    }

    int z = m3();

    int m3() {
        System.out.println("NSV3 is executed");
        return 30;
    }

    {
        System.out.println("MSB3 is executed");
    }

    void m4() {
        System.out.println("NSM is executed");
    }

}
