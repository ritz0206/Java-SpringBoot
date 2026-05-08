class DivideException extends ArithmeticException
{
    public DivideException(String message)
    {
        super(message);
    }
}

public class ThrowKeyword
{
    public static void main(String[] a)
    {
        try
        {
            int result = divide(10, 10);
            System.out.println("Result: " + result);
        }
        catch(DivideException e)
        {
            System.out.println("Caught an exception: " + e.getMessage());
        }

        try{
            Class.forName("DivideException"); // This will not throw ClassNotFoundException
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Caught an exception: " + e.getMessage());
        }

        try{
            Class.forName("hierarcyClass"); // This will throw ClassNotFoundException
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace(); // hierarchy of method called.
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }

    public static int divide(int a, int b) throws DivideException // Method signature indicates that this method can throw an exception, does not handle it.
    {
        if(b == 10)
        {
            //throwing and exception with a custom message 
            throw new DivideException("DivideException: Division by 10 is not allowed.");
        }
        return a / b;
    }
}