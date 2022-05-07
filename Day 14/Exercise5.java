import java.util.Scanner;

/*Given a string, return a version without the first and last char, so "Wipro" yields "ipr". The string
length will be at least 2.*/
public class Exercise5 {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter string : ");
        String s = ob.next();
        int n = s.length();
        s = s.substring(1,n-1);
        if(s.length()<2){
            System.out.println("NUll");
        }else{
        System.out.println(s);
        }
    }
}
