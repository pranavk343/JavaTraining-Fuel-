/*Write a class MathOperation which accepts integers from command line.
Create an array using these parameters.
Loop through the array and obtain the sum and average of all the elements.
Display the result.
Check for various exceptions that may arise like ArithmeticException, NumberFormatException, and so on.
For example:
The class would be invoked as follows:
C:>java MathOperation 1900, 4560, 0, 32500
*/

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int a = ob.nextInt();
        int arr1[] = new int[a];

        int sum = 0;
        try {
            System.out.println("Enter the elements in the array : ");
            for(int i = 0; i<arr1.length;i++){
                arr1[i] = ob.nextInt();
            }
            for(int i = 0; i<arr1.length;i++){
                sum += arr1[i];
            }
            System.out.println("Sum of array is "+ sum);
        }catch (Exception e){
            if(e instanceof ArithmeticException){
                System.out.println(e);
            }
            else if(e instanceof NumberFormatException){
                System.out.println(e);
            }else if(e instanceof ArrayIndexOutOfBoundsException){
                System.out.println(e);
            }
        }

    }
}
