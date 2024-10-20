
class Example {
    void testProcess() {
        System.out.println("Ex method");
    }
}

class Sample extends Example {
    void testProcess() {
        System.out.println("Sa method");
    }

}

public class Test {
    public static void main(String[] args) {
        Example e1 = new Example();
        e1.testProcess();
    }

}
