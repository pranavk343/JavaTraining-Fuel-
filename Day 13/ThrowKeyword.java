//throw keyword
public class ThrowKeyword {
    static int div(int x,int y){
        int z=0;
        try {
            z=x/y;
        } catch (ArithmeticException e) {
            throw e;
        }
        return z;
    }
    public static void main(String[] args) {
        int a;
        try {
            a=div(10, 0);
            System.out.println("Div is "+a);
        } catch (Exception e) {
            System.out.println("Recaught in main");
        }
    }

}
