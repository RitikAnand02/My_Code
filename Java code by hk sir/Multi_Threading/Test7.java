//task #1: adding numbers 1 - 10
//task #2: subtracting numbers 1 - 10
//task #3: multiply numbers 1 - 10

class AddThread extends Thread {
    @Override
    public void run() {
        int sum = 1;
        for (int i = 2; i <= 3; i++) {
            sum += i;
            System.out.println("addition: " + sum);
        }
    }
}

class SubThread extends Thread {
    @Override
    public void run() {
        int diff = 1;
        for (int i = 2; i <= 3; i++) {
            diff -= i;
            System.out.println("subtraction: " + diff);
        }
    }
}

class MulThread extends Thread {
    @Override
    public void run() {
        int mul = 1;
        for (int i = 2; i <= 3; i++) {
            mul *= i;
            System.out.println("subtraction: " + mul);
        }
    }
}

public class Test7 {
    public static void main(String[] args) {
        AddThread at = new AddThread();
        SubThread st = new SubThread();
        MulThread mt = new MulThread();

        at.start(); // Thread-0 [At.run() -> executes addition logic]
        st.start(); // Thread-1 [At.run() -> executes subtraction logic]
        mt.start(); // Thread-2 [At.run() -> executes multiplication logic]
    }

}
