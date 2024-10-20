class Addition {

    static void add(int i1, int i2) {
        System.out.println(i1 + i2);
    }

    static void add(float f1, float f2) {
        System.out.println(f1 + f2);
    }

    static void add(String s1, String s2) {
        System.out.println(s1 + s2);
    }
}

public class Test1 {
    public static void main(String[] args) {
        Addition Add = new Addition();

        Add.add(5, 6);

        Add.add(5f, 6f);

        Add.add("H", "k");

    }

}
