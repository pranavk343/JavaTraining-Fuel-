class Admission{
    static Admission ob = null;
    static int count;
    private Admission(){
        count =0;
    }
    static synchronized Admission getInstance(){
        if(ob==null){
            ob = new Admission();
            System.out.println(" New Admission");
        }
        count++;
        System.out.println("Total Admissions : "+ count);
        return ob;
    }
}
public class SingletonAssign {
    public static void main(String[] args) {
        Admission a1 = Admission.getInstance();
        Admission a2 = Admission.getInstance();
        Admission a3 = Admission.getInstance();
        Admission a4 = Admission.getInstance();
        Admission a5 = Admission.getInstance();
        Admission a6 = Admission.getInstance();
        Admission a7 = Admission.getInstance();

    }
}
