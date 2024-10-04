class Example {
    {
        System.out.print("Hi ");
    }

    Example() {
        System.out.println("Raja");
    }

    Example(int x) {
        System.out.println("Rani");
    }

    Example(String x) {
        System.out.println("Mantri");
    }

    Example(double x) {
        System.out.println("Soldier");
    }

}

public class Test10 {
    public static void main(String[] args) {
        Example e1 = new Example();
        Example e2 = new Example(5);
        Example e3 = new Example("a");
        Example e4 = new Example(5.5);

    }

}
