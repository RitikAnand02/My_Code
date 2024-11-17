import java.util.InputMismatchException;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        while (true) {
            try {
                System.out.print("Enter 1st no: ");
                a = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Enter Only Integers\n");
                sc.nextLine(); // making Scanner empty for pausing program in next iteraton.
            }

        }

        while (true) {
            try {
                System.out.print("Enter 2nd no: ");
                int b = sc.nextInt();

                int c = a / b;
                System.out.println("Result: " + c);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Enter Only Integers");
                sc.nextLine();
            } catch (ArithmeticException e) {
                System.out.println("Do not pass zero\n");
            }
        }
    }

}
