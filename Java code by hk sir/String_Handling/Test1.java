import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String: ");
        String str = sc.nextLine();
        String[] words = str.split(" ");

        String revStr = "";
        for (int i = words.length - 1; i >= 0; i--) {
            revStr = revStr + words[i] + " ";
        }
        revStr = revStr.trim();

        System.out.println("Original String: " + str + " " + str.length());
        System.out.println("Reversed String: " + revStr + " " + revStr.length());
    }

}
