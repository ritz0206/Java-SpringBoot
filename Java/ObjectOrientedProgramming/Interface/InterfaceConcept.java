//Inteface does not have memory in heap.
interface A // this is design, I will tell you what are the methods needed but class needs to implement them.
{
    //variable in interface is final and static
    int a = 10; // by default it is public, static and final
    void show();
    void config();
}

interface C
{
    void display();
}

interface Y extends C
{
    void example();
}

class B implements A,C // we can implement multiple interfaces in a class
{
    public void show()
    {
        System.out.println("This is show method");
    }

    public void config()
    {
        System.out.println("This is config method");
    }

    public void display()
    {
        System.out.println("This is display method");
    }
}
public class InterfaceConcept {
    public static void main(String[] a)
    {
        System.out.println("Value of a in A interface: " + A.a);
        B obj = new B();
        obj.show();
        obj.config();
    }
}
