import java.util.Scanner;

public class OrderChecker {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        int bolts,nuts,washers;
        System.out.println("Number of bolts : ");
        bolts = ob.nextInt();
        System.out.println("Number of nuts : ");
        nuts = ob.nextInt();
        System.out.println("Number of waherss : ");
        washers = ob.nextInt();
        if(nuts!=bolts){
            System.out.println("Check the Order : Too few nuts");
        }else if(bolts!=(2*washers)){
            System.out.println("Check the Order : Too few washers");
        }else{
            System.out.println("Order is OK");
        }
        double total = (5*bolts)+(3*nuts)+(washers);
        System.out.println("Total cost : "+ total);
    }
}
