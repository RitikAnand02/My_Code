import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("abc.txt"));

        StringBuilder lineBuilder = new StringBuilder();
        while (br.ready()) {
            lineBuilder.append(br.readLine());
            lineBuilder.append("\n");

        }

        System.out.println(lineBuilder);
    }

}
