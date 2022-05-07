public class FinallyBlock {
           static void div1(){
            try {
                int a;
                a=10/0;
            } catch (ArithmeticException e) {
                System.out.println("Can not divide by zero");
            }finally{
                System.out.println("Always executed");
            }
        }
        static void div2(){
            try {
                int a;
                a=10/2;
                System.out.println(a);
            } catch (ArithmeticException e) {
                System.out.println("Can not divide by zero");
            }finally{
                System.out.println("Always executed");
            }
        }
        static void div3(){
            try {
                return;
            } catch (ArithmeticException e) {
                System.out.println("Can not divide by zero");
            }finally{
                System.out.println("Always executed");
            }
        }
        public static void main(String[] args) {
            div1();
            div2();
            div3();

        }
}
