import java.util.ArrayList;

public class Test9 {
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<>();

        al.add("a");
        al.add(5);
        al.add("b");
        al.add(6);
        al.add("c");
        al.add(7);

        for (Object obj : al) {
            System.out.println(obj);
        }

        al.forEach(obj -> System.out.println(obj));

        al.forEach(System.out::println);
    }

}
