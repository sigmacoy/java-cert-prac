package sample_problems.fileHandling.CodeChum_Exercises;


/* BOOK LENDING SYSTEM

EXPECTED LOGS

Create file

Write to file

Read file

Write to file

*/

import java.io.*;
import java.util.*;

public class Main5 {
    static final String FILE_NAME = "book_lending.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nBook Lending System");
            System.out.println("1. Add Book");
            System.out.println("2. Return Book");
            System.out.println("3. Display Books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1/2/3/4): ");

            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    addBook(sc);
                    break;
                case "2":
                    returnBook(sc);
                    break;
                case "3":
                    displayBooks();
                    break;
                case "4":
                    System.out.println("Exiting the system.");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }

    static void addBook(Scanner sc) {
        try {
            System.out.print("Enter the title of the book: ");
            String title = sc.nextLine();
            System.out.print("Enter the name of the borrower: ");
            String borrower = sc.nextLine();

            FileWriter fw = new FileWriter(FILE_NAME, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Book Title: " + title + ", Borrower: " + borrower);
            bw.newLine();
            bw.close();

            System.out.println("Book added successfully!");
        } catch (IOException e) {
            System.out.println("Error: Could not write to file.");
        }
    }

    static void returnBook(Scanner sc) {
        System.out.print("Enter the title of the book to return: ");
        String title = sc.nextLine();

        List<String> lines = new ArrayList<>();
        boolean found = false;

        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
            String line;

            while ((line = br.readLine()) != null) {
                if (line.startsWith("Book Title: " + title + ",")) {
                    found = true;
                    continue; // skip this line
                }
                lines.add(line);
            }
            br.close();

            BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME));
            for (String l : lines) {
                bw.write(l);
                bw.newLine();
            }
            bw.close();

            System.out.println(found ? "Book returned successfully!" : "Book not found in the system.");
        } catch (IOException e) {
            System.out.println("Book not found in the system.");
        }
    }

    static void displayBooks() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
            String line;
            boolean hasContent = false;

            while ((line = br.readLine()) != null) {
                if (!hasContent) {
                    System.out.println("Book Lending Records:");
                    hasContent = true;
                }
                System.out.println(line);
            }
            br.close();

            if (!hasContent) {
                System.out.println("No records to display");
            }
        } catch (IOException e) {
            System.out.println("No records to display");
        }
    }
}
