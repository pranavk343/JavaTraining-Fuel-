//ObjectInputStream & Serializable
import java.io.*;
class Student implements Serializable{
    private String name;
    private int id;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
public class OBjectandSerializable {
    public static void main(String[] args) throws Exception{
        Student st;
        st=new Student();
        st.setId(45144);
        st.setName("Pranav");
        FileOutputStream fout = new FileOutputStream("E:\\JavaTrain\\Day 16\\Files\\test4.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(st);
        out.close();



        ///////////////////////////////////
        //ObjectInputStream & Deserializable



        FileInputStream fin = new FileInputStream("E:\\JavaTrain\\Day 16\\Files\\test4.txt");
        ObjectInputStream in = new ObjectInputStream(fin);
        Student st1 = (Student) in.readObject();
        System.out.println(st1.getName());
        System.out.println(st1.getId());
        in.close();
    }
}
