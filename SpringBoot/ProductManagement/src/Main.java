import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        ProductService service = new ProductService();

        service.addProduct(new Product("Rice", "Flour", "Bottom-Left Drawer", 2, 2027));
        service.addProduct(new Product("Wheat", "Flour", "Kitchen Shelf", 1, 2026));
        service.addProduct(new Product("Milk", "Dairy", "Refrigerator", 3, 2025));
        service.addProduct(new Product("Eggs", "Dairy", "Refrigerator", 12, 2025));
        service.addProduct(new Product("Sugar", "Kitchen Essentials", "Top Cabinet", 1, 2028));
        service.addProduct(new Product("Salt", "Kitchen Essentials", "Top Cabinet", 1, 2030));
        service.addProduct(new Product("Cooking Oil", "Kitchen Essentials", "Pantry", 2, 2027));
        service.addProduct(new Product("Apples", "Fruit", "Fruit Basket", 6, 2025));
        service.addProduct(new Product("Bananas", "Fruit", "Dining Table", 8, 2025));
        service.addProduct(new Product("Potatoes", "Vegetables", "Vegetable Rack", 5, 2026));
        service.addProduct(new Product("Onions", "Vegetables", "Vegetable Rack", 4, 2026));
        service.addProduct(new Product("Tomato Sauce", "Sauces", "Kitchen Shelf", 1, 2027));
        service.addProduct(new Product("Biscuits", "Snacks", "Snack Drawer", 5, 2026));
        service.addProduct(new Product("Pasta", "Flour", "Pantry", 3, 2028));
        service.addProduct(new Product("Orange Juice", "Beverages", "Refrigerator", 2, 2025));

        // Cleaning Products
        service.addProduct(new Product("Dishwashing Liquid", "Cleaning Supplies", "Under Sink Cabinet", 1, 2028));
        service.addProduct(new Product("Laundry Detergent", "Cleaning Supplies", "Utility Shelf", 2, 2029));
        service.addProduct(new Product("Floor Cleaner", "Cleaning Supplies", "Bathroom Cabinet", 1, 2027));
        service.addProduct(new Product("Glass Cleaner", "Cleaning Supplies", "Cleaning Closet", 1, 2028));
        service.addProduct(new Product("Trash Bags", "Household Essentials", "Storage Room", 3, 2031));

        List<Product> products = service.getAllProducts();

        System.out.println("All Products:");
        for(Product p : products)
        {
            System.out.println(p.getName() + "  " + p.getType() + "  " + p.getPlace() + "  " + p.getCount() + "  " + p.getExpiry());
        }

        System.out.println("=====================================================================================================");

        List<Product> namedProducts = service.getProductByName("Milk");

        System.out.println(namedProducts);
        System.out.println("=====================================================================================================");

        System.out.println("Product with a particular text:");

        List<Product> productByText = service.getProductsByText("Essentials");

        for(Product p : productByText)
        {
            System.out.println(p.getName() + "  " + p.getType() + "  " + p.getPlace() + "  " + p.getCount() + "  " + p.getExpiry());
        }
        System.out.println("=====================================================================================================");

    }
}