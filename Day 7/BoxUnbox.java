public class BoxUnbox {
    public static void main(String[] args){
        //           Boxing
        int x = 101;
        Integer ob = new Integer(x);
        // Unboxing
        int y = ob.intValue();

        //     Auto-Boxing
        int p = 1045;
        Integer ob2 = p;

        // Auto-Unboxing

        int t = ob2;

        //-------------------------------------------------------
        System.out.println(y);
        System.out.println(t);
    }
}
