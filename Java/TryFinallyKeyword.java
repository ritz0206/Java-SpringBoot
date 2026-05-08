import java.util.Scanner;

public class TryFinallyKeyword {
    public static void main (String a[])
    {
        System.out.println("This is an example of try-finally block in Java.");
        System.out.println("Enter a number: ");
        Scanner sc = null;
        try{
            sc = new Scanner(System.in);
            int num = Integer.parseInt(sc.nextLine());
            System.out.println("You entered: " + num);
        }
        catch(Exception e){
            System.out.println("An error occurred: " + e.getMessage());
        }
        finally{
            System.out.println("This block will always execute, even if an exception occurs.");
            if (sc != null) {
                sc.close(); // Closing the scanner in the finally block
            }
        }
    }
}
