//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Δημιουργία καταστήματος
        Store store = new Store("www.storelink.com", "123-456-7890", "info@store.com");

        // Εμφάνιση πληροφοριών καταστήματος
        store.displayStoreInfo();

        // Δημιουργία προϊόντων και προσθήκη τους στο κατάστημα
        Product product1 = new Product("Laptop", "Dell", true, 999.99, "High-performance laptop.");
        Product product2 = new Product("Smartphone", "Samsung", false, 599.99, "Latest smartphone model.");
        Product product3 = new Product("Laptop", "HP", true, 799.99, "Budget-friendly laptop.");

        store.addProduct(product1);
        store.addProduct(product2);
        store.addProduct(product3);

        // Εμφάνιση όλων των προϊόντων μιας κατηγορίας
        System.out.println("\nProducts in category 'Laptop':");
        store.displayProductsByCategory("Laptop");

        // Αλλαγή κατάστασης διαθεσιμότητας και επανεμφάνιση
        store.toggleAvailability(product2.getProductId());
        System.out.println("\nAll available products:");
        store.displayAvailableProducts();

        // Εμφάνιση των πιο οικονομικών προϊόντων ανά κατηγορία
        System.out.println("\nCheapest product per category:");
        store.displayCheapestProductPerCategory();
    }
}