import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class OneLetterLine {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter word : ");
        String s = ob.next();
        int x = s.length();
        char ch;
        for(int i =0;i<x;i++){
            ch = s.charAt(i);
            System.out.println(ch);
        }
    }
}
