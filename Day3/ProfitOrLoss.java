import java.util.Scanner;

public class ProfitOrLoss {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        int c,s;
        System.out.println("Enter cost price : ");
        c = ob.nextInt();
        System.out.println("Enter selling price : ");
        s = ob.nextInt();
        int x = s-c;
        if(c>0){
            System.out.println("Profit");
        }else{
            System.out.println("Loss");
        }
    }
}
