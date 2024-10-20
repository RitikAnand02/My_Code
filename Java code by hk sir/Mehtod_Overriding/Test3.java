class Call {
    public void foo(Object o) {
        System.out.println("Object parameter");
    }

    public void foo(String s) {
        System.out.println("String parameter");
    }

    public void foo(Integer i) {
        System.out.println("Integer parameter");
    }
}

public class Test3 {
    public static void main(String[] args) {
        Call c1 = new Call();

        Object ob1 = new Object();
        Object ob2 = "Hk";
        Object ob3 = 7277;

        c1.foo(ob1);
        c1.foo(ob2);
        c1.foo(ob2);

        System.out.println();
        c1.foo("Bk");
        c1.foo(7777);

        System.out.println();
        c1.foo((String) ob2);
        c1.foo((Integer) ob3);

    }

}
