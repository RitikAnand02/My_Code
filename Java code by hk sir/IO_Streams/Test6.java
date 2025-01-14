import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test6 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("abc.txt");
        BufferedReader br = new BufferedReader(fr);

        // String line = br.readLine();
        // System.out.println(line);
        // System.out.println(br.readLine());
        // System.out.println(br.readLine());

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);

        }

    }
}
