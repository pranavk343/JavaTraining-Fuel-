import java.util.Scanner;

/*A HighSchool application has two classes: the Person superclass and the Student subclass.
Using inheritance, in this lab you will create two new classes, Teacher and CollegeStudent.
A Teacher will be like Person but will have additional properties such as salary (the amount the teacher
earns) and subject (e.g. “Computer Science”, “Chemistry”, “English”, “Other”).
The CollegeStudent class will extend the Student class by adding a year (current level in college) and major
(e.g. “Electrical Engineering”, “Communications”, “Undeclared”).*/
class Person1{
    Scanner ob = new Scanner(System.in);
    String name;
    int age;
    Person1(){
    System.out.println("Enter your name : ");
    name = ob.next();
    System.out.println("Enter your age : ");
    age = ob.nextInt();
}
}
class Teacher extends Person1{
    int salary;
    String tsub;
    Teacher(){
        System.out.println("Enter your teaching subject : ");
        tsub = ob.next();
        System.out.println("Enter your salary : ");
        salary = ob.nextInt();

    }
    void getData(){
        System.out.println("-------------Teacher Directory-----------");
        System.out.println("Name : "+ name);
        System.out.println("Age : "+ age);
        System.out.println("Teaching Subject : "+ tsub);
        System.out.println("Salary : "+ salary);
        System.out.println("------------------------------------------");
    }

}
class Student extends Person1{
    int rollNo;
    String clg;
    Student(){
        System.out.println("Enter your RollNo. : ");
        rollNo = ob.nextInt();
        System.out.println("Enter your college name : ");
        clg = ob.next();
    }
}
class CollegeStudent extends Student{
    String major;
    int year;
    CollegeStudent(){
        System.out.println("Enter your major : ");
        major = ob.next();
        System.out.println("Enter your studying year : ");
        year = ob.nextInt();
    }
    void getStudentData(){
        System.out.println("-------------Student Directory-----------");
        System.out.println("Name : "+ name);
        System.out.println("Age : "+ age);
        System.out.println("Roll no : "+ rollNo);
        System.out.println("College Name : "+ clg);
        System.out.println("Major : "+ major);
        System.out.println("Studying year : "+ year);
        System.out.println("------------------------------------------");
    }
}
public class HighSchool {
    public static void main(String[] args){
        Teacher t1 = new Teacher();
        CollegeStudent s1 = new CollegeStudent();
        t1.getData();
        s1.getStudentData();
    }
}
