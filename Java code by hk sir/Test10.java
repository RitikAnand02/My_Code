
// Login_Validator....
import java.util.Scanner;
// import java.util.*;

public class Test10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String user = scn.next();

        System.out.print("Enter Password: ");
        String pass = scn.next();

        System.out.println("You have eneterd");
        System.out.println(" Useranme: " + user);
        System.out.println(" Password: " + pass);
        scn.close();
    }

}
