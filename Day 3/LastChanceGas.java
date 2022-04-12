import java.util.Scanner;

/*Al's Last Chance Gas station sits on Route 190 on the edge of Death Valley. There is no other
gas station for 200 miles. Write a program to help drivers decide if they need gas. The program
asks for:
• The capacity of the gas tank, in gallons.
• The indication of the gas gauge in percent (full= 100, three quarters full = 75, and so on).
• The miles per gallon of the car.
The program then writes out "Get Gas" or "Safe to Proceed" depending on if the car can cross
the 200 miles with the gas remaining in the tank.
Tank capacity:
12
Gage reading:
50
Miles per gallon:
30
Get Gas!
*/
public class LastChanceGas {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Tank capacity: ");
        int capacity = ob.nextInt();
        System.out.println("Gage reading: ");
        double read= ob.nextDouble();
        System.out.println("Miles per gallon: ");
        int miles = ob.nextInt();
        double distance = (capacity*(read/100))*miles;
        if(distance<200){
         System.out.println("Get Gas!!");
        }else{
            System.out.println("Safe to Proceed !!");
        }


    }
}
