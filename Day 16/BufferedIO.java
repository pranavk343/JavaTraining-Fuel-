import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//Buffered IO
public class BufferedIO {
    public static void main(String[] args) throws Exception{
        FileInputStream fin = new FileInputStream("E:\\JavaTrain\\Day 16\\Files\\test.txt");
        BufferedInputStream bin = new BufferedInputStream(fin);

        FileOutputStream fout = new FileOutputStream("E:\\JavaTrain\\Day 16\\Files\\test1.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        int x;
        System.out.println(fin.available());
        do{
            x = bin.read();
            if(x!=-1){
                bout.write(x);
            }
        }while (x!=-1);
        bin.close();
        bout.close();
        System.out.println("File Copied");
    }
}
