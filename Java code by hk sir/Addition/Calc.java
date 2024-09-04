public class Calc {
    public static void main(String[] args) {
        try {
            // int res = Addition.add(-5, 6);
            int res = Addition.add(5, 6);
            System.out.println("Result:" + res);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}
