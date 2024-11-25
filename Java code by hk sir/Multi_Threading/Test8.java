class MyThread5 extends Thread {
    @Override
    public void run() {
        System.out.println("run: " + this.getState());
    }
}

public class Test8 {
    public static void main(String[] args) {
        MyThread5 mt1 = new MyThread5();
        System.out.println("main: " + mt1.getState());

        mt1.start();
        System.out.println("main: " + mt1.getState());

    }

}
