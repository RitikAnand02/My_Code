class MyThread3 extends Thread {
    @Override
    public void run() {
        System.out.println(getName() + "run executed");
    }
}

public class Test5 {
    public static void main(String[] args) {
        System.out.println("main start");

        MyThread3 mt = new MyThread3();
        mt.start();// CT #1 -> Thread-0

        MyThread3 mt1 = new MyThread3();
        mt1.start();// CT #2 -> Thread-1

    }

}
