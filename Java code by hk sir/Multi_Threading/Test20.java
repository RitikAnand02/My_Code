class MyThread13 extends Thread {
    @Override
    public void run() {
        System.out.println("run start");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("IE is raised");
        }
        System.out.println("run end");
    }
}

public class Test20 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main start");

        MyThread13 mt1 = new MyThread13();
        mt1.start();

        Thread.sleep(2000);// main thread is paused and allowing mt1 thread is start

        mt1.interrupt();// interrupting mt1 thread paused state and bringing it back to ready-to-run
                        // state

        System.out.println("main end");
    }

}
