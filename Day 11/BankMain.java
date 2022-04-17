/*1.1. Create a class called GeneralBank which acts as base class for all banks. This class has
functionality getSavingInterestRate and getFixedInterestRate methods, which return the saving
a/c rate of interest and fixed account rate of interest the specific bank gives. Since GeneralBank
cannot say what percentage which bank would give, make it abstract.
1.2. Create 2 subclasses of GeneralBank called ICICIBank and KotMBank. Override the
methods from base class. ICICI - Savings 4% Fixed 8.5% and KotMBank. - Savings 6% Fixed
9%
1.3. Create a main method to test the above classes. Try one by one and absorb your finding. a)
ICICIBank object reference instantiated with ICICIBank class. b) KotMBank object reference
instantiated with KotMBank class. c) GeneralBank object reference instantiated with KotMBank
class. d) GeneralBank object reference instantiated with ICICIBank class.*/
abstract class GeneralBank {
    abstract double getSavingsInterestRate();
    abstract double getFixedDepositInterestRate();
}

class ICICIBank extends GeneralBank {

    @Override
    double getSavingsInterestRate() {
        return 4;
    }

    @Override
    double getFixedDepositInterestRate() {
        return 8.5;
    }

}

class KotMBank extends GeneralBank {

    @Override
    double getSavingsInterestRate() {
        return 6;
    }

    @Override
    double getFixedDepositInterestRate() {
        return 9;
    }

}
public class BankMain {
    public static void main(String[] args) {
        ICICIBank iciciBank = new ICICIBank();
        KotMBank kotMBank = new KotMBank();
        System.out.println("ICICI BANK: " +
                "Fixed Rate = " + iciciBank.getFixedDepositInterestRate() + "%, " +
                "Saving Rate = " + iciciBank.getSavingsInterestRate() + "%");
        System.out.println("KOTAK MAHINDRA BANK: " +
                "Fixed Rate = " + kotMBank.getFixedDepositInterestRate() + "%, " +
                "Saving Rate = " + kotMBank.getSavingsInterestRate() + "%");
        System.out.println("----------------------------------------------------------");
        GeneralBank gBank1 = new ICICIBank();
        GeneralBank gBank2 = new KotMBank();
        System.out.println("GENERAL BANK1: " +
                "Fixed Rate = " + gBank1.getFixedDepositInterestRate() + "%, " +
                "Saving Rate = " + gBank1.getSavingsInterestRate() + "%");

        System.out.println("GENERAL BANK2: " +
                "Fixed Rate = " + gBank2.getFixedDepositInterestRate() + "%, " +
                "Saving Rate = " + gBank2.getSavingsInterestRate() + "%");
    }
}
