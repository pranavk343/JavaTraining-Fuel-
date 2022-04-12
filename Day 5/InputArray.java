import java.util.Scanner;

public class InputArray {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        int arr[] = new int[10];
        //System.out.println("Enter value : ");
        int x;
        for(int i = 0;i<10;i++){
            System.out.println("Enter element : " + i);
            x = ob.nextInt();
            arr[i] = x;
        }
        for (int a:
             arr) {
            System.out.print(a);
        }
    }
}
