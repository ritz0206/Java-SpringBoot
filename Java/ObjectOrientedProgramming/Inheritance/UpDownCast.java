class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
    public void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    public void fetch() {
        System.out.println("Fetching the ball!");
    }
}

public class UpDownCast {
    public static void main(String[] a) {
        //upcasting implicitely works without the need for an explicit cast
        // Upcasting: Subclass reference assigned to superclass reference
        Animal animal = (Animal) new Dog(); // Upcasting
        animal.makeSound(); // Output: Woof!
        animal.eat(); // Output: Animal eats food //
        
        // Downcasting: Superclass reference cast back to subclass reference
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal; // Downcasting
            dog.fetch(); // Output: Fetching the ball!
        }

        //Upcasting:

        Animal animal2 = new Dog(); // Upcasting without explicit cast
        // animal2.fetch(); // This will cause a compile-time error because the method is not defined in the Animal class
        //Downcasting:

        Dog dog2 = (Dog) animal2;
        dog2.fetch(); // This will work because animal2 is actually a Dog instance
    }
}
