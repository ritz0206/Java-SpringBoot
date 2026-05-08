enum Status {//extends enum class implicitly
    SUCCESS,//0
    FAILURE,//1
    PENDING//2
}

enum Laptop {//extends enum class implicitly
    Macbook(2000),//0
    Dell(1500),//1
    ThinkPad(1800);//2

    private int price;

    Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
public class EnumExample {
    public static void main(String[] a) {
        Status status = Status.SUCCESS;
        System.out.println("Current status: " + status);
        System.out.println("Current status ordinal: " + status.ordinal());
        Status[] statusArray = Status.values();
        for (Status s : statusArray) {
            System.out.println(s + " ordinal: " + s.ordinal());
        }

        Laptop laptop = Laptop.Macbook;
        System.out.println("Selected laptop: " + laptop);
        System.out.println("Laptop price: $" + laptop.getPrice());
    }
}
