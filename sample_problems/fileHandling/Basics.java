package sample_problems.fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {

        System.out.println("\n\n");

        // 1. Read File Line by Line
        try (BufferedReader br = new BufferedReader(new FileReader("fileHandling/given.txt") ) ) {
            String line = "";
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Unable to read file");
        }

    
        System.out.println("\n\n");

        // 2. Store File Lines in Variable
        // Write a Java program to read a file line by line and store it in a variable.

        // StringBuilder sb = new StringBuilder();
        String strLine = "";
        String str_data = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("fileHandling/given.txt"));
            while (strLine != null){
                str_data += strLine;
                str_data += "\n";
                strLine = br.readLine();
            }
            System.out.println(str_data);
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
        
        System.out.println("\n\n");

        // 3. Store File Lines in Array
        // Write a Java program to store text file content line by line in an array.

        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<String>();
        strLine = null;

        try (BufferedReader br = new BufferedReader(new FileReader("fileHandling/given.txt"))) {
            while ((strLine = br.readLine()) != null) {
                sb.append(strLine).append(System.lineSeparator());
                list.add(strLine);
            }
            System.out.println("List contents: ");
            for (String item : list) {
                System.out.println(item);
            }

            System.out.println("");
            System.out.println("Full text:\n" + sb.toString());
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }


        // 4. Find Longest Word in File
        String longest_word = "";
        String current;

        Scanner sc;
        try {
            sc = new Scanner(new File("fileHandling/given.txt"));
            while (sc.hasNext()) {
                current = sc.next();
                if (current.length() > longest_word.length()) {
                    longest_word = current;
                }
            }
            System.out.println("\n"+ "THE LONGEST WORD IS: " + longest_word);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // FILE WRITE 
        // 5. Using FileWriter
        try (FileWriter w = new FileWriter("fileHandling/output.txt")) {
            w.write("PASSWORD");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        // Using BufferedWriter
        try (BufferedWriter w = new BufferedWriter(new FileWriter("fileHandling/output.txt"))) {
            w.write("PASSWORD");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
        
            




    }
}
