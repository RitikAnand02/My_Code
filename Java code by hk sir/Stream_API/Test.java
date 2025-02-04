import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<>();
        al.add("a");
        al.add("b");
        al.add("c");
        al.add("d");
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(7);

        al.forEach(obj -> System.out.println(obj));
        System.out.println();

        // ============================================================================================================
        LinkedHashMap<Object, Object> lhm = new LinkedHashMap<>();
        lhm.put("a", 97);
        lhm.put("b", 98);
        lhm.put("c", 99);

        lhm.forEach((k, v) -> System.out.println(k + " " + v));
        System.out.println();

        // #3: Retrieve and print only String From ArrayList
        al.stream()
                .filter(obj -> obj instanceof String)
                .forEach(obj -> System.out.println(obj));
        System.out.println();

        // #4: Retrieve and print only Integer From ArrayList
        al.stream()
                .filter(obj -> obj instanceof Integer)
                .forEach(obj -> System.out.println(obj));
        System.out.println();

        // #5: Retrieve and print only even Integer Objects From ArrayList
        al.stream()
                .filter(obj -> obj instanceof Integer)
                .filter(obj -> ((int) obj) % 2 == 0)
                .forEach(System.out::println);
        System.out.println();

        // #6: Retrieve and print only Odd Integer Objects From ArrayList
        al.stream()
                .filter(obj -> obj instanceof Integer)
                .filter(obj -> ((int) obj) % 2 != 0)
                .forEach(System.out::println);
        System.out.println();

        // #7: Count numbers integers available in this AL
        long count = al.stream()
                .filter(obj -> obj instanceof Integer)
                .count();
        System.out.println("The number of Integer available in AL are :" + count);
        System.out.println();

        // #8: Count String available in this AL
        long count1 = al.stream()
                .filter(obj -> obj instanceof String)
                .count();
        System.out.println("The number of Integer available in AL are :" + count1);
        System.out.println();

        // #9: REteieve/collect all integers available in AL
        List<Object> list = al.stream()
                .filter(obj -> obj instanceof Integer)
                .toList();
        System.out.println(list);
        System.out.println();

        // #10: Retrieve all strings available in this AL and retrun them in upper case
        // "a" => mapping -> map()
        al.stream()
                .filter(obj -> obj instanceof String)
                .map(obj -> ((String) obj).toUpperCase())
                .forEach(System.out::println);
    }

}
