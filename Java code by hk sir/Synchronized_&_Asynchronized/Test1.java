class WaitRule {
    // void m1(){ //Rule #2: we must call in synchronized block
    synchronized void m1() {
        try {
            System.out.println("before wait() call");
            // wait(); //Rule #1: handle IE, else CE
            wait(5000);
            System.out.println("after wait() call");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Test1 {
    public static void main(String[] args) {
        WaitRule wr = new WaitRule();
        wr.m1();
    }

}
