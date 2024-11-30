class MyThread11 extends Thread {
    @Override
    public void run() {
        System.out.println("run");
    }
}

public class Test17 {
    public static void main(String[] args) {
        System.out.println("main start");

        MyThread11 mt1 = new MyThread11();
        mt1.start();

        Thread.yield(); // pausing CRT(main) and alllowing other threads to execute

        System.out.println("main end");
    }

}
