/*Create a class named ‘Animal’ which includes methods like eat() and sleep(). Create a child class
of Animal named ‘Bird’ and override the parent class methods. Add a new method named fly().
Create an instance of Animal class and invoke to eat and sleep methods using this object.Create
an instance of Bird class and invoke to eat, sleep and fly methods using this object.*/

class Animal{
    void eat(){
        System.out.println("Animals can eat!!");
    }
    void sleep(){
        System.out.println("Animals can sleep!!");
    }
}
class Bird extends Animal{
    @Override
    void eat() {
        System.out.println("Birds can eat!!");
    }

    @Override
    void sleep() {
        System.out.println("Birds can sleep!!");
    }
    void fly(){
        System.out.println("Birds can fly!!");
    }
}
public class AnimalInheritance {
    public static void main(String[] args){
        Animal a1 = new Animal();
        a1.eat();
        a1.sleep();
        Bird b1 = new Bird();
        b1.eat();
        b1.sleep();
        b1.fly();
        System.out.println("Changed");
    }
}
