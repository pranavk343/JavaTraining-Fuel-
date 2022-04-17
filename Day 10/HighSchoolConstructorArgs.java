import java.security.interfaces.ECPublicKey;

class Person{
    String name;
    String address;
    Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
class NStudent extends Person{
    int sId;
    NStudent(String name, String address, int sId){
        super(name, address);
        this.sId = sId;
    }
    public int getsId() {
        return sId;
    }
}
class Teacher extends Person{
    int tId;
    int salary;
    String sub;
    Teacher(String name, String address, int tId, int salary, String sub){
       super(name, address);
       this.tId = tId;
       this.salary = salary;
       this.sub = sub;
    }

    public int gettId() {
        return tId;
    }

    public int getSalary() {
        return salary;
    }

    public String getSub() {
        return sub;
    }
}
class ClgStudent extends NStudent{
    int year;
    String major;
    ClgStudent(String name, String address, int sId, int year, String major){
        super(name, address, sId);
        this.year = year;
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public String getMajor() {
        return major;
    }
    void show(){
        System.out.println(getName());
        System.out.println(getAddress());
        System.out.println(getsId());
        System.out.println(getYear());
        System.out.println(getMajor());
    }
}
public class HighSchoolConstructorArgs {
    public static void main(String[] args){
        ClgStudent ob = new ClgStudent("Pranav", "xyz", 45144, 4,"ENTC");
        ob.show();
    }
}
