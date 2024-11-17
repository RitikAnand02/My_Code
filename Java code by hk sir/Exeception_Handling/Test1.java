
public class Test1 {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a / b;
            System.out.println("Result: " + c);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please pass atleast two integers as below");
            System.out.println(">java Test1 10 2");
        } catch (NumberFormatException e) {
            System.out.println("Please pass only integers");
        } catch (ArithmeticException e) {
            System.out.println("Please do not pass zero as second value");
        }
    }

}
