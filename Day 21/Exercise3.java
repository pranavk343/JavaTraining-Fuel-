import java.util.ArrayList;

/*
 Create an ArrayList which will be able to store only numbers like int,float,double,etc,but not any other data type
*/
public class Exercise3 {
    public static void main(String[] args){
        ArrayList<Number> list = new ArrayList<>();
        list.add(5.2);
        list.add(45);
        list.add(70.5);
        list.add(78/5);
        list.add(8*6);
        for (Number x : list){
            System.out.println(x);
        }
    }
}
