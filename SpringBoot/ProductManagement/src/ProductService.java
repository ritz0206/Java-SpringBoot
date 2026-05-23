
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class ProductService {
    
    List<Product> products = new ArrayList<>();
    public void addProduct(Product p)
    {
        products.add(p);
    }

    public List<Product> getAllProducts()
    {
        return products;
    }

    public List<Product> getProductByName(String name)
    {
        return products.stream().filter(p -> p.getName().equals(name)).collect(Collectors.toList());
    }

    public List<Product> getProductsByPlace(String place)
    {
        List<Product> productsByPlace = products.stream().filter(p -> p.getPlace().equals(place)).collect(Collectors.toList());
        return productsByPlace;
    }

    public List<Product> getProductsByExpiy(int exp)
    {
        List<Product> productsByExpiry = products.stream().filter(p -> p.getExpiry()==exp).collect(Collectors.toList());
        return productsByExpiry;
    }

    public List<Product> getProductsByText(String text)
    {
        List<Product> productByText = products.stream()
        .filter(p -> p.toString().toLowerCase().contains(text.toLowerCase()))
        .collect(Collectors.toList());
        return productByText;
    }
}
