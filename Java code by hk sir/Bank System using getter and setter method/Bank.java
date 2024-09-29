/*
 Develop a program to create RWO BankAccount in Pw with the properties bankName, accNum, active.
 -provide access to above properties only via stter and getter methods to initialze, raed and modify its values.
 -Initalize those properties via setter methods .
 -Display those properties via display method.
 -If this account is active , display message account is in active status.
 else , display message account is in deactive status.
 */

class BankAccount {
    private boolean active;

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isActive() {
        return active;
    }
}

public class Bank {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();

        System.out.println(acc1.isActive()); // false

        if (acc1.isActive())
            System.out.println("Active");
        else
            System.out.println("Deactive"); // deactive

        acc1.setActive(true);

        System.out.println(acc1.isActive() ? "Active" : "Deactive"); // active
    }

}
