/*
 * Develop Additon Porgram using System Property Approch...
 */

public class Test12 {
    public static void main(String[] args) {
        int a = Integer.parseInt(System.getProperty("fno"));
        int b = Integer.parseInt(System.getProperty("sno"));
        int c = a + b;
        System.out.println("Result:" + c);

    }

}