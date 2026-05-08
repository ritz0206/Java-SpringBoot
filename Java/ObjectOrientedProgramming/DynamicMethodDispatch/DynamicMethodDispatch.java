package ObjectOrientedProgramming.DynamicMethodDispatch;
class A
{
    void show()
    {
        System.out.println("In class A");
    }
}

class B extends A
{
    void show()
    {
        System.out.println("In class B");
    }
}

public class DynamicMethodDispatch {
    public static void main(String a[])
    {
        //refernce of a super class and object of base class.
        A objARef = new B(); //A class type and B implementation.
        objARef.show(); //Dynamic method dispatch
    }

}
