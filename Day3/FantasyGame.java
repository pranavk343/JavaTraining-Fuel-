import java.util.Scanner;

public class FantasyGame {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Welcome to Yertle's Quest");
        System.out.println("Enter the name of your character : ");
        String name = ob.next();
        System.out.println("Enter strength (1-10): ");
        int strength = ob.nextInt();
        System.out.println("Enter health (1-10): ");
        int health = ob.nextInt();
        System.out.println("Enter luck (1-10): ");
        int luck = ob.nextInt();
        if(strength+health+luck > 15){
            System.out.println("You have to give your character too many points! Default values have been assigned: ");
            strength=health=luck = 5;
            System.out.println("Name : "+name + ". Strength :  " + strength + ". Health : "+health + ". Luck : "+ luck);
        }else{
            System.out.println("Your character points are : ");
            System.out.println("Name : "+name + ". Strength :  " + strength + ". Health : "+health + ". Luck : "+ luck);
        }
    }
}
