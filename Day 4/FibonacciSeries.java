import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        int result, prev = 0, next = 1, a,i;
        System.out.println("Enter number : ");
        a = ob.nextInt();
        System.out.println(prev);
        System.out.println(next);
        while(true){
            result = prev+next;
            if(result<=a){
                System.out.println(result);
                prev =next;
                next = result;
            }else{
                break;
            }
        }
    }
}
