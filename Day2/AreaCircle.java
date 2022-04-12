import java.util.Scanner;

public class AreaCircle {
    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        double r, a;
        System.out.println("Enter radius of Circle :");
        r = ob.nextDouble();
        a = 3.14*r*r;
        System.out.println("Area of Circle is : "+ a);
    }
}
