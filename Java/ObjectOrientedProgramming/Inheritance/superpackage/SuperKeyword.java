package superpackage;
//import superpackage.A; -> this is how to import in other classes
class A extends Object //Every class in java extends Object class
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

class B extends A
{
    B()
    {
        //super() is called by default, it will call the constructor of parent class A
        System.out.println("Constructor of class B");
    }
    B(int num)
    {
        super(num); // calls the parameterized constructor of class A
        System.out.println("Constructor of class B with parameter: " + num);
    }
    B(String str)
    {
        this(); //calls default constructor of B class, which calls super -> default constructor of A.
        System.out.println("Constructor of class B with parameter: " + str);
    }
    void show()
    {
        System.out.println("This is class B");
    }
}

class C extends A
{
    C()
    {
        //super() is called by default, it will call the constructor of parent class A
        System.out.println("Constructor of class C");
    }
    C(int num)
    {
        super(); // calls the default constructor of class A
        System.out.println("Constructor of class C with parameter: " + num);
    }
}

public class SuperKeyword {
    
    public static void main(String a[])
    {
        B objB = new B();
        B objB2 = new B(2); // calls parameterized contructor of A and parameterized constructor of B

        C objC2 = new C(2); //calls default constructor of A and parameterized constructor of C
    }
}
