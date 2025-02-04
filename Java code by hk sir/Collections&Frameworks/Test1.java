import java.util.EnumSet;

enum Color {
    RED, GREEN, YELLOW, BLACK, BLUE, PINK
}

public class Test1 {
    public static void main(String[] args) {
        EnumSet<Color> e1 = EnumSet.noneOf(Color.class);
        EnumSet<Color> e2 = EnumSet.allOf(Color.class);
        EnumSet<Color> e3 = EnumSet.of(Color.YELLOW, Color.GREEN, Color.BLACK);
        EnumSet<Color> e4 = EnumSet.copyOf(e3);
        EnumSet<Color> e5 = EnumSet.complementOf(e3);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
        System.out.println(e5);
    }
}