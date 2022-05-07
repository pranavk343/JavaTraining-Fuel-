import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter your number : ");
        String s = ob.next();
        int count = 0;
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                count++;
            }
            i++;
            j--;
        }
        if(count==0){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("String is not Palindrome");
        }
    }
}
