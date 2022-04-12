import java.util.Scanner;

public class Vowel {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        String s;
        System.out.println("Enter character : ");
        s = ob.next();
        char ch = s.charAt(0);
        if(ch =='a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("Character is a vowel");
        }else {
            System.out.println("Character is not a vowel");
        }
    }
}
