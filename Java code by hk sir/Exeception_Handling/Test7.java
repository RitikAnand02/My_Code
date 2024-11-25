import java.io.PrintStream;

public class Test7 {
    public static void main(String[] args) {
        try (
                PrintStream ps = new PrintStream(System.out);) {
            ps.print("Ritik");
        } // ps.close(); => close System.out connection also

        System.out.println("Hello");

        // this message is not printed on console
        // because System.out connection to the console
        // wak already closed because ps.close();
    }

}
