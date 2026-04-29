package sample_problems.fileHandling.CodeChum_csv;
/*
CSV Temperature Converter

Create file
File name
temperatures.csv


Write to file
File name
temperatures.csv


Read file
File name
temperatures.csv

*/

import java.io.*;
import java.util.*;

public class Main6 {
    public static void createCSV() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("temperatures.csv"));
        writer.write("City,Temperature (in Celsius)\n");
        writer.write("Manila,30.5\n");
        writer.write("Baguio,18.2\n");
        writer.write("Cebu,29.0\n");
        writer.write("Davao,31.4\n");
        writer.write("Tagaytay,22.6\n");
        writer.write("Iloilo,28.0\n");
        writer.close();
    }

    public static float celsiusToFahrenheit(float celsius) {
        return celsius * 9f / 5f + 32f;
    }

    public static void readAndConvertCSV(int startRow, int maxRows) throws IOException {
        File file = new File("temperatures.csv");
        if (!file.exists()) {
            System.out.println("Error: File not found.");
            return;
        }

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        int row = 0, processed = 0;

        while ((line = reader.readLine()) != null) {
            row++;
            if (row == 1) continue;
            if (row - 1 < startRow) continue;
            if (maxRows > 0 && processed >= maxRows) break;

            String[] parts = line.split(",");
            String city = parts[0];
            float celsius = Float.parseFloat(parts[1]);
            float fahrenheit = celsiusToFahrenheit(celsius);
            System.out.printf("%s: %.1fF%n", city, fahrenheit);
            processed++;
        }

        reader.close();
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        createCSV();

        System.out.print("Enter starting row (1 = first data row): ");
        int startRow = sc.nextInt();

        System.out.print("Enter max rows to process (0 = all rows): ");
        int maxRows = sc.nextInt();

        System.out.println("\nConverted Temperatures:");
        readAndConvertCSV(startRow, maxRows);
    }
}
