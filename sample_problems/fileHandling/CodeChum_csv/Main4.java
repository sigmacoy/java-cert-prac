package sample_problems.fileHandling.CodeChum_csv;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/* Employee Work Log
Create
Write
*/

class Employee {
    int id;
    String name;
    int daysWorked;
    float[] hoursPerDay;
    float totalHours;
    float avgDailyHours;
}

public class Main4 {
    static Scanner sc = new Scanner(System.in);

    static int getIntegerInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                int value = sc.nextInt();
                sc.nextLine(); // consume newline
                return value;
            }
            sc.nextLine(); // clear invalid input
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }

    static float getFloatInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextFloat()) {
                float value = sc.nextFloat();
                sc.nextLine(); // consume newline
                return value;
            }
            sc.nextLine(); // clear invalid input
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }

    static String getStringInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = sc.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.println("Input cannot be empty. Please try again.");
        }
    }

    public static void main(String[] args) {
        final int MAX_EMPLOYEES = 100;
        final int MAX_DAYS = 31;

        System.out.print("Enter the number of employees to log: ");
        int n = getIntegerInput("");

        if (n <= 0 || n > MAX_EMPLOYEES) {
            System.out.printf("Invalid number of employees. Please enter a value between 1 and %d.%n", MAX_EMPLOYEES);
            return;
        }

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("%nEnter data for employee %d:%n", i + 1);
            employees[i] = new Employee();

            employees[i].id = getIntegerInput("Enter Employee ID: ");
            employees[i].name = getStringInput("Enter Name: ");
            employees[i].daysWorked = getIntegerInput("Enter Number of Work Days: ");

            if (employees[i].daysWorked <= 0 || employees[i].daysWorked > MAX_DAYS) {
                System.out.printf("Invalid number of work days. Please enter a value between 1 and %d.%n", MAX_DAYS);
                i--;
                continue;
            }

            employees[i].hoursPerDay = new float[employees[i].daysWorked];
            employees[i].totalHours = 0;

            for (int j = 0; j < employees[i].daysWorked; j++) {
                employees[i].hoursPerDay[j] = getFloatInput(String.format("Enter Hours Worked for day %d: ", j + 1));
                employees[i].totalHours += employees[i].hoursPerDay[j];
            }

            employees[i].avgDailyHours = employees[i].totalHours / employees[i].daysWorked;
        }

        try (FileWriter file = new FileWriter("work_log.csv")) {
            file.write("Employee ID,Employee Name,Total Hours Worked,Average Daily Hours\n");

            for (Employee emp : employees) {
                file.write(String.format("%d,%s,%.1f,%.1f%n", 
                    emp.id, emp.name, emp.totalHours, emp.avgDailyHours));
            }
            System.out.println("\nCSV file created successfully!");
        } catch (IOException e) {
            System.out.println("Error creating CSV file: " + e.getMessage());
        }
    }
}
