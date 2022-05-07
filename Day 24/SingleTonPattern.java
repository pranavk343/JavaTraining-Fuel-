class Sequence{
    static Sequence obj = null;
    static int count;
    private Sequence(){
        count = 0;
    }
    static synchronized Sequence getInstance(){
        if(obj==null){
            obj= new Sequence();
            System.out.println("Object created");
        }
        count++;
        System.out.println("Count is "+count);
        return obj;
    }
}
public class SingleTonPattern {
    public static void main(String[] args){
        Sequence s1 = Sequence.getInstance();
        Sequence s2 = Sequence.getInstance();
        Sequence s3 = Sequence.getInstance();
        Sequence s4 = Sequence.getInstance();
    }
}
