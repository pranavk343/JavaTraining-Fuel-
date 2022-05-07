import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/*
1. WAP to copy the content of one file to another by using CHAR IO classes.
*/
public class CharIO {
    public static void main(String[] args) throws Exception{
        FileReader fin = new FileReader("E:\\JavaTrain\\Day 17\\Files\\test.txt");
        BufferedReader bin = new BufferedReader(fin);
        FileWriter fout = new FileWriter("E:\\JavaTrain\\Day 17\\Files\\test2.txt");
        BufferedWriter bout = new BufferedWriter(fout);
        int x;
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
