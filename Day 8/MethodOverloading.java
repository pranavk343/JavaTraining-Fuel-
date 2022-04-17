class Test1{
    void add(int x, int y){
        System.out.println(x+y);
    }
    void add(float x, float y){
        System.out.println(x+y);
    }
}
public class MethodOverloading {
    public static void main(String[] args){
        Test1 t1 = new Test1();
        t1.add(2,6);
        Test1 t2 = new Test1();
        t2.add(1.5f,5.8f);
    }
}
