@FunctionalInterface
interface AO<T> { // genric functional interface
    void ao(T t1, T t2);
}

public class Test1 {
    public static void main(String[] args) {
        AO<Integer> a1 = (Integer t1, Integer t2) -> System.out.println(t1 + t2);
        a1.ao(10, 20);
        // a1.ao(10.5, 20.5);

        AO<Double> a2 = (Double t1, Double t2) -> System.out.println(t1 + t2);
        // a2.ao(10, 20); // int -> Integer -> can not be assigned to double variable
        // int -> double is allowed
        // bur Integer -> Double is not allowed

        a2.ao(10.0, 20.0);

        AO<String> a3 = (String t1, String t2) -> System.out.println(t1 + t2);
        a3.ao("H", "k");

        AO<Object> a4 = (Object t1, Object t2) -> System.out.println(t1 + " " + t2);
        a4.ao(5, 10.5);

        a4.ao("H", "k");

        // AO<Object> a5 = (Object t1, Object t2) -> System.out.println((int)(t1 + t2));
        // a5.ao(5, 10);
        // Here we cannot perform arthemetic operation because object cannot do any
        // calculation task it just print the values as it is...
    }
}
