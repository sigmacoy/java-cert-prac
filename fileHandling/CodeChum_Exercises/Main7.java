package fileHandling.CodeChum_Exercises;

import java.util.*;
import java.io.*;

/* The Great Sibling Showdown

Create file
File name siblings.txt

Write to file
File name siblings.txt

Create file
File name  eldest.txt

Write to file
File name eldest.txt

*/


class Sibling {
    String name;
    int age;

    Sibling(String n, int a) {
        name = n;
        age = a;
    }
}

public class Main7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Enter the number of siblings: ");
        n = sc.nextInt();
        sc.nextLine(); 

        if (n <= 0) {
            System.out.println("No siblings to record.");
            return;
        }

        Sibling[] siblings = new Sibling[n];

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter sibling " + i + " details:");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine(); 
            siblings[i - 1] = new Sibling(name, age);
        }

        try (PrintWriter siblingsFile = new PrintWriter(new FileWriter("siblings.txt"))) {
            for (Sibling sibling : siblings) {
                siblingsFile.println(sibling.name + ", Age: " + sibling.age);
            }
        } catch (IOException e) {
            System.err.println("Error opening file siblings.txt: " + e.getMessage());
            return;
        } 

        Sibling eldest = siblings[0];
        for (Sibling sibling : siblings) {
            if (sibling.age > eldest.age) {
                eldest = sibling;
            }
        }

        try (PrintWriter eldestFile = new PrintWriter(new FileWriter("eldest.txt"))) {
            eldestFile.println(eldest.name);
        } catch (IOException e) {
            System.err.println("Error opening file eldest.txt: " + e.getMessage());
            return;
        }


        System.out.println("\nList of Siblings:");
        for (int i = 1; i <= n; i++) {
            System.out.println(i + ". " + siblings[i - 1].name + ", Age: " + siblings[i - 1].age);
        }
        System.out.println("The eldest sibling is " + eldest.name + ".");
    }
}
