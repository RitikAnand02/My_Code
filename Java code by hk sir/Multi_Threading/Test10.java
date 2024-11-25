class MyThread7 extends Thread {
    @Override
    public void run() {
        String name = getName();

        System.out.println(name + "start");
        for (int i = 1; i <= 20; i++) {
            System.out.println(name + "i : " + i);
        }
        System.out.println(name + "end");
    }
}

public class Test10 {
    public static void main(String[] args) {
        System.out.println("main start");

        MyThread7 mt1 = new MyThread7();
        MyThread7 mt2 = new MyThread7();

        System.out.println("mt1 priority: " + mt1.getPriority());
        System.out.println("mt2 priority: " + mt2.getPriority());

        mt1.setPriority(7);
        mt2.setPriority(9);

        System.out.println("\nmt1 priority: " + mt1.getPriority());
        System.out.println("mt2 priority: " + mt2.getPriority());

        mt1.start();
        mt2.start();

        System.out.println("main end");
    }

}
