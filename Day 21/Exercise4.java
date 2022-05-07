import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
 Create an ArrayList of Employee( id,name,address,sal) objects
 and search for particular Employee object based on id number
*/
class Employee{
    int id;
    String name;
    String add;
    int sal;
    Employee(int id, String name, String add, int sal){
        id = this.id;
        name = this.name;
        add = this.add;
        sal = this.sal;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "[Id = " + id + ", Name = " + name + ", Address=" + add + ", Salary =" + sal + "]";
    }
}
public class Exercise4 {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        Employee e1 = new Employee(001,"Pranav","Shivaji Nagar",45000);
        Employee e2 = new Employee(002,"Rushya","Bajaj Nagar",45000);
        Employee e3 = new Employee(003,"Pooja","Ram Nagar",40000);
        Employee e4 = new Employee(004,"XYZ","US",45000);
        Employee e5 = new Employee(005,"ABC","India",45000);
        ArrayList<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        Iterator<Employee> it = list.iterator();
        int Id = 001;
        while (it.hasNext()){
            Employee emp = it.next();
            if(emp.getId() == Id){
                System.out.println(emp);
            }
        }
    }
}
