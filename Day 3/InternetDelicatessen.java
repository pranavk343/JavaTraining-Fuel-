import java.util.Scanner;

public class InternetDelicatessen {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the item :");
        String s1 = ob.nextLine() ;

       // s1 = ob.nextLine();
        System.out.println("Enter the price : ");
        double price = ob.nextDouble();
        int charges = 0;
        if(price<10){
            charges = 2;
        }else
        {
            charges = 0;
        }
        System.out.println("Overnight delivery : (1/0)");
        int x = ob.nextInt();
        if(x==1){
            charges = charges+3;
        }else{
            charges = charges;
        }
        System.out.println("Invoice : ");
        System.out.println(s1 + "  "+ price);
        System.out.println("Delivery" + "     "+ charges);
        System.out.println("Total  "+ "     "+ (price+charges));

    }
}
