import java.util.Scanner;

public class VoteIFElse {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        int age;
        System.out.println("Enter your age : ");
        age = ob.nextInt();
        if(age >= 18){
            System.out.println("You can give a Vote");
        }else{
            System.out.println("You cannot give a Vote");
        }
    }
}
