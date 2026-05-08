@FunctionalInterface
interface A
{
    void display();
}

@FunctionalInterface
interface B
{
    void show(int i);
}

@FunctionalInterface
interface C
{
    int add(int i, int j);
    //void method2(); // This will cause a compilation error because a functional interface can have only one abstract method.
}
public class FunctionalInterfaceConcept {
    public static void main(String[] a)
    {
        //lambda expression:
        A obj = () -> System.out.println("Hello from functional interface");
        obj.display();

        B obj2 = (i) -> System.out.println("Value of i is: " + i);
        obj2.show(10);

        B obj3 = i -> System.out.println("Value of i is: " + i);
        obj3.show(10);

        C objC = (i, j) -> i + j;
        int result = objC.add(5, 10);
        System.out.println("Result of addition: " + result);
    }
    
}
