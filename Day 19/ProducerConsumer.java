class Share{
    int x;
    synchronized void get(){
        System.out.println("Got "+ x);
    }
    synchronized void set(int y){
        x = y;
        System.out.println("Put "+x);
    }
}
class Producer implements Runnable{
    Thread t;
    Share ob;
    Producer(Share ob1){
        t = new Thread(this);
        ob = ob1;
        t.start();
    }

    @Override
    public void run() {
        int i = 0;
        while(true){
            ob.set(i);
            i++;
        }
    }
}
class Consumer implements Runnable{
    Thread t;
    Share ob;
    Consumer(Share ob1){
        t = new Thread(this);
        ob = ob1;
        t.start();
    }

    @Override
    public void run() {
        int i = 0;
        while(true){
            ob.get();
            i++;
        }
    }
}
public class ProducerConsumer {
    public static void main(String[] args){
        Share ob = new Share();
        Producer p = new Producer(ob);
        Consumer c = new Consumer(ob);
    }
}
