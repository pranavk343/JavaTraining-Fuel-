import java.util.Scanner;

/*Write a program to accept name and age of a person from the command prompt(passed as arguments when you execute the class)
 and ensure that the age entered is >=18 and < 60.
 Display proper error messages.
 The program must exit gracefully after displaying the error message in case the arguments passed are not proper.
 (Hint : Create a user defined exception class for handling errors.*/
class InvalidAgeException extends Exception{
    @Override
    public String toString() {
        return "Age must be greater than 18 and less than 60";
    }
}
class Person{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException{
        if(age<18 && age>60){
            InvalidAgeException ob = new InvalidAgeException();
            throw ob;
        }
        this.age = age;
    }
}
public class Exercise8 {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        Person p1 = new Person();
        try{
            System.out.println("Enter name : ");
            String n = ob.next();
            p1.setName(n);
            System.out.println("Enter age : ");
            int a = ob.nextInt();
            p1.setAge(a);

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
