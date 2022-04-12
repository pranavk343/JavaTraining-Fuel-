import java.util.Scanner;

public class DivisibleNumber {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        int x;
        System.out.println("Enter number : ");
        x = ob.nextInt();
        if(x%5==0 && x%11==0){
            System.out.println("Number is divisible by 5 & 11 !");
        }else{
            System.out.println("Number is not divisible by 5 & 11 !");
        }
    }
}
