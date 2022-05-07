import java.util.ArrayList;
class Student implements Cloneable{
    ArrayList<String> list;
    Student(){
        list = new ArrayList<>();
    }
    Student(ArrayList<String> t){
        list = t;
    }
    void loadData(){
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
    }
    void show(){
        System.out.println("------------------------");
        for(String s : list){
            System.out.println(s);
        }
        System.out.println("-------------------------");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        ArrayList<String> list1 = new ArrayList<>();
        for(String s : list1){
            list1.add(s);
        }
        Student ob = new Student(list1);
        return ob;
    }
}
public class PrototypePattern {
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
