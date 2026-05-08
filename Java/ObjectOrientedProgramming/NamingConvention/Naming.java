class MyClass // Class names should be in PascalCase
{
    int myVariable; // variable names should be in camelCase

    public void showDetails() // method names should be in camelCase
    {
        System.out.println("This is a method in MyClass.");
    }
}

public class Naming
{
    public static void main(String[] args)
    {
        // instance names should be in camelCase
        MyClass myClassInstance = new MyClass();
        
        //Class and Interface name - PascalCase
        //Variable and method name - camelCase
        //Constant name - UPPERCASE_WITH_UNDERSCORES
        // Package name - lowercase
    }
}
