package sample_problems.fileHandling.CodeChum_Exercises;

// import static java.lang.System.out;
import java.util.*;
import java.io.*;

public class Main1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of reservations: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear bufferr

        String str_data = "";

        for(int i = 1; i <= n; i++){
            System.out.println("Enter reservation " + i + " details:");
            System.out.print("Name: ");
            String name = sc.nextLine();
            
            str_data += "Name: " + name + "\n";

            System.out.print("Number of guests: ");
            int numGuest = sc.nextInt();
            sc.nextLine(); // clear bufferr
            
            str_data += "Number of guests: " + numGuest + "\n";

            
            System.out.print("Room type (Standard, Premium, Deluxe): ");
            String type = sc.nextLine();

            str_data += "Room type: " + type + "\n\n";
        }
        
        try (FileWriter w = new FileWriter("reservations.txt")){
            w.write(str_data);
        } catch(IOException e){
            System.out.println("");
        }
    }
}




