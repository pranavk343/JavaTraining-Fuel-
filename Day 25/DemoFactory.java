//factory
 	abstract class Age {
    void getCustInfo() {
        System.out.println("Get age of person");
    }
    abstract void calculateAge();
}
class Old extends Age {
    @Override
    void calculateAge() {
        System.out.println("Calculate Age of old person");
    }
}
class Young extends Age {
    @Override
    void calculateAge() {
        System.out.println("Calculate age of young person");
    }
}
class AgeFactory {
    public static Age getAge(String type) {
        Age obj = null;
        if (type.equalsIgnoreCase("saving")) {
            obj = new Old();

        } else {
            obj = new Young();
        }
        return obj;
    }
}

public class DemoFactory {
    public static void main(String[] args) {

        Age ob1 = AgeFactory.getAge("young");
        ob1.calculateAge();
        ob1 = AgeFactory.getAge("old");
}
}