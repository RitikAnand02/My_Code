class A{
    A(){
        System.out.println("A NPC");
    }

    A(int a){
        System.out.println("A IPC");
    }
}

class B extends A{
    B(){
        System.out.println("B NPC");
    }

    B(int a){
        System.out.println("B IPC");
    }
}

public class Test {
    public static void main(String[] args) {
        new B();
        new B(5);
    }
    
}
