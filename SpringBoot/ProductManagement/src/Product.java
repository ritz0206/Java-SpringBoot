public class Product {
    private String name;
    private String type;
    private String place;
    private int count;
    private int expiry;

    //Constructor
    public Product()
    {

    }

    public Product(String name, String type, String place, int count, int expiry)
    {
        this.name = name;
        this.type = type;
        this.place = place;
        this.count = count;
        this.expiry = expiry;
    }

    public String getName()
    {
        return name;
    }

    public String getPlace()
    {
        return place;
    }

    public String getType()
    {
        return type;
    }

    public int getCount()
    {
        return count;
    }

    public int getExpiry()
    {
        return expiry;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPlace(String place)
    {
        this.place = place;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setCount(int count)
    {
        this.count = count;
    }

    public void setExpiry(int expiry)
    {
        this.expiry = expiry;
    }

    @Override
    public String toString()
    {
        return "Product{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", place='" + place + '\'' +
                ", count=" + count +
                ", expiry=" + expiry +
                '}';
    }
}
