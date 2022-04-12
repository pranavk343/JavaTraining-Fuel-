import java.util.Scanner;

public class RunOFIntegers {
    public static void main(String[] args){
        int a,b;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter start : ");
        a = ob.nextInt();
        System.out.println("Enter end : ");
        b = ob.nextInt();
        for(int i = a;i<=b; i++){
            System.out.println(i);
        }
    }
}
