/*
 *  This class is Blue print of bank object and executable class for BankAccount object operations. 
 */

public class Bank {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount();

        BankAccount acc2 = new BankAccount();

        acc1.bankName = "HDFC";
        acc1.branchName = "SR Nagar";
        acc1.ifsc = "HD123SR";
        acc1.accNum = 123456764353L;
        acc1.accHName = "HK";
        acc1.balance = 9845363;

        acc2.bankName = "HDFC";
        acc2.branchName = "SR Nagar";
        acc2.ifsc = "HD123SR";
        acc2.accNum = 123456764373L;
        acc2.accHName = "BK";
        acc2.balance = 9845365;

        System.out.println("acc1 detials");
        System.out.println("------------------------------");
        System.out.println(" acc1.bankName\t: " + acc1.bankName);
        System.out.println(" acc1.branchName: " + acc1.branchName);
        System.out.println(" acc1.ifsc\t: " + acc1.ifsc);
        System.out.println(" acc1.accNum\t: " + acc1.accNum);
        System.out.println(" acc1.accHName\t: " + acc1.accHName);
        System.out.println(" acc1.balance\t: " + acc1.balance);

        System.out.println("\nacc2 detials");
        System.out.println("------------------------------");
        System.out.println(" acc2.bankName\t: " + acc2.bankName);
        System.out.println(" acc2.branchName: " + acc2.branchName);
        System.out.println(" acc2.ifsc\t: " + acc2.ifsc);
        System.out.println(" acc2.accNum\t: " + acc2.accNum);
        System.out.println(" acc2.accHName\t: " + acc2.accHName);
        System.out.println(" acc2.balance\t: " + acc2.balance);

    }

}
