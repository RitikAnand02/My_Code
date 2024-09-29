import java.util.Scanner;

public class Test6 {
    static int a;
    static {
        System.out.println("SB");
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a: ");
        a = scn.nextInt();
        System.out.println("Value is stored in SV");
        scn.close();
    }

    public static void main(String[] args) {
        System.out.println("main");
        System.out.println(" a: " + a);

    }

}
