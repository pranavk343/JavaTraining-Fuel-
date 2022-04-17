import java.util.Random;

/*Create an abstract class Compartment to represent a rail coach. Provide an abstract function
notice in this class. Derive FirstClass, Ladies, General, Luggage classes from the compartment
class. Override the notice function in each of them to print notice suitable to the type of the
compartment. Create a class TestCompartment . Write main function to do the following:
Declare an array of Compartment of size 10.
Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4.
Check the polymorphic behavior of the notice
method.*/
abstract class Compartment{
    abstract String notice();
}
class FirstClass extends Compartment{
    @Override
    String notice() {
       return "You are in First Class";

    }
}
class Ladies extends Compartment{
    @Override
    String notice() {
        return "You are in Ladies Class";
    }
}
class General extends Compartment{
    @Override
    String notice() {
        return "You are in General Class";
    }
}
class Luggage extends Compartment{
    @Override
    String notice() {
        return "You are in Luggage Compartment";
    }
}
public class TestCompartment {
    public static void main(String[] args){
        Compartment[] compartment = new Compartment[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int randomNum = random.nextInt((4 - 1) + 1) + 1;

            if (randomNum == 1)
                compartment[i] = new Luggage();
            else if (randomNum == 2)
                compartment[i] = new Ladies();
            else if (randomNum == 3)
                compartment[i] = new General();
            else if (randomNum == 4)
                compartment[i] = new FirstClass();

            System.out.println(compartment[i].notice());
        }
    }
}
