import java.util.Scanner;

/*The wind chill index (WCI) is calculated from the wind speed v in miles per hour and the
temperature temp in Fahrenheit. Three formulas are used, depending on the wind speed:
If wind speed is less than 3 mph then wind chill = current temperature
If the current temperature is greater than 50° F then wind chill = current
temperature
otherwise, wind chill = 35.74 + 0.6215*temp - 35.75*v0.16 + 0.4275*temp*v0.16
You will need to import java.lang.Math and use floating point input for this exercise. To
calculate v0.16 use Math.pow().
Enter Wind Speed:
15
Enter Temperature:
20
Wind Chill: 6.218885266083872
*/
public class WindChillIndex {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter Wind Speed : ");
        double v = ob.nextDouble();
        System.out.println("Enter Temperature : ");
        double temp = ob.nextDouble();
        if(v<3){
            System.out.println("Wind Chill : "+ temp);
        }
        else if(temp>50){
            System.out.println("Wind Chill : "+ temp);
        }
        else{
            double w = 35.74+0.625*temp-35.75*(Math.pow(v,0.16))+0.4275*temp*(Math.pow(v,0.16));
            System.out.println("Wind Chill : "+ w);
        }
    }
}
