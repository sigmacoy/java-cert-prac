package sample_problems.string_tokenization;

import java.util.Scanner;

public class parse_date {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter date (DD/MM/YYYY): ");
        String date = scanner.nextLine();

        String[] parts = date.split("/");

        if (parts.length == 3) {
            System.out.println("Day: " + parts[0]);
            System.out.println("Month: " + parts[1]);
            System.out.println("Year: " + parts[2]);
        } else {
            System.out.println("Invalid date format!");
        }

        scanner.close();
    }
}
