public class Test15 {
    public static void main(String[] args) {
        Thread th1 = new Thread();
        System.out.println(th1);

        Thread th2 = new Thread();
        System.out.println(th2);

        Thread th3 = new Thread("child-3");
        System.out.println(th3);

        Thread th4 = new Thread().currentThread();
        System.out.println(th4);
    }
}
