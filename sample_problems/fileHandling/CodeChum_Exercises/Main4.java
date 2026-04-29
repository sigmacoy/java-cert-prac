package sample_problems.fileHandling.CodeChum_Exercises;
import java.util.*;
import java.io.*;

/*
Unique Color Collector
*/

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> uniqueColors = new LinkedHashSet<>();
        System.out.print("Enter the number of colors: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++){
            System.out.print("Enter color " + i + ": ");
            String color = sc.nextLine();
            
            if (uniqueColors.add(color)){
                System.out.println("Color " + color + " added successfully!");
            } else {
                System.out.println("Color " + color + " already exists. Not added.");
            }
        }
        
        try (FileWriter writer = new FileWriter("favorite_colors.txt")){
            for (String color : uniqueColors){
                writer.write(color + System.lineSeparator());
            }
        } catch (IOException e){
            
        }
        
        System.out.println("All unique colors have been saved to favorite_colors.txt");
        sc.close();
    }
}
