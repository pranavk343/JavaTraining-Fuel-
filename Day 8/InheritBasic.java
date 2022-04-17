class A {
    void show(){
        System.out.println("In Base");
    }
}
class B extends A{
    void disp(){
        System.out.println("In Derive");
    }
}
public class InheritBasic {
    public static void main(String[] args){
        B ob = new B();
        ob.disp();
        ob.show();
    }
}
