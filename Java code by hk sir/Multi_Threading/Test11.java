class MyThraed8 extends Thread {
    public MyThraed8() {
        super();
    }

    public MyThraed8(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + " run");
    }
}

public class Test11 {
    public static void main(String[] args) {
        MyThraed8 mt1 = new MyThraed8();
        MyThraed8 mt2 = new MyThraed8();
        MyThraed8 mt3 = new MyThraed8();

        System.out.println(mt1.getName());
        System.out.println(mt2.getName());
        System.out.println(mt3.getName());
        System.out.println();

        mt1.setName("child1"); // Allowed But Not Recommended
        mt2.setName("child2");

        System.out.println(mt1.getName());
        System.out.println(mt2.getName());
        System.out.println(mt3.getName());
        System.out.println();

        mt1.start();
        mt2.start();
        mt3.start();

    }

}
