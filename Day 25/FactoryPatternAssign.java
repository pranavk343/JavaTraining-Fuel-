abstract class Ticket{
    abstract void ticketArrange();
}
class SecondClass extends Ticket{
    @Override
    void ticketArrange() {
        System.out.println("Calculate interest of Saving");
    }
}
class BusinessClass extends Ticket{
    @Override
    void ticketArrange() {
        System.out.println("You are in Business Class");
    }
}
class TicketAssign{
    static Ticket getAccount(String type){
        Ticket ob = null;
        if (type.equalsIgnoreCase("General")) {
            ob = new SecondClass();
        }else if (type.equalsIgnoreCase("Business")) {
            ob = new BusinessClass();
        }
        return  ob;
    }
}
public class FactoryPatternAssign {
    public static void main(String[] args) {
        Ticket ob1 = TicketAssign.getAccount("general");
        Ticket ob2 = TicketAssign.getAccount("business");
        ob1.ticketArrange();
        ob2.ticketArrange();
    }
}
