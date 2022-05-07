interface Car {
    public void assemble();
}

class BasicCar implements Car {

    @Override
    public void assemble() {
        System.out.print("Basic Car.");
    }
}

class CarDecorator implements Car {
    protected Car car;

    public CarDecorator(Car c) {
        this.car = c;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}

class SportsCar extends CarDecorator {
    public SportsCar(Car c) {
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println(" Adding features of Sports Car.");
    }
}

class LuxuryCar extends CarDecorator {
    public LuxuryCar(Car c) {
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println(" Adding features of Luxury Car.");
    }
}
public class Demo {
    public static void main(String[] args) {
        BasicCar c1=new BasicCar();
        SportsCar sport=new SportsCar(c1);
        sport.assemble();

        BasicCar c2=new BasicCar();
        LuxuryCar luxury=new LuxuryCar(c2);
        luxury.assemble();
    }

}
