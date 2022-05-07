import java.util.Scanner;
public class WiproExamCode {
    public static double powFirst(int input1){
        String s = Integer.toString(input1);
        int len = s.length();
        double x = Integer.parseInt(s.charAt(0)+"");
        double y = Integer.parseInt(s.charAt(len-1)+"");
        double p = Math.pow(x,y);
        if(x==1){
            return 1;
        }else{
            return p;
        }
    }
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int i = ob.nextInt();
        double x = WiproExamCode.powFirst(i);
        System.out.println(x);
    }
}
