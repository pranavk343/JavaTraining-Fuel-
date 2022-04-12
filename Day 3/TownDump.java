import java.util.Scanner;

/*The New Britain, Connecticut town dump charges you $20 to dispose of 200 pounds of trash.
They charge $8 for each additional hundred pounds beyond the first 200. Write a program that
asks for the weight of a load of trash and then calculates the charge.*/
public class TownDump {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter dispose in pounds : ");
        int dump = ob.nextInt();
        int charges = 0;
        if(dump>0 && dump<=200){
            charges = 20;
        }
        else if(dump>200 && dump<=400){
            if(dump-200<=100){
                charges = 28;
                System.out.println("Total charges "+ charges);
            }
            else{
                charges = 36;
                System.out.println("Total charges "+ charges);
            }
        }
        else{
            System.out.println("Cannot dispose dump at a moment");
        }


    }
}
