import java.util.Enumeration;
import java.util.Vector;

public class Test5 {
    public static void main(String[] args) {
        Vector<Object> v1 = new Vector<>();

        v1.add("a");
        v1.add(5);
        v1.add("b");
        v1.add(6);
        v1.add("c");
        v1.add(7);

        Enumeration<Object> e1 = v1.elements();
        while (e1.hasMoreElements()) {
            Object obj = e1.nextElement();
            if (obj instanceof String s)
                System.out.println(s.toUpperCase());
            else
                System.out.println(obj);
        }
    }

}
