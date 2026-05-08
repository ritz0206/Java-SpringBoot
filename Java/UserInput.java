import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.IOException;

public class UserInput {
    public static void main(String[] a) {
        //Scanner is easier but it came after bufferReader.
        //Use of Scanner class to read user input from the console 
        try(Scanner sc = new Scanner(System.in) /*try-with-resources to automatically close the scanner*/){
            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            System.out.println("Hello, " + name + "!");

            System.out.print("Enter your single byte Integer: ");
            int num = System.in.read(); // This will read a single byte and return its ASCII value
            System.out.println("ASCII value of the first character entered - 40: " + (num - 40));
        }
        catch(Exception e){
            System.out.println("An error occurred: " + e.getMessage());
        }


        //Scanner class to read an integer input from the user and closing it manually
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc2.nextInt();
        System.out.println("Your age is: " + age);
        sc2.close(); // Manually closing the second scanner


        //BufferedReader and InputStreamReader to read user input from the console, with exception handling for IOException
        //InputStreamReader - to read characters from the input stream
        InputStreamReader isr = new InputStreamReader(System.in);
        //BufferedReader - to get more value than read.
        try(BufferedReader br = new BufferedReader(isr))
        {
            int num = Integer.parseInt(br.readLine()); // Read a line of input and convert it to an integer
            System.out.println("You entered: " + num);

        }
        catch (IOException e)
        {
            System.out.println("An error occurred: " + e.getMessage());
        }

        }
}
