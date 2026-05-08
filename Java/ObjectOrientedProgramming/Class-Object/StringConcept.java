class StringConcept {
    public static void main(String a[])
    {
        //1. String is a class in java
        //being a class, object is stored in heap - string constant pool
        String str1 = "Hello";
        String str2 = "World";
        //2. String concatination
        String str3 = str1 + " " + str2; // use concat method
        System.out.println(str3);

        String str4 = new String("Hello World");
        System.out.println(str4);

        //3. char array to string
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str5 = new String(charArray);
        System.out.println(str5);

        System.out.println("Hashcode of str1: " + str1.hashCode());

        //4. String is immutable
        String str6 = str1.concat(" World");
        System.out.println(str6); // Hello World - new string is created

        String str7 = "Rutika";
        String str8 = "Rutika";
        //5. String pool - str7 and str8 will point to the same memory location
        System.out.println(str7 == str8); // true

        //6. Mutable String - StringBuilder and StringBuffer
        StringBuffer sb1 = new StringBuffer();
        sb1.append("Hello");
        System.out.println(sb1.capacity());
        sb1.append(" Rutika");
        System.out.println(sb1.capacity());
        System.out.println(sb1);

        //To convert StringBuffer to String
        String sb2 = sb1.toString();
        System.out.println(sb2);

        //StringBuffer vs StringBuilder - StringBuffer is synchronized (thread-safe) while StringBuilder is not synchronized (not thread-safe)
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Hello");
        System.out.println(sb3.capacity());
        sb3.append(" Rutika");
        System.out.println(sb3.capacity());
        System.out.println(sb3);
        
    }
}
