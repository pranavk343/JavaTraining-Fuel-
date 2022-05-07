interface X{
    void add(int x, int y);
}
class Test implements X{
    @Override
    public void add(int x, int y) {
        System.out.println(x+y);
    }
}
public class DemoFunctional {
    public static void main(String[] args){
        Test t1 = new Test();
        t1.add(10,20);

        X ob = new X() {
            @Override
            public void add(int x, int y) {
                System.out.println(x+y);
            }
        };
        ob.add(50,60);
    }
}
