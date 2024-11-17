public class Test3 { // cmd line read and print method...
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Error: Enter Values");
            return;
        }
        for (int i = 0; i < args.length; i++) {
            try {
                int a = Integer.parseInt(args[i]);
                System.out.println(a);
            } catch (NumberFormatException e) {

            }

        }

    }

}
