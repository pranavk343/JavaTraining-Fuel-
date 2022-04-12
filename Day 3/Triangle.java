import java.util.Scanner;

public class Triangle {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter angles of triangle : ");
        a = ob.nextInt();
        b = ob.nextInt();
        c = ob.nextInt();
        int sum = a+b+c;
        if(sum==180){
            System.out.println("Triangle is valid");
        }else{
            System.out.println("Triangle is not valid");
        }
    }
}
