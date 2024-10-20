class Addition {
    void add() {
        System.out.println("add no-param");
    }

    static void add(int i1) {
        System.out.println("add int 1-param");
    }

    int add(double d1) {
        System.out.println("add double 1-param");
        return 5;
    }

    void add(int i1, int i2) {
        System.out.println("add int 2-param");
    }

    void add(int i1, int i2, int i3) {
        System.out.println("add int 3-param");
    }

    void add(int i1, float f2) {
        System.out.println("add int, float param");
    }

    void add(float f1, int i1) {
        System.out.println("add float , int param");
    }
}

public class Test2 {
    public static void main(String[] args) {
        Addition a = new Addition();

        a.add();
        a.add(5);
        a.add(5, 6);
        a.add(5, 6, 7);
        a.add(5.5);
        a.add(5f, 6);
        a.add(5, 6f);
    }

}
