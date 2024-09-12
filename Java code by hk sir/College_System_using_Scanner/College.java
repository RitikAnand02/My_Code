/*
 ReDevelop a program to craete RWO Student in pW Read student Values and store inside its isntance and 
 display values on console... using Scanner..
 */

import java.util.Scanner;

public class College {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        Student s1 = new Student();
        System.out.println("Student instance is created for storing given student values\n");
        System.out.println("Enter Student Values");

        System.out.print("Enter sno\t\t: ");
        s1.sno = scn.nextInt();
        scn.nextLine();

        System.out.print("Enter sname\t\t: ");
        s1.sname = scn.nextLine();

        System.out.print("Enter course\t\t: ");
        s1.course = scn.nextLine();

        System.out.print("Enter fee\t\t: ");
        s1.fee = scn.nextDouble();

        System.out.print("Enter email\t\t: ");
        s1.email = scn.next();

        System.out.print("Enter mobile\t\t: ");
        s1.mobile = scn.nextLong();

        System.out.print("Enter gender\t\t: ");
        s1.gender = scn.next().charAt(0);

        System.out.print("Enter Completed\t\t: ");
        s1.stding = scn.nextBoolean();

        System.out.println("\nvalues are stored in student instance\n");

        System.out.println("Student object values\n");
        System.out.println("  sno\t\t:" + s1.sno);
        System.out.println("  sname\t\t:" + s1.sname);
        System.out.println("  course\t:" + s1.course);
        System.out.println("  fee\t\t:" + s1.fee);
        System.out.println("  email\t\t:" + s1.email);
        System.out.println("  mobile\t:" + s1.mobile);
        System.out.println("  gender\t:" + s1.gender);
        System.out.println("  stding\t:" + s1.stding);
        scn.close();

    }
}
