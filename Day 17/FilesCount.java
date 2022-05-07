import java.io.File;
import java.util.Scanner;

/*
    2. WAP to ask user to input folder path and count how many file and folders present in that folder.
*/
public class FilesCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file path : ");
        String s = sc.next();
        File f1 = new File(s);
        File[] arr1;
        int file=0,dir=0;
        arr1 = f1.listFiles();
        for (File f2 : arr1) {
            if (f2.isFile()) {
                file++;
                System.out.println("File : " + f2.getName());
            } else if (f2.isDirectory()) {
                dir++;
                System.out.println("Directory : " + f2.getName());
            }
        }
        System.out.println("There are "+dir+" Folders and "+file+" files.");
    }
}