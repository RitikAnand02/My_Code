
class Example {
    Example() {
        this(5);
        System.out.println("Ex no-param constructor for " + this);
    }

    Example(int a) {
        this("a");
        System.out.println("Ex int-param constructor for " + this);
    }

    Example(String str) {
        System.out.println("Ex String-param constructor for " + this);
    }
}

public class Test2 {
    public static void main(String[] args) {
        Example e1 = new Example();
        System.out.println();
        Example e2 = new Example(5);
        System.out.println();
        Example e3 = new Example("a");

    }

}
