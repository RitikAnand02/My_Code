/*
 Develop a project to create the real world object student in programming world. ou use setter and getter methods to 
 intialize, mpdify and read student object fields / properties .

 You must define two fields in student class they are sno and sname .
 Display all properties values by using getter methods...
 */

class Student {
    int sno;
    String sname;

    void setSno(int sno) {
        this.sno = sno;
    }

    int getSno() {
        return this.sno;
    }

    void setSname(String sname) {
        this.sname = sname;
    }

    String getSname() {
        return this.sname;
    }

    void display() {
        System.out.println(sno +"..."+ sname);
    }
}

public class College {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setSno(101);
        s1.setSname("Ritik");

        System.out.println(s1.getSno());
        System.out.println(s1.getSname());

    }

}
