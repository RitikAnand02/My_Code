public class Test12 {
    public static void main(String[] args) {
        Thread th1 = new Thread();
        Thread th2 = new Thread();
        Thread th3 = new Thread();

        System.out.println(th1.getName() + " " + th1.getId());
        System.out.println(th2.getName() + " " + th2.getId());
        System.out.println(th3.getName() + " " + th3.getId());
    }

}
