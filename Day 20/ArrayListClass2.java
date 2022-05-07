import java.util.ArrayList;

public class ArrayListClass2 {
    public static void main(String[] args){
        ArrayList<String> ar;
        ar=new ArrayList<>();
        ar.add("X");
        ar.add("A");
        ar.add("B");
        ar.add("A");
        ar.add("C");
        ar.add("D");
        ar.add("E");
        System.out.println(ar);
        // ar.remove("C");
        ar.remove(3);
        System.out.println(ar);

    }
}
