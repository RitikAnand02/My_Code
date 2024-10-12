class Example {
    int x = 10;
    {
        System.out.println("Ex NSB");
    }

    Example() {
        System.out.println("Ex cons");
    }
}

class Test34 extends Example {
    int y = 20;

    {
        System.out.println("Sa NSB");
    }

    Test34() {
        System.out.println("Sa cons");
    }

    public static void main(String[] args) {
        Test34 s1 = new Test34();
    }
}
