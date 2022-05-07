import java.util.Scanner;

/*Given a string of even length, return the first half. So the string "CatDog" yields "Cat". If the
string length is odd number then return null.*/
public class Exercise4 {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter string :");
        String s = ob.next();
        int n = s.length();
        if(n%2==0){
            s = s.substring(0,n/2);
            System.out.println(s);
        }else{
            System.out.println("null");
        }
    }
}
