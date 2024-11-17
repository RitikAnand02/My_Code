import java.io.IOException;  // cmd line argument read method...

public class Test5 {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter 1st no ");
        int a = Integer.parseInt(readLine());

        System.out.print("Enter 2nd no ");
        int b = Integer.parseInt(readLine());

        int c = a + b;
        System.out.println("Result: " + c);

    }

    static String readLine() throws IOException {
        String value = "";
        int data;
        while ((data = System.in.read()) != 13) {
            value = value + (char) data;

        }
        System.in.read();
        return value;
    }
}
