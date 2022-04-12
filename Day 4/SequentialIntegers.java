import java.util.Scanner;

public class SequentialIntegers {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter number : ");
        int a = ob.nextInt();
        int sum = 0,b =0;
        while(b <= a){
            sum = sum+b;
            b++;
        }
        System.out.println("Sum is : " + sum);
    }
}
