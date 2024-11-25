import java.io.FileOutputStream;
import java.io.IOException;

public class Test6 {
    public static void main(String[] args) {
        // java 7v: try-with-resources
        try (
                // Resource object is created
                FileOutputStream fos2 = new FileOutputStream("ritik.txt");) {
            // using this project
            fos2.write(97);
            System.out.println("Data is Saved");
        } catch (IOException e) {
            e.printStackTrace();
        }// finally block with close() method call is added by compiler automatically
    }

}
