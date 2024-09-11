
import java.io.IOException; // Predefined method or reading and storing the value ....without deprected
import java.io.InputStreamReader;
import java.io.BufferedReader;
//import java.io.*;

class Test7 {
    public static void main(String[] args) throws IOException {
        BufferedReader add = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter 1st no ");
        int a = Integer.parseInt(add.readLine());

        System.out.print("Enter 2nd no ");
        int b = Integer.parseInt(add.readLine());

        int c = a + b;
        System.out.println("Result: " + c);

    }
}