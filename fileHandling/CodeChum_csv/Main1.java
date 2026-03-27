package fileHandling.CodeChum_csv;

/* Contact List Manager
Create File
Write File

*/

import java.io.*;
import java.util.*;

public class Main1 {
    private static final String FILENAME = "contacts.csv";
    // private static final int MAX_NAME_LENGTH = 100;
    // private static final int MAX_PHONE_LENGTH = 20;

    static class Contact {
        String name;
        String phone;
    }

    // TODO
    private static void addContact(Scanner sc) {
        Contact newContact = new Contact();
        
        System.out.print("Enter the contact's name: ");
        newContact.name = sc.nextLine();
        
        System.out.print("Enter the contact's phone number: ");
        newContact.phone = sc.nextLine();

        try (FileWriter fw = new FileWriter(FILENAME, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(newContact.name + "," + newContact.phone);
            System.out.println("Contact added successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file!");
        }
    }

    // TODO
    private static void viewAllContacts() {
        File file = new File(FILENAME);
        if (!file.exists() || file.length() == 0) {
            System.out.println("No contacts found.");
            return;
        }

        System.out.println("\nContacts:");
        System.out.println("Name\t\tPhone");
        System.out.println("-----------------");

        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    System.out.printf("%-15s\t%s%n", parts[0], parts[1]);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("No contacts found.");
        }
    }

    // TODO
    private static void searchContact(Scanner sc) {
        System.out.print("Enter the name to search for: ");
        String searchName = sc.nextLine();

        File file = new File(FILENAME);
        if (!file.exists()) {
            System.out.println("No contacts found.");
            return;
        }

        boolean found = false;
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 2 && parts[0].equalsIgnoreCase(searchName)) {
                    System.out.println("\nContact found:");
                    System.out.println("Name: " + parts[0]);
                    System.out.println("Phone: " + parts[1]);
                    found = true;
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("No contacts found.");
        }

        if (!found) {
            System.out.println("Contact not found.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nContact List Manager");
            System.out.println("1. Add a new contact");
            System.out.println("2. View all contacts");
            System.out.println("3. Search for a contact");
            System.out.println("4. Exit");

            System.out.print("Enter your choice (1-4): ");
            String input = sc.nextLine();
            
            try {
                int choice = Integer.parseInt(input);
                switch (choice) {
                    case 1:
                        addContact(sc);
                        break;
                    case 2:
                        viewAllContacts();
                        break;
                    case 3:
                        searchContact(sc);
                        break;
                    case 4:
                        System.out.println("Goodbye!");
                        sc.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }
}
