import java.util.Scanner;

public class FirstLastSum {
    public static void main(String[] args){
        Scanner ob =new Scanner(System.in);
        System.out.println("Enter any Number  : ");
        int x = ob.nextInt();

        int firstDigit = x;

        while(firstDigit >= 10)
        {
            firstDigit = firstDigit / 10;
        }

        int lastDigit = x % 10;

        int sum = firstDigit+lastDigit;
        System.out.println("Sum of First and last Digit is : " +sum);
    }
}
