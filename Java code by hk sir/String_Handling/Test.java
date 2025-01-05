import java.sql.Struct;

public class Test {
    public static void main(String[] args) {
        String s1 = new String();

        String s2 = new String("abc");
        String s3 = new String(new StringBuffer("abc"));
        String s4 = new String(new StringBuilder("abc"));

        char[] ch = { 'a', 'b', 'c', 'd', 'e', 'f' };
        String s5 = new String(ch);
        String s6 = new String(ch, 2, 3);

        byte[] b = { 97, 98, 99, 100, 101, 102 };
        String s7 = new String(b);
        String s8 = new String(b, 2, 3);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);
        System.out.println(s8);

        // Rule:
        // String s9 = new String(null); // CE
        // String s10 = new String((String) null);
        // System.out.println(s10); // RE

        String s11 = null;
        System.out.println("s11: " + s11);

        String s12 = "";
        String s13 = new String();
        String s14 = new String("null");

        System.out.println("s12: " + s12);
        System.out.println("s13: " + s13);
        System.out.println("s14: " + s14);

    }

}
