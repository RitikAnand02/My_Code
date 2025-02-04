import java.util.ArrayList;
import java.util.ListIterator;

public class Test8 {
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<>();

        al.add("a");
        al.add(5);
        al.add("b");
        al.add(6);
        al.add("c");
        al.add(7);
        System.out.println(al);

        int count = 0;
        ListIterator<Object> litr = al.listIterator();
        while (litr.hasNext()) {
            Object obj = litr.next();

            if (obj instanceof String s) {
                litr.set(s.toUpperCase());
            } else if (obj instanceof Integer) {
                if (count == 0)
                    litr.add(20);
                count++;
            }
        }
        System.out.println(al);
    }

}
