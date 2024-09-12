/*
 * Develop a program to read a name kand number from the console by using Scanner class...
 */

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter no: ");
        int num = scn.nextInt();
        scn.nextLine();

        System.out.print("Enter Name: ");
        String name = scn.nextLine();

        System.out.println("\nYou enetred");
        System.out.println(" Name\t:" + name);
        System.out.println(" Number\t:" + num);
        scn.close();

    }

}
