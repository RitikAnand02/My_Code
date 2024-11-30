class MyThread14 extends Thread {
    @Override
    public void run() {
        System.out.println("run start");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("run end");
    }
}

public class Test21 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main start");

        MyThread14 mt1 = new MyThread14();
        mt1.start();

        mt1.join(2000);

        System.out.println("main end");
    }
}
