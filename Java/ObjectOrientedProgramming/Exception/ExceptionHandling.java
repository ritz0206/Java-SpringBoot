public class ExceptionHandling {
    
    public static void main(String[] a)
    {
        int i = 9;
        int j = 0;

        int[] arr = new int[5];

        String str = null;
        try
        {
            int result  = i/j;
            System.out.println("Result: " + result);
            result = arr[10]; // This will throw ArrayIndexOutOfBoundsException
            System.out.println("Result: " + result);
            System.out.println(str.length()); // This will throw NullPointerException
        }
        // Multiple catch blocks to handle different types of exceptions
        //maintain the order of catch blocks from specific to general exceptions
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception : " + e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception : " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("General Exception : " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }
}
