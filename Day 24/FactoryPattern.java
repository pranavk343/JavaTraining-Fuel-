abstract class Account{
    abstract void calculateInterest();
}
class Saving extends Account{
    @Override
    void calculateInterest() {
        System.out.println("Calculate interest of Saving");
    }
}
class Loan extends Account{
    @Override
    void calculateInterest() {
        System.out.println("Calculate interest of Loan");
    }
}
class AccountFactory{
    static Account getAccount(String type){
        Account ob = null;
        if (type.equalsIgnoreCase("saving")) {
            ob = new Saving();
        }else if (type.equalsIgnoreCase("loan")) {
            ob = new Loan();
        }
        return  ob;
    }
}
public class FactoryPattern {
    public static void main(String[] args) {
        Account ob1 = AccountFactory.getAccount("loan");
        Account ob2 = AccountFactory.getAccount("saving");
        ob1.calculateInterest();
        ob2.calculateInterest();
    }
}
