package fileHandling.CodeChum_Exercises;

import java.util.*;
import java.io.*;

// DIARY ENTRY

/* EXPECTED LOG

Create file
my_diary.txt

Write to file
my_diary.txt

Read file
my_diary.txt

*/

public class Main3 {
    public static void writeDiaryEntries(int n) {
        try (BufferedWriter w = new BufferedWriter(new FileWriter("my_diary.txt"))) {
            Scanner sc = new Scanner(System.in);
            
            for (int i = 1; i <= n; i++) {
                System.out.print("Enter date for entry " + i + ": ");
                String date = sc.nextLine();
                
                System.out.print("Enter diary entry for " + date + ": ");
                String entry = sc.nextLine();
                
                w.write(date + ": " + entry);
                w.newLine();
            }
            
            System.out.println("Diary entries saved successfully!");
        } catch (IOException e) {
            System.out.println("Error opening file for writing.");
        }
    }

    public static void readDiaryEntries() {
        System.out.println("\nYour diary entries:");
        
        try (BufferedReader r = new BufferedReader(new FileReader("my_diary.txt"))) {
            String line;
            while ((line = r.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("No diary entries found.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many diary entries do you want to make? ");
        int n = sc.nextInt();
        sc.nextLine();  // clear bufferr
        
        writeDiaryEntries(n);
        readDiaryEntries();
    }
}
