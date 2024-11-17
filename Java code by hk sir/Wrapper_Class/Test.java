public class Test {
    public static void main(String[] args) {
        Integer io1 = new Integer(50);
        Integer io2 = new Integer(50);

        System.out.println(io1 == io2); // ref comparison

        System.out.println(io1.equals(io2)); // ref comparsion -> object comparison
        // data comparsion -> overridden
        System.out.println();

        Double do1 = new Double(50.6);
        // System.out.println(io1==do1);
        System.out.println(io1.equals(do1));
        System.out.println();

        int i1 = 10;
        double d1 = 10.5;
        System.out.println(i1 == d1);
        // System.err.println(i1.equals(d1));

    }

}
