class SuperClass {
    SuperClass() {
        this(10);
        System.out.println("superclass no-arg");
    }

    SuperClass(int a) {
        this("abc");
        System.out.println("superclass int-arg");
    }

    SuperClass(String str) {
        System.out.println("superclass string-arg");
    }
}

class SubClass extends SuperClass {
    SubClass() {
        this(10);
        System.out.println("SubClass no-arg");
    }

    SubClass(int a) {
        this("abc");
        System.out.println("SubClass int-arg");
    }

    SubClass(String str) {
        System.out.println("SubClass string-arg");
    }
}

public class Test3 {
    public static void main(String[] args) {
        new SubClass();
        System.out.println();
        new SubClass(10);
        System.out.println();
        new SubClass("abc");
    }

}
