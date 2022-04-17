import java.util.Scanner;

public class UpperTriMatrix {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int x =1;
        int arr1[][] = new int[3][3];
        System.out.println("Enter first matrix : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr1[i][j] = ob.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i>j && arr1[i][j]!=0){
                    x = 0;
                    break;
                }
            }
        }
        if(x==1){
            System.out.println("Matrix is UpperTriangular Matrix");
        }else{
            System.out.println("Matrix is not a UpperTriangular Matrix");
        }
    }
}
