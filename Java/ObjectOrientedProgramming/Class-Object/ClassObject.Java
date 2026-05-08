//object oriented programming -> object -> 1. property 2. behavior
//class -> blueprint of the object
//object -> instance of the class

import java.util.ArrayList;
import java.util.Arrays;
class Calculator
{

    int num1; //insance variable (property)
    public int add(int numA, int numB)
    {
        return numA + numB;
    }

    public int add(int numA, int numB, int numC)
    {
        return numA + numB + numC;
    }

    public int add(ArrayList<Integer> numbers)
    {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
    public int add(int[] numbers)
    {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
} 

class ClassObject
{
    
    public static void main(String a[])
    {
        Calculator calc = new Calculator();
        System.out.println("Addition: " + calc.add(10, 14));
        System.out.println("Addition: " + calc.add(10, 14, 20));
        System.out.println("Addition: " + calc.add(new ArrayList<Integer>(Arrays.asList(10, 14, 20, 30))));

        int num[] = {10, 14, 50, 30};
        System.out.println("Addition: " + calc.add(num));

        int num2[] = new int[4];
        num2[0] = 10;
        num2[1] = 14;
        num2[2] = 50;
        num2[3] = 30;
        System.out.println("Addition: " + calc.add(num2));

        ArrayList<Integer> num3 = new ArrayList<Integer>();
        num3.add(10);
        num3.add(14);
        num3.add(50);

        System.out.println("Addition: " + calc.add(num3));

        //2D array

        int num4[][] = new int[3][3];

        for(int n[] : num4)
        {
            for(int m : n)
            {
                m = (int)(Math.random() * 10);
                System.out.print(m + " ");
            }
            System.out.println();
        }

        //jagged array

        int num5[][] = new int[3][];

        num5[0] = new int[2];
        num5[1] = new int[3];
        num5[2] = new int[1];

        for(int n[] : num5)
        {
            
            System.out.println(n.length);
        }

    }
}