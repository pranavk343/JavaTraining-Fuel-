import java.util.Scanner;
import java.lang.*;
public class PowerOfNumber {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number : ");
        double a = ob.nextDouble();
        System.out.println("Enter a power number : ");
        double b = ob.nextDouble();
        double sum = Math.pow(a,b);
        System.out.println(sum);
    }
}
