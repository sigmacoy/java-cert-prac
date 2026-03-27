package fileHandling.CodeChum_Exercises;

import java.io.*;
import java.util.*;

/* RECIPE CONVERTER


Create file
File name recipe.txt

Write to file
File name recipe.txt

Read file
File name recipe.txt

Create file
File name recipe_scaled.txt

Write to file
File name recipe_scaled.txt

*/

class Ingredient {
    private String name;
    private float quantity;

    public Ingredient(String n, float q) {
        name = n;
        quantity = q;
    }

    public String getName() {
        return name;
    }

    public float getQuantity() {
        return quantity;
    }
}

public class Main6 {
    private static final int MAX_INGREDIENTS = 50;

    public static void createSampleRecipe(String filename) {
        try (PrintWriter file = new PrintWriter(new FileWriter(filename))) {
            file.println("Flour,2");
            file.println("Sugar,1");
            file.println("Eggs,3");
            file.println("Milk,1.5");
            System.out.println("Sample recipe created in " + filename);
        } catch (IOException e) {
            System.out.println("Error creating sample recipe file.");
        }
    }

    public static List<Ingredient> readRecipe(String filename) {
        List<Ingredient> ingredients = new ArrayList<>();
        try (BufferedReader file = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = file.readLine()) != null && ingredients.size() < MAX_INGREDIENTS) {
                String[] parts = line.split(",");
                if (parts.length != 2) continue;
                ingredients.add(new Ingredient(parts[0], Float.parseFloat(parts[1])));
            }
        } catch (IOException e) {
            System.out.println("Error: File '" + filename + "' not found.");
            return null;
        }
        return ingredients;
    }

    public static boolean writeScaledRecipe(String filename, float factor, List<Ingredient> ingredients) {
        try (PrintWriter file = new PrintWriter(new FileWriter(filename))) {
            for (Ingredient ing : ingredients) {
                float scaledQuantity = ing.getQuantity() * factor;
                file.printf("%s,%.2f%n", ing.getName(), scaledQuantity);
            }
            return true;
        } catch (IOException e) {
            System.out.println("Error: Could not create scaled recipe file.");
            return false;
        }
    }

    public static boolean isNumber(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        int dotCount = 0;
        int start = (str.charAt(0) == '-') ? 1 : 0;
        
        for (int i = start; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '.') {
                if (dotCount > 0) return false;
                dotCount++;
            } else if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String inputFilename = "recipe.txt";
        String outputFilename = "recipe_scaled.txt";

        createSampleRecipe(inputFilename);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the recipe file: ");
        String userFilename = sc.nextLine().trim();

        if (userFilename.isEmpty()) {
            userFilename = inputFilename;
        }

        System.out.print("Enter the scaling factor: ");
        String factorStr = sc.nextLine().trim();

        if (!isNumber(factorStr)) {
            System.out.println("Error: Invalid scaling factor. Please enter a number.");
            return;
        }

        float factor = Float.parseFloat(factorStr);
        if (factor <= 0) {
            System.out.println("Error: Scaling factor must be positive.");
            return;
        }

        List<Ingredient> ingredients = readRecipe(userFilename);
        if (ingredients == null) {
            return;
        }

        if (writeScaledRecipe(outputFilename, factor, ingredients)) {
            System.out.println("Scaled recipe saved to " + outputFilename);
        } else {
            System.out.println("Error saving scaled recipe.");
        }
        
        sc.close();
    }
}
