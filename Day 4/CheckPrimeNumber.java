import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter number : ");
        int a = ob.nextInt();
        int i = 1;
//        while(i<=a/2){
//            if(a%i==0){
//                System.out.println(a+" is a Prime Number");
//            }else{
//                System.out.println(a + " is not a Prime Number");
//            }
//            i++;
//        }
        for(int j = 1;i<=a/2;i++){
            if(a%j==0){
                System.out.println(a + " is a Prime Number");
            }else{
                System.out.println(a + " is not a Prime Number");
            }
        }
    }
}
