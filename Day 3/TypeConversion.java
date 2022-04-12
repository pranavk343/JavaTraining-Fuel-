import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        String s;
        char ch;
        int x;
        System.out.println("Enter char : ");
        s = ob.next();
        ch = s.charAt(0);
        x = ch;
        if(x>=65 && x<= 90){
            System.out.println("Capital");
        }else if(x>=97 && x<=122){
            System.out.println("Small");
        }else if(x>=48 && x<=57){
            System.out.println("Digit");
        }else{
            System.out.println("Unknown");
        }
    }
}
