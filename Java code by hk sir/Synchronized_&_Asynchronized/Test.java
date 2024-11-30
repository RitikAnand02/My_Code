class Addition {
    private int x;
    private int y;

    // public void add(int x, int y) {
    public synchronized void add(int x, int y) {
        this.x = x;
        this.y = y;

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int res = this.x + this.y;
        System.out.println(Thread.currentThread().getName() + " res: " + res);
    }
}

class Thread1 extends Thread {
    private Addition add;

    Thread1(Addition add) {
        this.add = add;
    }

    @Override
    public void run() {
        add.add(50, 60);
    }
}

class Thread2 extends Thread {
    private Addition add;

    Thread2(Addition add) {
        this.add = add;
    }

    @Override
    public void run() {
        add.add(100, 50);
    }
}

public class Test {
    public static void main(String[] args) {
        System.out.println("main start");
        Addition add = new Addition();
        Thread1 th1 = new Thread1(add);
        Thread2 th2 = new Thread2(add);

        th1.start();
        th2.start();

        System.out.println("main end");
    }

}
