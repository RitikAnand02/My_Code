import java.util.TreeSet;

public class Test2 {
    public static void main(String[] args) {
        TreeSet<Object> ts1 = new TreeSet<>();
        ts1.add("a");
        ts1.add("c");
        ts1.add("b");

        // ts1.add(5); // Heterogeneous objects are not allowed
        // ts1.add(null); // null is allowed.
        System.out.println(ts1);

        TreeSet<Integer> ts2 = new TreeSet<>();
        ts2.add(5);
        ts2.add(7);
        ts2.add(6);
        System.out.println(ts2);
    }
}
