import java.io.*;

public class DataIO {
    public static void main(String[] args) throws Exception{
            FileOutputStream fout;
            fout=new FileOutputStream("E:\\JavaTrain\\Day 16\\Files\\test3.txt");
            DataOutputStream dout;
            dout=new DataOutputStream(fout);
            dout.writeInt(102);
            dout.writeBoolean(true);
            dout.writeDouble(1.2);
            dout.close();
            /////////////////////////////////
        FileInputStream fin;
        fin=new FileInputStream("E:\\JavaTrain\\Day 16\\Files\\test3.txt");
        DataInputStream din;
        din=new DataInputStream(fin);
        int x=din.readInt();
        boolean y=din.readBoolean();
        double z=din.readDouble();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        din.close();


    }
}
