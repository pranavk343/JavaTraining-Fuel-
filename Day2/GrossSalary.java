import java.util.Scanner;

public class GrossSalary {
    /* HRA = 20%   DA = 80%
    Gross Salary = hra+da+basic salary
    https://wipro.icims.com/forms?module=Forms&action=showForm&view=htm&form=Elite_Offer_letter_template_2022&user=24249234&item=6338817&token=971517cb-0d20-410c-bdb8-f43ec647b380&csrf=B870326AEA525BA6
 */public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        double bs, hra, da, gs;
        System.out.println("Enter your Basic Salary : ");
        bs = ob.nextDouble();
        hra = bs * 0.2;
        da = bs * 0.8;
        gs = hra+da+bs;
        System.out.println("Gross salary is : "+gs);
    }
}
