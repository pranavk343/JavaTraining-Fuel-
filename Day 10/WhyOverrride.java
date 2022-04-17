class P{
    @Override
    public String toString() {
        return "Object of P class";
    }
}
class Q extends P{
    @Override
    public String toString() {
        return "Object of Q Class";
    }
}
public class WhyOverrride {
    public static void main(String[] args){
        P p1 =new P();
        System.out.println(p1);
        Q q1 = new Q();
        System.out.println(q1);
        System.out.println(p1.toString());
        System.out.println(q1.toString());
    }
}
