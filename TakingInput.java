import java.util.Scanner;

public class TakingInput {
    public static void main(String args[]){
        Scanner ob = new Scanner(System.in);
        String name;
        int age;
        System.out.println("Enter your name and age : ");
        name = ob.next();
        age = ob.nextInt();
        System.out.println("Hello " +name+" Your age is "+age);
        int a,b,c;
        System.out.println("Enter 2 numbers");
        a = ob.nextInt();
        b = ob.nextInt();
        c =a+b;
        System.out.println("Addition is " + c);
    }
}
