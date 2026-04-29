package sample_problems.string_tokenization;

import java.util.Scanner;

public class split_multiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string with spaces, commas, or periods: ");
        String input = scanner.nextLine();

        String[] tokens = input.split("[ ,.]+");

        System.out.println("Tokens:");
        for (String token : tokens) {
            System.out.println(token);
        }

        scanner.close();
    }
}
