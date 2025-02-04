import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<>();

        // Operation #1: is empty
        System.out.println(al.isEmpty());

        // Operation #2: size of the collection(no of elements stored)
        System.out.println(al.size());

        // Operation #3: printing collection (means printing elements in collection)
        System.out.println(al);

        // Operation #4: adding elements to collections
        System.out.println(al.add("a"));
        System.out.println(al.add(5));
        System.out.println(al.add("b"));
        System.out.println(al.add(6));
        System.out.println(al.add("c"));
        System.out.println(al.add(7));

        System.out.println(al);
        System.out.println(al.isEmpty());
        System.out.println(al.size());

        System.out.println(al.contains("a"));
        System.out.println(al.contains(new String("a")));
    }
}