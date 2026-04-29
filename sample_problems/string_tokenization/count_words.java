package sample_problems.string_tokenization;

import java.util.Scanner;

public class count_words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.trim().split("\\s+");

        System.out.println("Number of words: " + words.length);

        scanner.close();
    }
}
