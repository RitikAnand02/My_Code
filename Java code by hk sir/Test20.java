class Example {
    static int a;
    int x;

    void setAx(int p, int q) {
        a = p;
        x = q;
    }

    void printAx() {
        System.out.println(a);
        System.out.println(x);
        System.out.println();
    }
}

class Test20 {
    public static void main(String[] args) {

        Example e1 = new Example();
        Example e2 = new Example();

        e1.printAx();
        e2.printAx();
        e1.setAx(10, 20);
        e1.printAx();
        e2.printAx();

        e1.setAx(15, 16);
        e1.printAx();
        e2.printAx();

    }
}