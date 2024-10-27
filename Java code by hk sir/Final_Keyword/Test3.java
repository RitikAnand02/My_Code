public class Test3 {
    static {
        System.out.println("Test class is loaded");
        System.out.println("Test class SB is executed");
    }

    public static void main(String[] args) {
        System.out.println("\n Test class main execution is started");
        System.out.println("a: " + Example.a);
        System.out.println("Main execution is end");
    }

}

class Example {
    static final int a = 10;
    static {
        // a = 10;
        System.out.println("Example class is loaded");
        System.out.println("sb is executed");
    }
}
