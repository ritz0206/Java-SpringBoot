class Human
{
    private String name;
    private int age;

    //default constructor - behind the scene, java compiler will create a default constructor if we do not define any constructor in the class
    Human()
    {}
    Human(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getDetails()
    {
        return "Name: " + name + ", Age: " + age;
    }
}

public class Encapsulation {
    public static void main(String a[])
    {
        Human human = new Human("Rutika", 25);
        System.out.println(human.getDetails());
    }
}