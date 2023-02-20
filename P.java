import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class CellStore {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Display perishable products");
            System.out.println("2. Display non-perishable products");
            System.out.println("3. Sell product");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    productManager.displayProducts(productManager.perishableProducts);
                    break;
                case 2:
                    productManager.displayProducts(productManager.nonPerishableProducts);
                    break;
                case 3:
                    productManager.sellProduct();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}

class ProductManager {
    ArrayList<Product> perishableProducts = new ArrayList<>();
    ArrayList<Product> nonPerishableProducts = new ArrayList<>();

    public ProductManager() {
        initProducts();
    }

    void initProducts() {
        perishableProducts.add(new Product("Perishable 1", "2023-02-10", true));
        perishableProducts.add(new Product("Perishable 2", "2023-02-11", true));
        perishableProducts.add(new Product("Perishable 3", "2023-02-12", true));
        perishableProducts.add(new Product("Perishable 4", "2023-02-13", true));
        perishableProducts.add(new Product("Perishable 5", "2023-02-14", true));

        nonPerishableProducts.add(new Product("Non-Perishable 1", null, false));
        nonPerishableProducts.add(new Product("Non-Perishable 2", null, false));
        nonPerishableProducts.add(new Product("Non-Perishable 3", null, false));
        nonPerishableProducts.add(new Product("Non-Perishable 4", null, false));
        nonPerishableProducts.add(new Product("Non-Perishable 5", null, false));
    }

    void displayProducts(ArrayList<Product> products) {
        System.out.println("\nProduct Name\tExpiry Date");
        for (Product product : products) {
            String expiryDate = (product.isPerishable) ? product.expiryDate : "N/A";
            System.out.println(product.name + "\t\t" + expiryDate);
        }
        System.out.println();
    }

    void sellProduct() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product name: ");
}
}
