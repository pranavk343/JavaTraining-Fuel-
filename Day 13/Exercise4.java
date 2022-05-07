import java.util.Scanner;

/*Write a program that takes as input the size of the array and the elements in the array.
The program then asks the user to enter a particular index and prints the element at that index.
Index starts from zero.
This program may generate Array Index Out Of Bounds Exception or NumberFormatException .
Use exception handling mechanisms to handle this exception.
Sample Input and Output 1:
Enter the number of elements in the array 2
Enter the elements in the array
50 80
Enter the index of the array element you want to access 1
The array element at index 1 = 80
The array element successfully accessed
Sample Input and Output 2:
Enter the number of elements in the array 2
Enter the elements in the array 50 80
Enter the index of the array element you want to access 9
java.lang.ArrayIndexOutOfBoundsException
Sample Input and Output 3:
Enter the number of elements in the array 2
Enter the elements in the array 30
j java.lang.NumberFormatException
*/
public class Exercise4 {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int a = ob.nextInt();
        int arr[] = new int[a];
        int x ;
        System.out.println("Enter the elements in the array : ");
        for(int i = 0; i<arr.length;i++){
            arr[i] = ob.nextInt();
        }
        try{
            System.out.println("Enter the index of the array element you want to access : ");
            x = ob.nextInt();
            System.out.println("The array element at index "+ x + " = "+arr[x]);
            System.out.println("The array element successfully accessed !");
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
