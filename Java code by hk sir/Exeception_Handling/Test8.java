import java.io.FileOutputStream;
import java.io.IOException;

public class Test8 {
    public static void main(String[] args) throws IOException {
        // upto java8v we can not use a autocloseable object as a resource if it
        // already created before try
        FileOutputStream fos = new FileOutputStream("abc.txt");
        // try (fos){ //CE:
        try (FileOutputStream fos2 = fos) {
            fos.write(97);
        }

        // but from java 9v onward we no need to create extra variable
        // we can use it already as resource
        try (fos) {// NO CE:
            fos.write(98);
        }
    }

}
