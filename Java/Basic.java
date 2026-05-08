class Basic //Java is Object Oriented Programming Language, so we need to create a class to write our code
{    
    public static void main(String a[]) //main method is the entry point of the program (called by JVM)
    {
        //1. Hello World
        System.out.println("Hello World");

        //2. Data Types
        int numInteger = 10;
        byte by = 127;
        short sh = 558;
        long l = 5854l;
        float f = 5.5f;
        double d = 5.5;
        char c = 'A';
        boolean b = true;

        //literals

        int num1 = 0b101;
        System.out.println(num1);

        int num2 = 0x7E;
        System.out.println(num2);

        //3. Number 0 count

        int num = 100_000_000;//underscore is used to make the number more readable, it does not affect the value of the number
        System.out.println(num);

        //4. epsilon

        double epsilon = 1e-10;
        System.out.println(epsilon);

        //5. Type Conversion and  Casting
        //Implicit Type Conversion
        int numInt = 100;
        double numDouble = numInt; // Implicitly converts int to double
        System.out.println("Integer value: " + numInt);
        System.out.println("Double value: " + numDouble);

        char ch = 'A';
        int asciiValue = (int) ch; // Explicitly casts char to int to get ASCII value
        System.out.println("ASCII value of " + ch + " is: " + asciiValue);

        //byte -> int -> long -> float -> double (other way is not possible with implicit conversion)
        byte by1 = 100;
        int numInt1 = by1; // Implicitly converts byte to int
        long numLong = numInt1; // Implicitly converts int to long
        float numFloat = numLong; // Implicitly converts long to float
        double numDouble1 = numFloat; // Implicitly converts float to double
        System.out.println("Byte value: " + by1);
        System.out.println("Integer value: " + numInt1);
        System.out.println("Long value: " + numLong);
        System.out.println("Float value: " + numFloat);
        System.out.println("Double value: " + numDouble1);

        //char to boolean not possible as boolean support t/f and char has multiple values.

        //double -> int

        double numDouble2 = 5.5;
        int numInt2 = (int) numDouble2; // Explicitly casts double to int, truncating the decimal part
        System.out.println("Double value: " + numDouble2);
        System.out.println("Integer value after casting: " + numInt2);

        double numDouble3 = 5.7;
        int numInt3 = (int) numDouble3; // Explicitly casts double to int, truncating the decimal part
        System.out.println("Double value: " + numDouble3);
        System.out.println("Integer value after casting: " + numInt3);

        //6. Type Promotion in Expressions

        byte by2 = 10;
        byte by3 = 20;
        int result = by2 * by3; // Both byte and byte are promoted to int before multiplication
        System.out.println("Result of byte * byte: " + result);

        //7. Assignment Operators (/, *, +, -, %, ++, --, +=, -=, *=, /=, %=)
        int a1 = 10;
        a1 += 5; // Equivalent to a1 = a1 + 5
        System.out.println("Value of a1 after += 5: " + a1);
        a1 -= 3; // Equivalent to a1 = a1 - 3
        System.out.println("Value of a1 after -= 3: " + a1);
        a1 *= 2; // Equivalent to a1 = a1 * 2
        System.out.println("Value of a1 after *= 2: " + a1);
        a1 /= 4; // Equivalent to a1 = a1 / 4
        System.out.println("Value of a1 after /= 4: " + a1);
        a1 %= 3; // Equivalent to a1 = a1 % 3
        System.out.println("Value of a1 after %= 3: " + a1);
        a1++; // Equivalent to a1 = a1 + 1
        System.out.println("Value of a1 after increment: " + a1);
        a1--; // Equivalent to a1 = a1 - 1
        System.out.println("Value of a1 after decrement: " + a1);
        ++a1; // Pre-increment: increments a1 before using it
        System.out.println("Value of a1 after pre-increment: " + a1); 
        --a1; // Pre-decrement: decrements a1 before using it
        System.out.println("Value of a1 after pre-decrement: " + a1);
        
        //8. Relational Operators (==, !=, >, <, >=, <=)
        int x = 10;
        int y = 20;
        System.out.println("x == y: " + (x == y)); // false
        System.out.println("x != y: " + (x != y)); // true
        System.out.println("x > y: " + (x > y)); // false
        System.out.println("x < y: " + (x < y)); // true
        System.out.println("x >= y: " + (x >= y)); // false
        System.out.println("x <= y: " + (x <= y)); // true

        //9. Logical Operators (&&, ||, !)
        boolean p = true;
        boolean q = false;
        System.out.println("p && q: " + (p && q)); // false
        System.out.println("p || q: " + (p || q)); // true
        System.out.println("!p: " + (!p)); // false
        System.out.println("!q: " + (!q)); // true

        //10. Bitwise Operators (&, |, ^, ~, <<, >>, >>>)
        int a2 = 5; // 0101 in binary
        int b2 = 3; // 0011 in binary
        System.out.println("a2 & b2: " + (a2 & b2)); // 1 (0001 in binary)} 
        System.out.println("a2 | b2: " + (a2 | b2)); // 7 (0111 in binary)
        System.out.println("a2 ^ b2: " + (a2 ^ b2)); // 6 (0110 in binary)
        System.out.println("~a2: " + (~a2)); // -6 (in binary: 1010, which is the two's complement of 6)
        System.out.println("a2 << 1: " + (a2 << 1)); // 10 (0101 shifted left by 1 becomes 1010 in binary)
        System.out.println("a2 >> 1: " + (a2 >> 1)); // 2 (0101 shifted right by 1 becomes 0010 in binary)
        System.out.println("a2 >>> 1: " + (a2 >>> 1)); // 2 (0101 shifted right by 1 becomes 0010 in binary, same as >> for positive numbers)

        //11. Ternary Operator (?:)
        int numA = 10;
        int numB = 20;
        int max = (numA > numB) ? numA : numB; // If numA is greater than numB, max is numA; otherwise, max is numB
        System.out.println("Maximum of numA and numB: " + max);

        //12. if-else statement
        int numC = 15;
        if (numC > 10) {
            System.out.println("numC is greater than 10");
        } else {
            System.out.println("numC is not greater than 10");
        }

        //13. switch statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");

            //14. loop (for, while, do-while)
            for (int i = 0; i < 5; i++) {
                System.out.println("i: " + i);
            }
            
            int j = 0;
            while (j < 5) {
                System.out.println("j: " + j);
                j++;
            }

            int k = 0;
            do {
                System.out.println("k: " + k);
                k++;
            } while (k < 5);

        }

    }

}