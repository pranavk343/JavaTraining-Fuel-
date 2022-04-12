import java.util.Scanner;

class Complex{
    double real,image;
    Complex(double n1, double n2){
        this.real = n1;
        this.image = n2;
    }
    public static Complex add(Complex x, Complex y){
        Complex temp = new Complex(0,0);
        temp.real = x.real + y.real;
        temp.image = x.image + x.image;
        return temp;
    }
}
public class TwoComplexNumbers {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        Complex n1 = new Complex(5,6);
        Complex n2 = new Complex(8,7);



    }
}
