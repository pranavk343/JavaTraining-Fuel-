import java.util.ArrayList;
import java.util.Iterator;

//ArrayList Class
public class ArrayListClass {
    public static void main(String[] args){
        //create ArrayList Object
        ArrayList<String> ar = new ArrayList<>();
        System.out.println(ar.size());
        //add item in list
        ar.add("A");
        ar.add("B");
        ar.add("C");
        ar.add("D");
        System.out.println(ar.get(1));
        ar.add(1,"X");
        for(String s : ar){
            System.out.println(s);
        }
        Iterator<String> it;
        it=ar.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        Iterator<String> it1;
        it1=ar.iterator();
        while(it1.hasNext()) {
            System.out.println(it1.next());
        }


    }
}
