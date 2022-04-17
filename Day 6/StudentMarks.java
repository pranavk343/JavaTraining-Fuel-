class student{
    String name;
    float m1,m2,m3,avg;


    void setInfo(String s, float x,  float y, float z ){
        name=s;
        m1=x;
        m2=y;
        m3=z;
    }
    void getInfo(){
        System.out.println(name);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }

    void getAvg(){
        avg=(m1+m2+m3)/3;
        System.out.println(avg);;
    }

}

public class StudentMarks {
    public static void main(String arg[])
    {
        student p1=new student();
        student p2=new  student();
        p1.setInfo("abc",10,20,30);
        p2.setInfo("xyz",20,30,40);

        p1.getInfo();
        p2.getInfo();
        p1.getAvg();
        p2.getAvg();

    }
}
