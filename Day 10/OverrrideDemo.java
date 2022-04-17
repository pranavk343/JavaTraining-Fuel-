class X{
    void show(){
        System.out.println("In X");
    }
}
class Y extends X{
    void show(){
        System.out.println("In Y");
    }
}
public class OverrrideDemo {
    public static void main(String[] args){
        Y ob = new Y();
        ob.show();
    }
}
