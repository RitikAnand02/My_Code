import java.io.FileInputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("abc.txt");
        int data1 = fis.read();
        int data2 = fis.read();
        int data3 = fis.read();
        int data4 = fis.read();

        System.out.println(data1 + " " + (char) data1);
        System.out.println(data2 + " " + (char) data2);
        System.out.println(data3 + " " + (char) data3);
        System.out.println(data4 + " " + (char) data4);

    }

}
