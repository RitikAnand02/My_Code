class MyThread12 extends Thread {
    @Override
    public void run() {
        System.out.println("run");
    }
}

public class Test18 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main start");

        MyThread12 mt1 = new MyThread12();
        mt1.start();

        Thread.sleep(5000); // forcing Thread scheduler to pause this CRT main thread for 5 sec and allowing
                            // other threads to execute

        System.out.println("main end");
    }

}
