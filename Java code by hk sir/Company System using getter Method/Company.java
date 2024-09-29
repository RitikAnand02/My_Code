/*
 Develop a program to create the RWO Empolyee in pw.
 create Empolyee object with the properties eno, ename, sal, dept.

 -provide accecss to above properties for rad and modifying their values only via setter and getter methods.
 -intialize the above properties via setter methods.
 -Display the above properties via display method.
 -increase the salary of an employee by 20%
 -Display updated salary of this empolyee.
 */

class Empolyee {
    private int eno;
    private String ename;
    private double sal;

    public void setEno(int eno) {
        this.eno = eno;
    }

    public int getEno() {
        return eno;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEname() {
        return ename;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public double getSal() {
        return sal;
    }

    public void display() {
        System.out.println("eno: " + eno);
        System.out.println("ename: " + ename);
        System.out.println("sal: " + sal);
    }
}

public class Company {
    public static void main(String[] args) {
        Empolyee e1 = new Empolyee();

      //  e1.display();

        e1.setEno(101);
        e1.setEname("Ritik");
        e1.setSal(1000);

        e1.display();

        e1.setSal(e1.getSal() + e1.getSal() * 20 / 100);

        System.out.println(e1.getSal());

    }

}
