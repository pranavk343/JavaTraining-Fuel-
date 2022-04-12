import java.util.Scanner;

/*At the State Fair Pie Eating Contest all contestants in the heavyweight division must weigh
within 100 pounds and 250 pounds. Write a program that asks for a contestant's weight and then
says if the contestant is allowed in the contest.
*/
public class PieContest {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter your weigth in pounds : ");
        int weight = ob.nextInt();
        if(weight>=100 && weight<=250){
            System.out.println("Contestent is allowed in the contest !!");
        }else{
            System.out.println("Contestent is not allowed in the contest !!");
        }
    }
}
