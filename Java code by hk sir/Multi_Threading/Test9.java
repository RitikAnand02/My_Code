class MyThread6 extends Thread {
    @Override
    public void run() {
        String name = getName();

        System.out.println(name + "start");
        System.out.println(name + "end");
    }
}

public class Test9 {
    public static void main(String[] args) {
        System.out.println("main start");

        MyThread6 mt1 = new MyThread6();
        MyThread6 mt2 = new MyThread6();

        System.out.println("mt1 priority: " + mt1.getPriority());
        System.out.println("mt2 priority: " + mt2.getPriority());

        mt1.start();
        mt2.start();

        System.out.println("main end");
    }

}
