import java.util.*;
import java.util.Scanner;

//try with multiple catch
public class MultipleTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter 2 numbers");

        try {
            a = sc.nextInt();
            b = sc.nextInt();
            c = a / b;
            System.out.println("Division is " + c);

        } catch (ArithmeticException e) {
            System.out.println("can not divide by zero!!");
        } catch (InputMismatchException e) {
            System.out.println("plz enter int value!!");
        }

    }
}
