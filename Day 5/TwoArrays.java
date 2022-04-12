public class TwoArrays {
    public static void main(String[] args){
        int[] val = {13, -4, 82, 17};
        int[] twice = new int[val.length];
        System.out.println("Original array : " + val[0]+" "+ val[1]+ " "+ val[2]+ " "+ val[3] );
        System.out.print("New Array : ");
        for(int i = 0;i<val.length;i++){
            twice[i] = val[i];
            System.out.print(twice[i]*2 + " ");
        }
    }
}
