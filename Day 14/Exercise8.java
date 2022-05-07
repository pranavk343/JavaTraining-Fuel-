import java.util.Scanner;

/*Given two strings, word and a separator, return a big string made of count occurrences of the
word, separated by the separator string. if the inputs are "Wipro","X" and 3 then the output is
"WiproXWiproXWipro".*/
public class Exercise8 {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter string : ");
        String s = ob.next();
        System.out.println("Enter separator : ");
        String sep = ob.next();
        System.out.println("Enter occurances : ");
        int occ = ob.nextInt();
        StringBuffer sb = new StringBuffer();
        for (int i = 0 ; i < occ - 1; i++)
            sb.append(s).append(sep);
        sb.append(s);

        System.out.println(sb);

    }
}
