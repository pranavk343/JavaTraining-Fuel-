import java.util.*;

//new way to handle multiple exception by using single catch
public class NMultiExcep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter 2 numbers");

        try {
            a = sc.nextInt();
            b = sc.nextInt();
            c = a / b;
            System.out.println("Division is " + c);

        } catch (ArithmeticException | InputMismatchException e) {
            // System.out.println(e);
            if (e instanceof ArithmeticException) {
                System.out.println("Can not divide by zero");
            } else if (e instanceof InputMismatchException) {
                System.out.println("Plz enter int value");
            }

        }
    }
}
