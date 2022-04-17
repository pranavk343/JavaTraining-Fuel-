// Multi-Level Inheritance
class Student1{
    private int id;
    private String name;
    Student1(int id,String name){
        this.id=id;
        this.name=name;
    }
    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
}
class Mark1 extends Student1 {
    float m1, m2;
    Mark1(int id, String name, float m1, float m2) {
        super(id, name);
        this.m1 = m1;
        this.m2 = m2;
    }
    public float getM1() {
        return m1;
    }

    public float getM2() {
        return m2;
    }
}
class Result extends Mark1{
    Result (int id,String name,float m1,float m2){
        super(id, name, m1, m2);
    }
    void show(){
System.out.println("Id:"+getId());
        System.out.println("Name:"+getName());
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m1+m2/2);
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args){
        Result ob = new Result(1,"Pranav",52,61);
        ob.show();
    }
}
