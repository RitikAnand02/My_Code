public class Test_Finder {
    public static void main(String[] args) {
        try {
            int res = Type_Finder.evenOdd(10);
            // int res = Type_Finder.evenOdd(15);
            System.out.println("Result " + res);
        } catch (IllegalAccessException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
