import java.util.Scanner;
public class TryWithResources {
    
    public static void main(String a[])
    {
        int num = 0;

        //try-with-resources to automatically close the resource (Scanner in this case) after use, even if an exception occurs.
        try(Scanner sc = new Scanner(System.in)){
            {
                System.out.print("Enter a number: ");
                num = sc.nextInt();
                System.out.println("You entered: " + num);
            }
        }
    }
}
