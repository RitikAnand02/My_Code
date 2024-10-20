
class Example {
    Example() {
        System.out.println("Ex no-param constructor");
    }

    Example(int a) {
        System.out.println("Ex int -param constructor");
    }

    Example(String str) {
        System.out.println("Ex string-param constructor");
    }

    Example(Integer io) {
        System.out.println("Ex Integer-param constructor");
    }

    Example(Object str) {
        System.out.println("Ex Object-param constructor");
    }
}

public class Test1 {
    public static void main(String[] args) {
        Example e1 = new Example();
        Example e2 = new Example(5);
        Example e3 = new Example("a");

        Example e4 = new Example('a');
        Example e5 = new Example(5.6);

        // Example e6 = new Example(null);

        Example e7 = new Example((String) null);
        Example e8 = new Example((Integer) null);
        Example e9 = new Example((Double) null);
    }

}
