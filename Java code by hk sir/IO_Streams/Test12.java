import java.io.File;
import java.io.IOException;

public class Test12 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("xyz.txt");
        System.out.println("File Object is created");
        System.out.println(file1.exists());
        System.out.println(file1.isFile());
        System.out.println(file1.isDirectory());
        System.out.println(file1.isHidden());
        System.out.println(file1.canExecute());
        System.out.println(file1.canRead());
        System.out.println(file1.canWrite());

        boolean newFileCreated = file1.createNewFile();
        System.out.println(newFileCreated);
        file1.setReadOnly();
        System.out.println(file1.canWrite());
        System.out.println();

        File file2 = new File("pqr");
        file2.mkdir();
        System.out.println(file2.exists());
        System.out.println(file2.isFile());
        System.out.println(file2.isDirectory());

        File file3 = new File("mno", "stv");
        file3.mkdirs();
        System.out.println("directories are created");

        file1.delete();
        System.out.println(file1 + " is delete");

        file2.delete();
        System.out.println(file2 + " is delete");

        file3.delete();
        System.out.println(file3 + " is delete");

    }

}
