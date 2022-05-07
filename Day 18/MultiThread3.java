class Test2 implements Runnable{
    Thread t;
    Test2(String x){
        t = new Thread(this);
        t.setName(x);
        t.start();
    }
    @Override
    public void run() {
        try{
            for(int i =0; i < 5; i++){
                System.out.println("Child thread "+t.getName()+"  "+ i);
                Thread.sleep(500);
            }
        }catch (Exception e){

        }
    }
}
public class MultiThread3 {
    public static void main(String[] args){
        Test2 t1 = new Test2("A");
        Test2 t2 = new Test2("B");
        Test2 t3 = new Test2("C");
        System.out.println("Child Thread A "+ t1.t.isAlive());
        System.out.println("Child Thread B "+ t2.t.isAlive());
        System.out.println("Child Thread C "+ t3.t.isAlive());
        try {
            t1.t.join();
            t2.t.join();
            t3.t.join();
        }catch (Exception e){

        }
        System.out.println("Child Thread A "+ t1.t.isAlive());
        System.out.println("Child Thread B "+ t2.t.isAlive());
        System.out.println("Child Thread C "+ t3.t.isAlive());
    }
}
