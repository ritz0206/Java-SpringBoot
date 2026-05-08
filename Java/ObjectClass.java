class ClassA extends Object
{

}

public class ObjectClass {
    
    public static void main(String[] args) {
        ClassA a = new ClassA();
        System.out.println(a.toString());

        a.hashCode();
        System.out.println(a.hashCode());

        System.out.println(a.equals(a));

        System.out.println(a);//here toString method is called implicitly
    }
}
