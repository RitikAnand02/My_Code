public class Test16 {
    public static void main(String[] args) {
        Thread th1 = new Thread(); // NDT
        System.out.println(th1.isDaemon()); // false

        Thread th2 = new Thread(); // NDT
        th2.setDaemon(true);
        System.out.println(th2.isDaemon()); // true

        th1.start();// started as NDT, JVM waits until complete
        th2.start();// started as DT, JVM does not wait

        MyThread10 mt1 = new MyThread10();// NDT
        // mt1.setDaemon(true); //DT
        mt1.start();

    }

}
