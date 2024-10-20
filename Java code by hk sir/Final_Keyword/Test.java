
import java.util.*;

public class Test {
    static final int a = 10;
    static final int b;

    static {
        System.out.println("static block execution start");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for b: ");
        b = sc.nextInt();
        System.out.println("ststic block exeution end");
        sc.close();
    }

    public static void main(String[] args) {
        System.out.println("\n main method exeution start");
        System.out.println("a :" + a);
        System.out.println("b :" + b);
        System.out.println("main method execution end");
    }

}
