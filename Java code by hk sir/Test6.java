
import java.io.IOException; // Predefined method or reading and storing the value ....with diprected
import java.io.DataInputStream;
//import java.io.*;

class Test6 {
    public static void main(String[] args) throws IOException {
        DataInputStream add = new DataInputStream(System.in);

        System.out.print("Enter 1st no ");
        int a = Integer.parseInt(add.readLine());

        System.out.print("Enter 2nd no ");
        int b = Integer.parseInt(add.readLine());

        int c = a + b;
        System.out.println("Result: " + c);
        add.close();

    }
}