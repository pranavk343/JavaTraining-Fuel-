import java.util.*;

public class DemoHashMap {
    public static void main(String[] args){
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(10,"A");
        map1.put(20,"B");
        map1.put(30,"C");
        map1.put(40,"A");
        map1.put(50,"E");

        // read keys from map

        Set<Integer> keys = map1.keySet();
        for(Integer k : keys){
            System.out.println(k);
        }
        // read values from map
        Collection<String> values = map1.values();
        for (String s : values){
            System.out.println(s);
        }

        //read both keys and values from map

        Set<Map.Entry<Integer,String>> items = map1.entrySet();
        for(Map.Entry<Integer, String> e1 : items){
            System.out.println(e1.getKey() +" : "+ e1.getValue());
        }
        System.out.println(map1);
    }
}
