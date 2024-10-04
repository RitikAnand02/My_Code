public class Test24 {

    static Test24 e1 = new Test24();
    static {
        System.out.println("SB");
    }

    {
        System.out.println("NSB");
    }

    Test24() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        System.out.println("main");
        Test24 e2 = new Test24();
    }

    static int a = 10;
    int x = 20;

}
