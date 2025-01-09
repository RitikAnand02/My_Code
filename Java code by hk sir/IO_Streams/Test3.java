import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("abc.txt");

        byte[] data = new byte[fis.available()];
        fis.read(data);
        System.out.println(Arrays.toString(data));
        System.out.println();

        for (int i = 0; i < data.length; i++) {
            int value = data[i];
            System.out.println(value + " " + (char) value);
        }

    }

}
