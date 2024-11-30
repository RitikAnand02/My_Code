public class Test14 {
    public static void main(String[] args) {
        Thread th1 = new Thread();
        Thread th2 = new Thread();
        Thread th3 = new Thread();
        Thread th4 = new Thread();
        Thread th5 = new Thread();

        ThreadGroup tg1 = th1.getThreadGroup();
        System.out.println(th1.getName() + " is belongs to " + tg1.getName());
        System.out.println(th2.getName() + " is belongs to " + th2.getName());
        System.out.println(th3.getName() + " is belongs to " + th3.getName());
        System.out.println(th4.getName() + " is belongs to " + th4.getName());
        System.out.println(th5.getName() + " is belongs to " + th5.getName());

        // CRT object CRT group object CRT group name
        System.out.println(Thread.currentThread().getThreadGroup().getName() + " group");

        ThreadGroup tg2 = new ThreadGroup("GrpA");
        Thread th6 = new Thread(tg2, "th6");
        System.out.println(th6.getName() + " " + th6.getThreadGroup().getName());

    }

}
