import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter year : ");
        int x = ob.nextInt();
        if((x%4==0) && ((x%400 == 0) || (x%100 !=0))){
            System.out.println(" Leap Year");
        }else{
            System.out.println("Not a leap year");
        }
    }
}
