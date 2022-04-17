import java.util.Scanner;

/*Create a class called Person with a member variable name. Save it in a file called Person.java
Create a class called Employee who will inherit the Person class.The other data members of the
employee class are annual salary (double), the year the employee started to work, and the
national insurance number which is a String.Save this in a file called Employee.java Your class
should have a reasonable number of constructors and accessor methods. Write another class
called TestEmployee, containing a main method to fully test your class definition*/
class Person{
    Scanner ob = new Scanner(System.in);
    String name;
    Person(){
        System.out.println("Enter name : ");
        name = ob.next();
    }
}
class Employee extends Person{
    double aSalary;
    int sYear;
    String insuranceNum;
    Employee(){
        System.out.println("Enter salary : ");
        aSalary = ob.nextDouble();
        System.out.println("Enter year started to work : ");
        sYear = ob.nextInt();
        System.out.println("Enter insurance policy number:  ");
        insuranceNum = ob.next();
    }
    void show(){
        System.out.println("Person Name : "+ name);
        System.out.println("Anuaal Salary : "+ aSalary);
        System.out.println("Year started to work : "+ sYear);
        System.out.println("National Insurance number : "+ insuranceNum);
    }
}
public class TestEmployee {
    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.show();
    }
}
