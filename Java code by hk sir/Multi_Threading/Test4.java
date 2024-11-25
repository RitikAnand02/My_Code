// point #1:

// class MyThread1 extends Thread,Exception{}

import java.util.Scanner;

class MyRunnable1 extends Exception implements Runnable {
    @Override
    public void run() {
    }
}

// point #2:
// Thread implementation logic
class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread run executed");
    }
}

public class Test4 {
    public static void main(String[] args) {
        // Thread creation logic
        // without containing Mythread2 class
        // we can not create its object
        // so parallel development is not possible

        MyThread2 mt = new MyThread2();
        mt.start();

        // Thread creation logic for executing the given runnable task
        // without containing runnable implemation class
        // MyRunnable1, we can develop this code
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Runnable implementation Class Name: ");
        Runnable task = (Runnable) Class.forName(sc.next()).newInstance();
        Thread th1 = new Thread(task);
        th1.start();

        Thread th2 = new Thread(task); // resuning same implementation in second thread
        th2.start();

        // comment MyRunnable1 class,
        // you won't get CE in above code
        // because it reading MyRunnable1 at the runtime
        sc.close();
    }
}
