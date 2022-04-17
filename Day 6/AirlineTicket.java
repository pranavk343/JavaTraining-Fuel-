import java.util.Scanner;

//Create a class that captures airline tickets. Each ticket lists the departure and arrival cities,
//a flight number, and a seat assignment.
//A seat assignment has both a row and a letter for the seat within the row (such as 12F).Make two examples of tickets.
class Ticket{
    private String depart,arrive,seatassign;
    private int fnumber;

    public String getArrive() {
        return arrive;
    }

    public void setArrive(String arrive) {
        this.arrive = arrive;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getSeatassign() {
        return seatassign;
    }

    public void setSeatassign(String seatassign) {
        this.seatassign = seatassign;
    }

    public int getFnumber() {
        return fnumber;
    }

    public void setFnumber(int fnumber) {
        this.fnumber = fnumber;
    }
    void showTicket(){
        System.out.println("Depature : "+getDepart());
        System.out.println("Arrival : "+getArrive());
        System.out.println("Flight Number : "+getFnumber());
        System.out.println("Seat Assignment : "+getSeatassign());
    }
}
public class AirlineTicket {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        Ticket t1 = new Ticket();
        Ticket t2 = new Ticket();
        String dep,arr,seatassign;
        dep= ob.next();
        t1.setDepart(dep);
        arr = ob.next();
        t1.setArrive(arr);
        seatassign = ob.next();
        t1.setSeatassign(seatassign);
        int x=ob.nextInt();
        t1.setFnumber(x);
        t1.showTicket();
    }
}
