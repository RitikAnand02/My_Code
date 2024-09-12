
// Login_Validator....

import java.io.Console;

public class Test11 {
    public static void main(String[] args) {
        Console cns = System.console();
        System.out.print("Enter Username: ");
        String user = cns.readLine();

        System.out.print("Enter Password: ");
        String pass = new String(cns.readPassword());

        System.out.println("You have eneterd");
        System.out.println(" Useranme: " + user);
        System.out.println(" Password: " + pass);

    }

}
