public class SortArray {
    public static void main(String[] args){
        int arr[] = {5,9,3,7,1,6,2,8};
        int temp = 0;
        System.out.print("Original array : ");
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.print("Sorted array : ");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
    }
}

