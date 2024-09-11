import java.io.IOException; // cmd line read and print method...

public class Test4 {
    public static void main(String[] args) throws IOException {
        int data;
        System.out.print("Enter 1st no ");
        String value = "";
        while ((data = System.in.read()) != 13) {
            value = value + (char) data;
        }
        System.in.read();
        int a = Integer.parseInt(value);
        System.out.print("Enter 2nd no ");
        value = "";
        while ((data = System.in.read()) != 13) {
            value = value + (char) data;
        }
        System.in.read();
        int b = Integer.parseInt(value);
        int c = a + b;
        System.out.println("Result: " + c);

    }

}
