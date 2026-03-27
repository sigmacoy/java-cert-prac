package fileHandling.CodeChum_csv;

import java.io.*;
import java.util.*;

/* Student Grade Recorder

Create
Write

*/

public class Main3 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many students do you want to enter grades for? ");
        int n = sc.nextInt();
        sc.nextLine();
        
        BufferedWriter writer = new BufferedWriter(new FileWriter("student_grades.csv"), 1024);
        
        writer.write("Name,Math,Science,English,Average");
        writer.newLine();
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter data for student " + (i + 1) + ":");
            System.out.print("Student name: ");
            String name = sc.nextLine();
            
            System.out.print("Math grade: ");
            float mathGrade = sc.nextFloat();
            
            System.out.print("Science grade: ");
            float scienceGrade = sc.nextFloat();
            
            System.out.print("English grade: ");
            float englishGrade = sc.nextFloat();
            sc.nextLine(); // Consume newline
            
            float average = (mathGrade + scienceGrade + englishGrade) / 3;
            
            writer.write(String.format("%s,%.1f,%.1f,%.1f,%.2f", 
                         name, mathGrade, scienceGrade, englishGrade, average));
            writer.newLine();
        }
        
        writer.close();
        sc.close();
        
        System.out.println("\nGrades have been recorded in student_grades.csv");
    }
}
