
import java.util.Scanner;

class Test8 {
    public static void main(String[] args) {
        Scanner add = new Scanner(System.in);

        System.out.print("Enter 1st no ");
        int a = add.nextInt();

        System.out.print("Enter 2nd no ");
        int b = add.nextInt();

        int c = a + b;
        System.out.println("Result: " + c);
        add.close();

    }
}