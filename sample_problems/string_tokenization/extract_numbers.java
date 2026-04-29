package sample_problems.string_tokenization;

import java.util.Scanner;

public class extract_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text with numbers: ");
        String input = scanner.nextLine();

        String[] tokens = input.split("\\D+");

        int sum = 0;
        for (String token : tokens) {
            if (!token.isEmpty()) {
                sum += Integer.parseInt(token);
            }
        }

        System.out.println("Sum of numbers: " + sum);
        scanner.close();
    }
}
