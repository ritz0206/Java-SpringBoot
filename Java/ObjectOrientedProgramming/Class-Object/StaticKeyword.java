class Mobile
{
    String brand;
    int price;
    String name;
    static String type;

    //called only once
    static //this will be executed when the class is loaded into memory, before any object is created
    {
        type = "Smartphone";
    }

    //static is called before constructor.
    public Mobile()
    {
        this.brand = "Unknown";
        this.price = 0;
        this.name = "Unknown";
    }
    public Mobile(String name, String brand, int price)
    {
        this.brand = brand;
        this.price = price;
        this.name = name;
    }
    public void showDetails()
    {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Name: " + name);
    }

    public static void showType()
    {
        //you cannot access non-static variables in static method
        //System.out.println("Brand: " + brand); // error
        System.out.println("Type: " + type);
    }

    public static void showNonStaticProperty(Mobile mob)
    {
        System.out.println("Brand: " + mob.brand);
    }


}

public class StaticKeyword {
    public static void main(String a[])
    {
        Mobile mob1 = new Mobile();
        mob1.brand = "Apple";
        mob1.price = 100000;
        mob1.name = "iPhone 14 Pro Max";
        System.out.println("Type: " + Mobile.type); // static variable can be accessed using class name

        Mobile mob2 = new Mobile();
        mob2.brand = "Samsung";
        mob2.price = 80000;
        mob2.name = "Galaxy S23 Ultra";

        mob1.showDetails();
        mob2.showDetails();

        Mobile.showType(); // static method can be accessed using class name

        Mobile.showNonStaticProperty(mob1); // static method can access non-static property through object reference
    }
}
