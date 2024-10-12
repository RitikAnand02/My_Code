class A {
    A() {
        System.out.println("In super calss A " + this);
    }

}

class B extends A {
    B() {
        System.out.println("In super calss B " + this);
    }
}

class Test37 {
    public static void main(String[] args) {
        B b1 = new B();
    }
}