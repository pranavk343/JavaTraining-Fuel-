import java.util.Scanner;

public class AssignmentString {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter number : ");
        String a1 = ob.next();
        char[] s1 = a1.toCharArray();
        char[] s2 = a1.toCharArray();
        System.out.println("Enter kth number : ");
        int a = ob.nextInt();
        int j = 0, y = 0;
        for(int i=0; i<s1.length; i++){
            y = (int)(s1[i]-48);
            if(y%2==0){
                j=i+a;
                if(j>=s1.length){
                    j=j-s1.length;
                    s1[i]=s2[j];
                }else{
                    s1[i]=s2[j];
                }
            }
        }
        for(int i =0; i<s1.length;i++){
            System.out.print(s1[i]);
        }
        }
    }

