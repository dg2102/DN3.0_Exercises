import java.util.HashMap;

public class Inventory {
    private HashMap<String, Product> products;

    public Inventory() {
        products = new HashMap<>();
    }

    // Add product
    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
    }

    // Update product
    public void updateProduct(String productId, int quantity, double price) {
        Product product = products.get(productId);
        if (product != null) {
            product.setQuantity(quantity);
            product.setPrice(price);
        }
    }

    // Delete product
    public void deleteProduct(String productId) {
        products.remove(productId);
    }

    // Get product
    public Product getProduct(String productId) {
        return products.get(productId);
    }
}