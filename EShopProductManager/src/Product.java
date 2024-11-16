class Product {
    private static int idCounter = 0;  // Στατικός μετρητής για τη δημιουργία μοναδικών κωδικών
    private int productId;
    private String category;
    private String manufacturer;
    private boolean isAvailable;
    private double price;
    private String description;

    // Default constructor - αρχικοποιεί τις ιδιότητες με προεπιλεγμένες τιμές
    public Product() {
        this.productId = ++idCounter;
        this.category = "";
        this.manufacturer = "";
        this.isAvailable = false;
        this.price = 0.0;
        this.description = "";
    }

    // Constructor με παραμέτρους - δέχεται όλες τις ιδιότητες του προϊόντος
    public Product(String category, String manufacturer, boolean isAvailable, double price, String description) {
        this.productId = ++idCounter;
        this.category = category;
        this.manufacturer = manufacturer;
        this.isAvailable = isAvailable;
        this.price = price;
        this.description = description;
    }

    // Getters και setters για την ενθυλάκωση των δεδομένων
    public int getProductId() {
        return productId;
    }

    public String getCategory() {
        return category;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    // Μέθοδος εμφάνισης των στοιχείων του προϊόντος
    public void displayProductInfo() {
        System.out.println("Product ID: " + productId);
        System.out.println("Category: " + category);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
        System.out.println("Price: " + price);
        System.out.println("Description: " + description);
    }
}