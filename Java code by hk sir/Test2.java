public class Test2 { // cmd line read and print method...
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Error: Enter Values");
            return;
        }
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

    }

}
