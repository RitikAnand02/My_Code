package Object_Creation;

class Example{
   static void m1 (Object obj){
    if(obj instanceof C){
        System.out.println("C obj");
        C c1 = (C) obj;
        System.out.println(c1.x);
        System.out.println(c1.y);
        System.out.println(c1.z);
    }
    else if(obj instanceof B){
        System.out.println("B obj");
        B b1 = (B) obj;
        System.out.println(b1.x);
        System.out.println(b1.y);
       
    }
    else if(obj instanceof A){
        System.out.println("A obj");
        System.out.println((A)obj);
    }
    else {
        System.out.println("object is not A type");
    }
   }
}

class Test {
    public static void main(String[] args) {
        Example.m1(new A());
        Example.m1(new B());
        Example.m1(new C());
      //  Example.m1(new D());
        Example.m1(new String());
        Example.m1(new Object());
    }
    
}
