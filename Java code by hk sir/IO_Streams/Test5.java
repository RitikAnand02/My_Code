import java.io.FileReader;
import java.io.IOException;

public class Test5 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("abc.txt");
        // System.out.println(fr.read());
        // System.out.println(fr.read());
        // System.out.println(fr.read());
        // System.out.println(fr.read());
        // System.out.println(fr.read());
        // System.out.println(fr.read());

        int data;
        while ((data = fr.read()) != -1) {
            System.out.println(data + " " + (char) data);

        }

    }

}
