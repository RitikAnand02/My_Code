import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("abc.txt");
        fos.write(97);
        fos.write('b');
        fos.write(500);
        fos.write("hari".getBytes());

        System.out.println("data is saved");
        fos.close();
        fos = null;

        System.out.println("connection closed");
    }
}
