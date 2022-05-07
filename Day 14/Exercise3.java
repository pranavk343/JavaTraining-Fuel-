import java.util.Scanner;

/*Given a string, return a new string made of n copies of the first 2 chars of the original string
where n is the length of the string. The string may be any length. If there are fewer than 2 chars,
use whatever is there. If input is "Wipro" then output should be "WiWiWiWiWi".*/
public class Exercise3 {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter input : ");
        String input = ob.next();
        int n = input.length();
        String c = input.substring(0,2);
        for(int i = 0; i<n; i++){
            System.out.print(c);
        }
    }
}
