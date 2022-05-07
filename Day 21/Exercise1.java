import java.util.ArrayList;

/*Develop a java class with a method saveEvenNumbers(int N) using ArrayList to store even numbers
from 2 to N, where N is a integer which is passed as a parameter to the method saveEvenNumbers().
The method should return the ArrayList (A1) created.
In the same class create a method printEvenNumbers()which iterates through the arrayList A1 in
step 1, and It should multiply each number with 2 and display it in format 4,8,12….2*N.
and add these numbers in a new ArrayList (A2).
The new ArrayList (A2) created needs to be returned.
Create a method printEvenNumber(int N) parameter is a number N.
This method should search the arrayList (A1) for the existence of the number ‘N’ passed.
If exists it should return the Number else return zero.
Hint: Use instance variable for storing the ArrayList A1 and A2. NOTE: You can test the methods using a main method.
*/
class Assign {
    ArrayList<Integer> A1 = new ArrayList<>();
    ArrayList<Integer> saveEvenNumbers(int N){
        A1 = new ArrayList<>();
        for(int i = 0; i<=N;i++){
            if(i%2==0){
                A1.add(i);
            }
        }
        return A1;
    }
    ArrayList<Integer> A2 = new ArrayList<>();
    ArrayList<Integer> printEvenNumbers(){
        for(int x : A1){
            A2.add(x*2);
            System.out.println(x*2);
        }
        return A2;
    }
}
public class Exercise1 {
    public static void main(String[] args){
        Assign ob = new Assign();
        ob.saveEvenNumbers(20);
        ob.printEvenNumbers();
    }
}
