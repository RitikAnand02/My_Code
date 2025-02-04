import java.util.ArrayList;
import java.util.Iterator;

public class Test7 {
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<>();

        al.add("a");
        al.add(5);
        al.add("b");
        al.add(6);
        al.add("c");
        al.add(7);
        System.out.println(al);

        Iterator<Object> itr = al.iterator();
        while (itr.hasNext()) {
            Object obj = itr.next();
            if (obj instanceof String s)
                itr.remove();
        }
        System.out.println(al);
    }
}
