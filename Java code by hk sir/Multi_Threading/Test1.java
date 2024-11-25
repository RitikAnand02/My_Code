// #1: Creating new class deriving from thread class

class MyThread extends Thread {
    // #2: overriding run() method
    @Override
    public void run() {
        System.out.println("run executed");
    }
}

public class Test1 {
    public static void main(String[] args) {
        System.out.println("Main start");

        // #3: creating sub class object and calling start() method by using this sub
        // class object
        MyThread mt1 = new MyThread();
        mt1.start(); // making this custom thread ready-to-run

        // 1. JVM creates custom thread in JSA for mythread object
        // 2. JVM calls run() method of Mythread and executes in this custom thread,
        // when main thread execution is either paused or completed...
        System.out.println("Main end");
    }

}
