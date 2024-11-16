import java.util.ArrayList;
import java.util.HashMap;

class Store {
    private String link;
    private String phone;
    private String email;
    private ArrayList<Product> products = new ArrayList<>();

    // Constructor για το κατάστημα
    public Store(String link, String phone, String email) {
        this.link = link;
        this.phone = phone;
        this.email = email;
    }

    // Εμφάνιση των στοιχείων του καταστήματος
    public void displayStoreInfo() {
        System.out.println("Store Link: " + link);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
    }

    // Προσθήκη ενός προϊόντος στο κατάστημα
    public void addProduct(Product product) {
        products.add(product);
    }

    // Αλλαγή κατάστασης προϊόντος (διαθέσιμο/μη διαθέσιμο)
    public void toggleAvailability(int productId) {
        for (Product product : products) {
            if (product.getProductId() == productId) {
                product.setAvailable(!product.isAvailable());
                return;
            }
        }
        System.out.println("Product not found.");
    }

    // Εμφάνιση όλων των προϊόντων μιας συγκεκριμένης κατηγορίας
    public void displayProductsByCategory(String category) {
        for (Product product : products) {
            if (product.getCategory().equalsIgnoreCase(category)) {
                product.displayProductInfo();
            }
        }
    }

    // Εμφάνιση όλων των προϊόντων μιας κατηγορίας σε συγκεκριμένο εύρος τιμών
    public void displayProductsByCategoryAndPriceRange(String category, double minPrice, double maxPrice) {
        for (Product product : products) {
            if (product.getCategory().equalsIgnoreCase(category) &&
                    product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
                product.displayProductInfo();
            }
        }
    }

    // Εμφάνιση προϊόντων για συγκεκριμένο κατασκευαστή
    public void displayProductsByManufacturer(String manufacturer) {
        for (Product product : products) {
            if (product.getManufacturer().equalsIgnoreCase(manufacturer)) {
                product.displayProductInfo();
            }
        }
    }

    // Εμφάνιση των πιο οικονομικών προϊόντων ανά κατηγορία
    public void displayCheapestProductPerCategory() {
        HashMap<String, Product> cheapestProducts = new HashMap<>();
        for (Product product : products) {
            if (!cheapestProducts.containsKey(product.getCategory()) ||
                    product.getPrice() < cheapestProducts.get(product.getCategory()).getPrice()) {
                cheapestProducts.put(product.getCategory(), product);
            }
        }
        for (Product product : cheapestProducts.values()) {
            product.displayProductInfo();
        }
    }

    // Εμφάνιση όλων των ετοιμοπαράδοτων προϊόντων
    public void displayAvailableProducts() {
        for (Product product : products) {
            if (product.isAvailable()) {
                product.displayProductInfo();
            }
        }
    }
}