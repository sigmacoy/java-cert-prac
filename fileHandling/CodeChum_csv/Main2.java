package fileHandling.CodeChum_csv;


/* Movie Ratings Logger
Create
WRite

*/

import java.io.*;
import java.util.*;

public class Main2 {
    static class Movie {
        String title;
        float rating;
        int year;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many movies do you want to rate? ");
        int numMovies = sc.nextInt();
        sc.nextLine();

        Movie[] movies = new Movie[numMovies];

        for (int i = 0; i < numMovies; i++) {
            System.out.println("\nMovie " + (i + 1) + ":");
            movies[i] = new Movie();

            System.out.print("Enter movie title: ");
            movies[i].title = sc.nextLine();

            System.out.print("Enter your rating (0-10): ");
            movies[i].rating = sc.nextFloat();
            sc.nextLine();

            System.out.print("Enter release year: ");
            movies[i].year = sc.nextInt();
            sc.nextLine();
        }

        try (FileWriter file = new FileWriter("movie_ratings.csv")) {
            file.write("Title,Rating,Release Year\n");
            for (Movie movie : movies) {
                file.write(String.format("%s,%.1f,%d\n", 
                    movie.title, movie.rating, movie.year));
            }
            System.out.println("Movie ratings have been saved to movie_ratings.csv");
        } catch (IOException e) {
            System.out.println("Error creating file.");
        }
    }
}
