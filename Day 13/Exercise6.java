import java.util.Scanner;

/*Write a Program to take care of Number Format Exception if user enters values other than integer for
calculating average marks of 2 students. The name of the students and marks in 3 subjects are taken
from the user while executing the program. In the same Program write your own Exception classes to
take care of Negative values and values out of range (i.e. other than in the range of 0-100)*/
class NewException extends Exception{
    @Override
    public String toString() {
        return "Enter non-negative values of marks ";
    }
}
class Student1{
    private String name;
    private int s1,s2,s3;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getS1() {
        return s1;
    }

    public void setS1(int s1) throws NewException{
        if(s1<0 && s1>100){
            NewException ob = new NewException();
            throw ob;
        }
        this.s1 = s1;
    }

    public int getS2() {
        return s2;
    }

    public void setS2(int s2) throws NewException {
        if(s2<0 && s2>100){
            NewException ob = new NewException();
            throw ob;
        }
        this.s2 = s2;
    }

    public int getS3() {
        return s3;
    }

    public void setS3(int s3) throws NewException {
        if(s3<0 && s3>100){
            NewException ob = new NewException();
            throw ob;
        }
        this.s3 = s3;
    }
    void getAvg(){
        double avg = (s1+s2+s3)/3;
        System.out.println("Average of "+ name + " is :" + avg + Integer.parseInt("double"));
    }
}
public class Exercise6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try {
            Student1 s1 = new Student1();
            s1.setName("Pranav");
            s1.setS1(65);
            s1.setS2(98);
            s1.setS3(75);
            s1.getAvg();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
