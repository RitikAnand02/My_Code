class A {
    static void m1() {
        Thread th = new Thread().currentThread();
        String name = th.getName();
        System.out.println("m1 is executed in " + name);
    }
}

class MyThraed9 extends Thread {
    @Override
    public void run() {
        A.m1();
    }
}

public class Test13 {
    public static void main(String[] args) {
        Thread th1 = new Thread();

        System.out.println(th1.getId());
        System.out.println(th1.getName());
        System.out.println(th1.getPriority());
        System.out.println();

        th1.setName("xyz");
        th1.setPriority(9);

        System.out.println(th1.getId());
        System.out.println(th1.getName());
        System.out.println(th1.getPriority());
        System.out.println();

        A.m1();

        MyThraed9 mt1 = new MyThraed9();
        mt1.start();

    }

}
