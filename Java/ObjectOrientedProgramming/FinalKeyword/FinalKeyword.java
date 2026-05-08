package ObjectOrientedProgramming.FinalKeyword;
//final - variable, method, class
//final variable - cannot be changed once initialized, it is a constant.
class finalmethod
{
    final void display() //final method - cannot be overridden by subclasses.
    {
        System.out.println("This is a final method.");
    }
}

class finalclass extends finalmethod
{
    //void display() //error: cannot override the final method from finalmethod
    //{
    //    System.out.println("Trying to override a final method.");
    //}
}

final class finalclass2 //No one can extend this class, it cannot be subclassed.
{
    void show()
    {
        System.out.println("This is a final class.");
    }
}

public class FinalKeyword {
    
    public static void main(String a[])
    {
        final int num = 10; //final variable - const in c++
        //num = 20; //error: cannot assign a value to final variable num
        System.out.println("Final variable num: " + num);
    }
}
