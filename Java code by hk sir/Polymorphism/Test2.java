class Bank {
    // method overloading poly
    void deposit(double cash) {
        System.out.println("Bank deposit(double) cash");
    }

    void deposit(String cheque) {
        System.out.println("Bank deposit(String) cheque");
    }

    void deposit(long accNum1, long accNum2) {
        System.out.println("Bank deposit(Transfer) money");
    }

    static void bankName() {
        System.out.println("Bank class bankName");
    }
}

class HDFCBank extends Bank {
    // method overriding poly
    void deposit(double cash) {
        System.out.println("HDFCBank deposit(double) cash");
    }

    void payInterest() {
        System.out.println("HDFCBank payInterest");
    }

}

public class Test2 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        // bank.deposit();

        bank.deposit(5000);
        bank.deposit(1, 2);
        bank.deposit("5000");

        System.out.println();

        HDFCBank hbank = new HDFCBank();
        hbank.deposit(5000);
        hbank.deposit("5000");
        hbank.payInterest();

        System.out.println();

        Bank bank2 = new HDFCBank();
        bank2.deposit(5000);
        bank2.deposit("5000");
        // bank2.payInterest();
        bank2.bankName();
    }

}
