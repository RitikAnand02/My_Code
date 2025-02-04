import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<>();
        al.add("a");
        al.add(5);
        al.add("b");
        al.add(6);
        al.add("c");
        al.add(7);

        System.out.println(al);

        // Approach #1: by using get (index) methods
        // public Object get (index) throws IndexOutOFBoundException
        // index >=0 and <size

        System.out.println(al.get(0));
        System.out.println(al.get(3));
        // System.out.println(al.get(-3));
        // System.out.println(al.get(6));

        Object obj = al.get(0);
        System.out.println(obj);

        if (obj instanceof String) { // Old style
            String s1 = (String) obj;
            System.out.println(s1.toUpperCase());
        }

        if (obj instanceof String s1) { // Java 14-16v: pattern matching for instanceOf
            System.out.println(s1.toUpperCase());
        }
        System.out.println();

        // retriving all objects available in al
        for (int i = 0; i < al.size(); i++) {
            obj = al.get(i);
            System.out.println(obj + " ");
        }
        System.out.println();

        // retriving all objects available in al
        // performing operations and printing
        for (int i = 0; i < al.size(); i++) {
            obj = al.get(i);
            if (obj instanceof String s1)
                System.out.println(s1.toUpperCase() + " ");
            else
                System.out.println(obj + " ");
        }
    }

}
