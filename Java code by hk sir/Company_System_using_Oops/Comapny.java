public class Comapny {
    public static void main(String[] args) {
        // Creating two instance for the objects hk and bk...

        Empolyee e1 = new Empolyee();
        Empolyee e2 = new Empolyee();

        // Initializing e1 instace with the objects hk values...

        e1.eno = 101;
        e1.ename = "Hk";
        e1.dept = "cj";
        e1.salary = 9999999;

        // Initializing e2 instace with the objects bk values...

        e2.eno = 102;
        e2.ename = "Bk";
        e2.dept = "Acting";
        e2.salary = 115000;

        // Printing above two objects values ( Id card printing)

        System.out.println("e1 objects values");
        System.out.println("-------------------------------");
        System.out.println(" e1.eno\t\t: " + e1.eno);
        System.out.println(" e1.ename\t: " + e1.ename);
        System.out.println(" e1.dept\t: " + e1.dept);
        System.out.println(" e1.salary\t: " + e1.salary);

        System.out.println("\n e2 objects values");
        System.out.println("-------------------------------");
        System.out.println(" e2.eno\t\t: " + e2.eno);
        System.out.println(" e2.ename\t: " + e2.ename);
        System.out.println(" e2.dept\t: " + e2.dept);
        System.out.println(" e2.salary\t: " + e2.salary);

    }

}
