import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.time.*;

public class Assignment {
    static boolean isLeapYear(int x){
        if (((x % 4 == 0) && (x % 100!= 0)) || (x % 400 == 0)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter year :");
        int year = ob.nextInt();
        int days = 0;
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        simpleDateFormat.applyPattern("yyyy");
        String format = simpleDateFormat.format(date);
        System.out.println(format);
        int cyear = Integer.parseInt(format);
        for(int i = year; i<=cyear ; i++){
            if(isLeapYear(i)){
                days +=366;
            }else{
                days +=365;
            }
        }
        System.out.println("Total number of days : "+ days);
    }
}
