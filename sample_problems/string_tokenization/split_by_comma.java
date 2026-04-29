package sample_problems.string_tokenization;

import java.util.Scanner;

public class split_by_comma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter comma-separated fruits: ");
        String input = scanner.nextLine();

        String[] tokens = input.split(",");

        System.out.println("Fruits:");
        for (String token : tokens) {
            System.out.println(token.trim());
        }

        scanner.close();
    }
}
