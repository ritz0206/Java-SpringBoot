abstract class Car // may/maynot have abstract methods in abstract class. But if there is abstract method then class should be abstract.
{
    //abstraction -> hiding the implementation details and showing only functionality to the user
    public abstract void drive();//No implementation -> just declaration of method

    public void playMusic()
    {
        System.out.println("Playing music in the car");
    }
}

class BMW extends Car // concrete class
{
    @Override //annotation for compile time safety //there are multiple annotation when working with framework
    public void drive() {
        System.out.println("Driving a BMW car");
    }
}

public class Abstraction {
    public static void main(String[] args) {

        //Car obj = new Car(); -> cannot create object of abstract class
        Car obj = new BMW(); // can create object of subclass
        
        obj.drive();
        obj.playMusic();


    }
}
