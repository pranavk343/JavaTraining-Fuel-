//Generics
class Student{
    int id;
    String name;
}
class Test<T>{
    T i;
    Test(T x){
        i = x;
    }
    void show(){
        System.out.println(i);
        System.out.println(i.getClass().getName());
    }
}
public class Generics {
    public static void main(String[] args){
        Test<Integer> t1 = new Test<>(100);
        Test<String> t2 = new Test<>("Pranav");
        t1.show();
        t2.show();
        Student s1 = new Student();
        Test<Student> t3 = new Test<>(s1);
        t3.show();
    }
}
