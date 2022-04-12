import java.util.Scanner;

/*Write a program that asks for your age in years, months, and days and writes out your age in
seconds. Do this by calculating the number of total days you have been alive, then multiply this
by the number of hours per day (24), the number of minutes per hour (60), and the number of
seconds per minute (60). Assume that there are 365 days per year (ignore leap years). But
correctly take account of the different number of days in different months. If the user enters 5 for
the number of months, add up the number of days in the first 5 months: 31 + 28 + 31 + 30 +
31
A human lifespan is about 2.5 billion seconds (2.5 billion heart-beats). Write out what
percentage of your expected lifespan you have lived.
2500000000*/
public class AgeinSeconds {
    public static void main(String[] args){
        Scanner ob =new Scanner(System.in);
        System.out.println("Enter number of years : ");
        double year = ob.nextDouble();
        double temp = 0;
        System.out.println("Enter number of  months : ");
        double month = ob.nextDouble();
        System.out.println("Enter number of  days : ");
        double days = ob.nextDouble();
        while(month<=12){
            month = month-12;
            year++;
        }
        if(month<=5){
            days = days+151;
            month = 0;
        }else if(month<=12){
            days = days+(month*30);
            month = 0;
        }
        days = days + (year*365);
        temp = 24*days;
        double minutes = temp*60;
        double seconds = minutes*60;
        double life = 2500000000.0;
        double lspan = (seconds/life)*100;
        System.out.println("Your percentage of Life Span is : "+ lspan);

    }
}
