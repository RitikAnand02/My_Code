import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Vector;

public class Test6 {
    public static void main(String[] args) {
        Vector<Object> v1 = new Vector<>();

        v1.add("a");
        v1.add(5);
        v1.add("b");
        v1.add(6);
        v1.add("c");
        v1.add(7);

        Iterator<Object> itr1 = v1.iterator();
        while (itr1.hasNext()) {
            Object obj = itr1.next();
            if (obj instanceof String s)
                System.out.println(s.toUpperCase());
            else
                System.out.println(obj);
        }
        System.out.println();

        // ==============================================================================================

        ArrayList<Object> al = new ArrayList<>();

        al.add("a");
        al.add(5);
        al.add("b");
        al.add(6);
        al.add("c");
        al.add(7);

        Iterator<Object> itr2 = al.iterator();
        while (itr2.hasNext()) {
            Object obj = itr2.next();
            if (obj instanceof String s)
                System.out.println(s.toUpperCase());
            else
                System.out.println(obj);
        }
        System.out.println();

        // ==============================================================================================

        LinkedHashSet<Object> lhs = new LinkedHashSet<>();

        lhs.add("a");
        lhs.add(5);
        lhs.add("b");
        lhs.add(6);
        lhs.add("c");
        lhs.add(7);

        Iterator<Object> itr3 = al.iterator();
        while (itr3.hasNext()) {
            Object obj = itr3.next();
            if (obj instanceof String s)
                System.out.println(s.toUpperCase());
            else
                System.out.println(obj);
        }
        System.out.println();
    }

}
