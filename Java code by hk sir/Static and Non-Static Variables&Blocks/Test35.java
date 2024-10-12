class Example {
    int x = m1();

    int m1() {
        System.out.println("Ex NSV");
        return 10;
    }

    {
        System.out.println("Ex NSB");
    }

    Example() {
        System.out.println("EX NPC");
    }

    void m2() {
        System.out.println("Ex NSM");
    }

}

class Test35 extends Example {
    int y = m3();

    int m3() {
        System.out.println("Sa NSV");
        return 20;
    }

    {
        System.out.println("Sa NPC");
    }

    Test35() {
        System.out.println("Sa NPC");
    }

    void m4() {
        System.out.println("Sa NSM");
    }

    public static void main(String[] args) {
        Test35 s1 = new Test35();
        s1.m2();
        s1.m4();
    }

}
