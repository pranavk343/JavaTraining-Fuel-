import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter number : ");
        int a = ob.nextInt();
        int x = 1;
        while(x<=10){
            System.out.println(a + " X "+x+" = "+ (a*x));
            x++;
        }
    }
}