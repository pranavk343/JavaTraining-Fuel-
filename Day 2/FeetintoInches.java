import java.util.Scanner;

public class FeetintoInches {
    public static void main(String args[]){
        Scanner ob = new Scanner(System.in);
        double m,f,i;
        System.out.println("Enter the number in meter : ");
        m = ob.nextDouble();
        f = m*3.28084;
        i = m*39.37;
        System.out.println("Meter into Feet : "+f+" feet" );
        System.out.println("Meter into Inches : "+i+" inches");
    }
}
