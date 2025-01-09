import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException, InterruptedException {
        FileOutputStream fos = new FileOutputStream("abc.txt");
        fos.write(97);

        System.out.println("data is saved");

        fos.close();
        fos = null;

        System.out.println("connection closed");

        System.out.println("program paused");
        Thread.sleep(10000);

    }

}
