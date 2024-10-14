class A{
    static int a = 10;
    int x = 20;
}

class B extends A{
    static int a = 30;
    static int b = 40;
    int x = 50;
    int y = 60;

    void m1(){
        System.out.println(this.a + "  " + super.a);
        System.out.println(this.x + "  " + super.x);
        System.out.println(this.b + "  " + this.y);
      //  System.out.println(super.b+""+super.y);
    }
}

public class Test2 {
    public static void main(String[] args) {
        B b1 = new B();
        b1.m1();
    }
    
}
