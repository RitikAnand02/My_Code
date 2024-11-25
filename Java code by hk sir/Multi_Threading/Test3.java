/*
 * Develop a multithread program to run two tasks concurrently
 * - task #1: print numbers 1 - 20
 * - task #2: print numbers 20 - 1
 */

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 20; i >= 1; i--) {
            System.out.println("run: " + i);
        }
        System.out.println("run end");
    }
}

public class Test3 {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread th = new Thread(mr);
        th.start();

        // task #1
        for (int i = 1; i <= 20; i++) {
            System.out.println("main: " + i);
        }
        System.out.println("main end");
    }
}
