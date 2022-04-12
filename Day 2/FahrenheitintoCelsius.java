import java.util.*;

public class FahrenheitintoCelsius {
    public static void main(String args[]){
        Scanner ob = new Scanner(System.in);
        double F,C;
        System.out.println("Enter temperature in Fahrenheit :");
        F = ob.nextInt();
        C = (F-32)*5/9;
        System.out.println("Converted temperature into Celsius is : " +C);
    }
}
