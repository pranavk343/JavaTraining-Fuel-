class Test1<T, V>{
    T i;
    V j;
    Test1(T x, V y){
        i = x;
        j = y;
    }
    void show(){
        System.out.println(i);
        System.out.println(i.getClass().getName());
        System.out.println(j);
        System.out.println(j.getClass().getName());
    }
}
public class Generics2 {
    public static void main(String[] args){
        Test1<Integer, String> t1 = new Test1<>(100, "Pranav");
        t1.show();
    }
}
