import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test10 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("abc.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeByte(97);
        dos.writeShort(98);
        dos.writeInt(99);
        dos.writeLong(100);
        dos.writeFloat(101);
        dos.writeDouble(102);
        dos.writeChar(103);
        dos.writeBoolean(true);
        dos.writeUTF("Hari");

        System.out.println("data saved in file");
    }
}
