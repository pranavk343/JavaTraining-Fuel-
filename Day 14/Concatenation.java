import java.util.Locale;
import java.util.Scanner;

/*Given two strings, append them together (known as "concatenation") and return the result.
However, if the concatenation creates a double-char, then omit one of the chars. If the inputs are
“Mark” and “Kate” then the ouput should be “markate”. (The output should be in lowercase)
*/
public class Concatenation {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter first string : ");
        String s1 = ob.next();
        System.out.println("Enter second string : ");
        String s2 = ob.next();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char last = s1.charAt(s1.length()-1);
        char first = s2.charAt(0);
        if(last==first){
            s2 = s2.substring(1,s2.length());
        }
        s1 = s1+s2;
        System.out.println(s1.toLowerCase());
    }
}
