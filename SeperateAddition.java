import java.util.Scanner;

public class SeperateAddition {
    public static void main(String args[]){
        Scanner ob = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter number : ");
        a = ob.nextInt();
        b = a/10;
        c = a%10;
        a = b+c;
        System.out.println("Addition is : "+a);
    }
}
