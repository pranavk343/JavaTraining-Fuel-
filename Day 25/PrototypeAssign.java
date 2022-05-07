import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

class Student implements Cloneable{
    TreeSet<Integer> list;
    Student(){
        list = new TreeSet<>();
    }
    Student(TreeSet<Integer> t){
        list = t;
    }
    void loadData(){
        list.add(50);
        list.add(60);
        list.add(30);
        list.add(90);
    }
    void show(){
        System.out.println("------------------------");
        for(Integer s : list){
            System.out.println(s);
        }
        System.out.println("-------------------------");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        TreeSet<Integer> list1 = new TreeSet<>();
        for(Integer s : list1){
            list1.add(s);
        }
        Student ob = new Student(list1);
        return ob;
    }
}
public class PrototypeAssign {
    public static void main(String[] args) throws Exception {
        Student st = new Student();
        st.loadData();
        st.show();
        Student st1 = (Student)st.clone();
        st1.show();
        st1.list.remove("C");
        System.out.println("** st object **");
        st.show();
        System.out.println("** st1 object **");
        st1.show();
    }
}
