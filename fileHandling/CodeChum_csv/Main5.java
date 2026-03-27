package fileHandling.CodeChum_csv;

import java.io.*;
import java.util.*;
/* Product Inventory Management

Create
Write

*/

class Product {
    int id;
    String name;
    String category;
    float price;
    int stock;
}

public class Main5 {
    static boolean isIdUnique(List<Product> products, int id) {
        for (Product product : products) {
            if (product.id == id)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of products to add: ");
        int numProducts = sc.nextInt();
        sc.nextLine(); 

        List<Product> products = new ArrayList<>();

        for (int i = 0; i < numProducts; i++) {
            System.out.println("\nEnter details for product " + (i + 1) + ":");
            Product product = new Product();

            while (true) {
                System.out.print("Enter Product ID: ");
                product.id = sc.nextInt();
                sc.nextLine();
                if (isIdUnique(products, product.id))
                    break;
                System.out.println("Product ID must be unique. Please try again.");
            }

            System.out.print("Enter Product Name: ");
            product.name = sc.nextLine();

            System.out.print("Enter Category: ");
            product.category = sc.nextLine();

            while (true) {
                System.out.print("Enter Price: ");
                product.price = sc.nextFloat();
                sc.nextLine();
                if (product.price >= 0)
                    break;
                System.out.println("Price must be non-negative.");
            }

            while (true) {
                System.out.print("Enter Stock Quantity: ");
                product.stock = sc.nextInt();
                sc.nextLine();
                if (product.stock >= 0)
                    break;
                System.out.println("Stock Quantity must be non-negative.");
            }

            products.add(product);
        }

        try (FileWriter writer = new FileWriter("inventory.csv")) {
            writer.write("Product ID,Product Name,Category,Price,Stock Quantity\n");
            for (Product product : products) {
                writer.write(String.format("%d,%s,%s,%.2f,%d\n",
                    product.id, product.name, product.category, product.price, product.stock));
            }
            System.out.println("\nCSV file created successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
