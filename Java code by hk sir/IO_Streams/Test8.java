import java.io.FileWriter;
import java.io.IOException;

public class Test8 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("Txt.txt");
        fw.write("asdfg");
        fw.write("qwerty");
        fw.write("\nlkjh");
        fw.write("\nzxcv");
        fw.flush(); // mandatory to save data in file

        System.out.println("data is saved");
    }

}
