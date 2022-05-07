import java.util.ArrayList;
import java.util.Iterator;

/*
 Create an ArrayList which will be able to store only Strings.
 Create a printAll method which will print all the elements using an Iterator.
*/
public class Exercise2 {
    static void printAll(ArrayList<String> list){
        Iterator<String> it = list.iterator();
        for(String x: list){
            while (it.hasNext()){
                System.out.println(it.next());
            }
        }
    }
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Pranav");
        list.add("Rushya");
        list.add("DIEMS");
        list.add("Legion");
        printAll(list);
    }
}
