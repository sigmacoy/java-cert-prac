package fileHandling.CodeChum_csv;

import java.io.*;
import java.util.*;

/*

Culinary Budget Manager

Create
Write

recipes.csv
*/

public class Main10 {
    private static final int MAX_RECIPES = 100;
    // private static final int MAX_NAME_LENGTH = 50;

    static class Recipe {
        String name;
        float cost;
    }

    private static void addRecipe(Recipe[] recipes, int[] recipeCount, Scanner scanner) {
        if (recipeCount[0] >= MAX_RECIPES) {
            System.out.println("Maximum number of recipes reached.");
            return;
        }

        System.out.print("Enter recipe name: ");
        recipes[recipeCount[0]] = new Recipe();
        recipes[recipeCount[0]].name = scanner.nextLine();

        System.out.print("Enter recipe cost: ");
        while (!scanner.hasNextFloat()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // Clear invalid input
            System.out.print("Enter recipe cost: ");
        }
        recipes[recipeCount[0]].cost = scanner.nextFloat();
        scanner.nextLine(); // Consume newline

        recipeCount[0]++;
    }

    private static void saveRecipesToCsv(Recipe[] recipes, int recipeCount) {
        try (FileWriter file = new FileWriter("recipes.csv")) {
            file.write("Recipe Name,Cost\n");
            for (int i = 0; i < recipeCount; i++) {
                file.write(String.format("%s,%.2f\n", recipes[i].name, recipes[i].cost));
            }
        } catch (IOException e) {
            System.err.println("Error saving file: " + e.getMessage());
        }
    }

    private static void viewRecipes(Recipe[] recipes, int recipeCount) {
        if (recipeCount == 0) {
            System.out.println("No recipes added yet.");
            return;
        }

        System.out.println("\nCurrent Recipes:");
        System.out.printf("%-20s Cost%n", "Recipe Name");
        System.out.println("------------------------------");
        for (int i = 0; i < recipeCount; i++) {
            System.out.printf("%-20s $%.2f%n", recipes[i].name, recipes[i].cost);
        }
    }

    public static void main(String[] args) {
        Recipe[] recipes = new Recipe[MAX_RECIPES];
        int[] recipeCount = {0}; // Using array to simulate pass-by-reference
        Scanner scanner = new Scanner(System.in);
        String choice;

        while (true) {
            System.out.println("Simple Recipe Cost Calculator");
            System.out.println("1. Add a new recipe");
            System.out.println("2. View recipes");
            System.out.println("3. Save and exit");
            System.out.print("Enter your choice (1-3): ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addRecipe(recipes, recipeCount, scanner);
                    break;
                case "2":
                    viewRecipes(recipes, recipeCount[0]);
                    break;
                case "3":
                    saveRecipesToCsv(recipes, recipeCount[0]);
                    System.out.println("Recipes saved to recipes.csv. Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
