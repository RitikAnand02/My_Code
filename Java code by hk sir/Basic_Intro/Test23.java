/*
 Determine the effect upon primitive values and objects references when they are passed as arugments and if they are 
 modified in that method using parameter...
 */

class Example {
    int x = 10;

    void m1(int p) {
        p = 50;
    }

    void m2(Example e) {
        e = new Example(); //Ex333
    }

    void m3(Example e) {
        e.x = 15;
    }

    void m4(Example e) {
        e = new Example();
        e.x = 16;
    }

    void m5(Example e) {
        e.x = 19;
        e = new Example();
        e.x = 20;
    }
}

public class Test23 {
    public static void main(String[] args) {
        Example e1 = new Example();//Ex111
        int q = 18;
        System.out.println("b m c q:" + q);  //18
        e1.m1(q);
        System.out.println("a m c q:" + q); //18

        Example e2 = new Example();
        System.out.println("b m c e2:" + e2); //Ex222 //wrong

        e1.m2(e2);
        System.out.println("a m c e2:" + e2);//Ex333
        System.out.println("b m c e2:" + e2);//Ex333
        System.out.println("b m c e2.x:" + e2.x);//10

        e1.m3(e2);
        System.out.println("a m c e2.x:" + e2.x);//15
        System.out.println("a m c e2:" + e2);//Ex333
        System.out.println("b m c e2.x:" + e2.x);//15

        e1.m4(e2);
        System.out.println("a m c e2.x:" + e2.x);//16
        System.out.println("b m c e2.x:" + e2.x);//16

        e1.m5(e2);
        System.out.println("a m c e2.x:" + e2.x);//19
        System.out.println("b m c e2.x:" + e2.x);//19

    }

}
