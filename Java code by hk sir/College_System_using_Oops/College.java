public class College {
    public static void main(String[] args) {
        // Creating two instance for the objects hk and bk...

        Student s1 = new Student();
        Student s2 = new Student();

        // Initializing s1 instace with the objects hk values...

        s1.sno = 101;
        s1.sname = "Hk";
        s1.course = "cj";
        s1.fee = 3500;

        // Initializing s2 instace with the objects bk values...

        s2.sno = 102;
        s2.sname = "Bk";
        s2.course = "Acting";
        s2.fee = 5000;

        // Printing above two objects values ( Id card printing)

        System.out.println("s1 objects values");
        System.out.println("-------------------------------");
        System.out.println(" s1.sno\t\t: " + s1.sno);
        System.out.println(" s1.sname\t: " + s1.sname);
        System.out.println(" s1.course\t: " + s1.course);
        System.out.println(" s1.fee\t\t: " + s1.fee);

        System.out.println("s2 objects values");
        System.out.println("-------------------------------");
        System.out.println(" s2.sno\t\t: " + s2.sno);
        System.out.println(" s2.sname\t: " + s2.sname);
        System.out.println(" s2.course\t: " + s2.course);
        System.out.println(" s2.fee\t\t: " + s2.fee);

    }

}
