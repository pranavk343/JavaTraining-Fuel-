import java.util.Scanner;

public class SeperatedByDots {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter 1st word : ");
        String s1 = ob.next();
        System.out.println("Enter 2nd word : ");
        String s2 = ob.next();
        int x = 30 - (s1.length() + s2.length());
        System.out.print(s1);
        for(int i = 0; i < x; i++){
            System.out.print(".");
        }
        System.out.print(s2);
    }
}
