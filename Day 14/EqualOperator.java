public class EqualOperator {
    public static void main(String[] args){
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        if(s1==s2){
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }


        //---------------------------------------------------------------//


        String s3 = "Hello";
        String s4 = "Hello";
        if(s3 == s4){
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }

        //----------------------------------------------------------------//


        String s5 = new String("Hello");
        String s6 = new String("Hello");
        if(s5.equals(s6)){
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }
    }
}
