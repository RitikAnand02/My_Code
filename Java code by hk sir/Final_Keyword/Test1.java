import java.util.*;

public class Test1 {
    final int x = 10;
    final int y;
    final int z;
    {
        System.out.println("\nNSB execution is start");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for y: ");
        y = sc.nextInt();
        System.out.println("NSB execution is end");
    }

    Test1() {
        z = 15;
        System.out.println("no-parm constructor is executed");
    }

    Test1(int z) {
        this.z = z;
        System.out.println("int-param constructor is executed");
    }

    public static void main(String[] args) {
        System.out.println("main method start");

        Test1 t1 = new Test1();
        Test1 t2 = new Test1();

        Test1 t3 = new Test1(18);
        Test1 t4 = new Test1(19);

        System.out.println(t1.x + "  " + t1.y + "  " + t1.z);
        System.out.println(t2.x + "  " + t2.y + "  " + t2.z);
        System.out.println(t3.x + "  " + t3.y + "  " + t3.z);
        System.out.println(t4.x + "  " + t4.y + "  " + t4.z);

        System.out.println("main method end");

    }

}
