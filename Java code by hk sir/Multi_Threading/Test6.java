class MyThread4 extends Thread {
    private int x;

    public MyThread4(int x) {
        this.x = x;
    }

    @Override
    public void run() {
        for (int i = 1; i <= x; i++) {
            System.out.println(getName() + "run i: " + i);
        }

    }
}

public class Test6 {
    public static void main(String[] args) {
        MyThread4 mt = new MyThread4(15);
        MyThread4 mt1 = new MyThread4(20);

        mt.start();// 1 - 15 -> Thread-0 [MT6.run()->x=mt.x=15]

        mt1.start();// 1 - 20 -> Thread-1 [MT6.run()->x=mt1.x=20]

    }

}
