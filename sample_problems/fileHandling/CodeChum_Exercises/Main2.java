package sample_problems.fileHandling.CodeChum_Exercises;

import java.util.*;
import java.io.*;

public class Main2 {
    public static void main(String[] args) {
        // True or False
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of questions: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear bufferr

        try (FileWriter w = new FileWriter("quiz.txt")) {
            for (int i = 1; i <= n; i++) {
                System.out.print("Enter question " + i + ": ");
                String question = sc.nextLine();

                System.out.print("Enter the correct answer for question " + i + " (True/False): ");
                char answer = Character.toUpperCase(sc.next().charAt(0));
                sc.nextLine(); // clear bufferr

                if (answer != 'T' && answer != 'F') {
                    System.out.println("Invalid answer. Please enter 'T' for True or 'F' for False.");
                    i--;
                    continue;
                }

                w.write("Q" + i + ": " + question + "\n");
                w.write("Answer: " + answer + "\n\n");
            }
        } catch (IOException e) {
            System.out.println("Error opening file: " + e.getMessage());
        }

        System.out.println("Quiz has been saved to quiz.txt");
    }
}
