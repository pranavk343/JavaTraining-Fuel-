import java.util.Scanner;

/*Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and
otherwise return the string unchanged. If the input is "xHix", then output is "Hi".*/
public class Exercise7 {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter string : ");
        String s = ob.next();
        if(s.charAt(0)=='x' && s.charAt(s.length()-1)=='x'){
            s = s.substring(1,s.length()-1);
            System.out.println(s);
        }else
            System.out.println(s);
    }
}
