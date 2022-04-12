import java.util.Scanner;

public class AverageArray {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int arr[] = new int[3];
        //System.out.println("Enter value : ");
        int x;
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter element : " + i);
            x = ob.nextInt();
            arr[i] = x;
        }
        int sum = 0;
        for(int i =0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.print("Average value of all elements stored in the array is :" +(double)sum/arr.length);
    }
}
