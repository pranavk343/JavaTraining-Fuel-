import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class EchoAWord {
    public static void main(String[] args){
        Scanner ob =new Scanner(System.in);
        System.out.println("Enter name : ");
        String s1 = ob.next();
        int n = s1.length();
        for(int i = 0;i<n; i++){
            System.out.println(s1);
        }
    }
}
