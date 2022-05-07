//Generics
class Test2<T extends Number>{
    T i;
    void set(T x){
        i = x;
    }
    void show(){
        System.out.println(i);
        System.out.println(i.getClass().getName());
    }
}
public class Generics3 {
    public static void main(String[] args){
        Test2<Integer> t1 = new Test2<>();
        t1.set(56);
       // Test2<String> t2 = new Test2<>("Pranav");
        t1.show();
      //  t2.show();
    }
}
