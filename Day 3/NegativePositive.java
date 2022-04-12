import java.util.Scanner;

public class NegativePositive {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        int a;
        System.out.println("Enter number : ");
        a = ob.nextInt();
        if(a>0){
            System.out.println("Number is positive");
        }else if(a<0){
            System.out.println("Number is negative");
        }else if(a==0){
            System.out.println("Number is Zero");
        }
    }
}
