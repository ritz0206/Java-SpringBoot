import ObjectOrientedProgramming.DynamicMethodDispatch.A;

class A
{
    A()
    {
        System.out.println("Constructor of class A");
    }
    A(int num)
    {
        System.out.println("Constructor of class A with parameter: " + num);
    }
    void display()
    {
        System.out.println("This is class A");
    }
}
public class AnonymousObject {
    public static void main(String a[])
    {
        //No refernce stored in stack, so cannot be reused.
        new A(); // Anonymous object of class A
        new A().display(); // Anonymous object of class A calling a method.

    }
}
