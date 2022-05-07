import java.io.*;

/*
    3. WAP program to copy one image file into another (.jpg or png file) using byte io
*/
public class ImageCopy {
    public static void main(String[] args) throws Exception {
        FileInputStream fin = new FileInputStream("E:\\JavaTrain\\Day 17\\Files\\demo.jpg");
        BufferedInputStream bin = new BufferedInputStream(fin);
        FileOutputStream fout = new FileOutputStream("E:\\JavaTrain\\Day 17\\Files\\demo1.jpg");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        int x;
        do{
            x = bin.read();
            if(x!=-1){
                bout.write(x);
            }
        }while (x!=-1);
        bin.close();
        bout.close();

    }
}
