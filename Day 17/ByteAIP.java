import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;

//ByteArrayInputStream
public class ByteAIP {
    public static void main(String[] args) throws Exception{
        String msg="देवगिरी";
        byte[] arr=msg.getBytes();
        ByteArrayInputStream ob;
        ob=new ByteArrayInputStream(arr);
        int x;
        do{
            x=ob.read();
            System.out.print((char)x);

        }while(x!=-1);
        System.out.println();
        ////////////////////////

        String s1 ="देवगिरी";
        char[] arr1 = s1.toCharArray();
        CharArrayReader cr = new CharArrayReader(arr1);
        int y;
        do{
            y = cr.read();
            System.out.print((char) y);
        }while(y!=-1);
        System.out.println();


    }
}
