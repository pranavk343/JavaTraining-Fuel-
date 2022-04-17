import java.util.Scanner;

class Student{
    Scanner ob = new Scanner(System.in);
    String n,sn,mjr;
    int cls;
    void data() {
        System.out.println("Enter your name : ");
        n = ob.next();
        System.out.println("Enter your surname : ");
        sn = ob.next();
        System.out.println("Enter your class year : ");
        cls = ob.nextInt();
        System.out.println("Enter your major : ");
        mjr = ob.next();
    }
    void show(){
        System.out.println("Name : " +n +" "+sn);
        System.out.println("Class Year : "+ cls);
        System.out.println("Major : "+ mjr);
    }
}

public class StudentClass {

    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();
        s1.data();
        s2.data();
        s1.show();
        s2.show();
    }
}
