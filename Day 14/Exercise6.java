import java.util.Scanner;

/*Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on
the outside and the longer string on the inside. The strings will not be the same length, but they
may be empty (length 0). If input is "hi" and "hello", then output will be "hihellohi"*/
public class Exercise6 {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter 1st string : ");
        String a = ob.next();
        int x = a.length();
        System.out.println("Enter 2nd string : ");
        String b = ob.next();
        int y = b.length();
        if(x<y){
            System.out.println(a+b+a);
        }else if(x>y){
            System.out.println(b+a+b);
        }else if(x==y){
            System.out.println("The strings should not be the same length");
        }
    }
}
