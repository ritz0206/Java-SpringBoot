abstract class A
{
    public void display()
    {
        System.out.println("Hello");
    }
}

abstract class B
{
    public abstract void display();
}
public class AnonymousClass {
    
    public static void main(String[] a)
    {
        //Anonymous inner class - we are not creating an object of A.
        A obj = new A()
        {
            public void display()
            {
                System.out.println("Welcome to new class A");
            }
        };
        obj.display();

        //Anonymous inner class - we are not creating an object of B.
        B objB = new B()
        {
            public void display()
            {
                System.out.println("Welcome to new class B");
            }
        };

        objB.display();
    }
}
