import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Product {
    public int productId;
    public String productName;
    public double price;

    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    @Override
    public String toString() {
        return productId + " " + productName + " " + price;
    }
}

class SortById implements Comparator<Product> {
    @Override
    public int compare(Product a, Product b) {
        return a.productId - b.productId;
    }
}

class SortByPrice implements Comparator<Product> {
    @Override
    public int compare(Product a, Product b) {
        return Double.compare(a.price, b.price);
    }
}

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the products count from the user
        System.out.print("Enter the number of products: ");
        int count = scanner.nextInt();

        // Check if the count is negative or zero
        if (count <= 0) {
            System.out.println("Invalid count");
            return;
        }

        // Create an array to store products
        Product[] products = new Product[count];

        // Get product details and create objects
        for (int i = 0; i < count; i++) {
            System.out.println("Enter details for Product " + (i + 1) + ":");
            System.out.print("Enter productId: ");
            int productId = scanner.nextInt();
            System.out.print("Enter productName: ");
            String productName = scanner.next();
            System.out.print("Enter price: ");
            double price = scanner.nextDouble();

            // Create a product object and add it to the array
            products[i] = new Product(productId, productName, price);
        }

        // Get choice from the user
        System.out.print("Enter choice (1 for sorting by id, 2 for sorting by price): ");
        int choice = scanner.nextInt();

        // Perform sorting based on the user's choice
        if (choice == 1) {
            Arrays.sort(products, new SortById());
        } else if (choice == 2) {
            Arrays.sort(products, new SortByPrice());
        } else {
            System.out.println("Invalid choice");
            return;
        }

        // Display the sorted products
        System.out.println("Sorted Products:");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}

