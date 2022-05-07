//Synchronization\
class Printer{
    void print(String s){
        try{
            System.out.print("["+s);
            Thread.sleep(500);
        }catch (Exception e){

        }
        System.out.println("]");
    }
}
class Test implements Runnable{
    Printer p;
    Thread t;
    String msg;
    Test(String s, Printer ob1){
        t = new Thread(this);
        p = ob1;
        msg = s;
        t.start();
    }
    @Override
    public void run() {
        synchronized (p){
            p.print(msg);
        }
    }
}
public class Synchro {
    public static void main(String[] agrs){
        Printer ob = new Printer();
        Test t1 = new Test("A", ob);
        Test t2 = new Test("B", ob);
        Test t3 = new Test("C", ob);
    }
}
