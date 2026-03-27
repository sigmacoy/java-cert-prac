package fileHandling.CodeChum_csv;

import java.io.*;
import java.util.*;

/*

Weather Data Tracker

Create file
File name
weather_data.csv


Write to file
File name
weather_data.csv

*/

class WeatherData {
    String date;
    float temperature;
    float humidity;
    float precipitation;

    WeatherData(String date, float temperature, float humidity, float precipitation) {
        this.date = date;
        this.temperature = temperature;
        this.humidity = humidity;
        this.precipitation = precipitation;
    }
}

public class Main7 {
    static List<WeatherData> getWeatherData(int numDays) {
        List<WeatherData> data = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numDays; i++) {
            System.out.println("\nEnter data for day " + (i + 1) + ":");
            System.out.print("Date (YYYY-MM-DD): ");
            String date = sc.next();
            System.out.print("Temperature (C): ");
            float temperature = sc.nextFloat();
            System.out.print("Humidity (%): ");
            float humidity = sc.nextFloat();
            System.out.print("Precipitation (mm): ");
            float precipitation = sc.nextFloat();
            data.add(new WeatherData(date, temperature, humidity, precipitation));
        }
        return data;
    }

    static void writeWeatherData(String filename, List<WeatherData> data) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename), 1024);
        writer.write("Date,Temperature,Humidity,Precipitation\n");
        for (WeatherData day : data) {
            writer.write(String.format("%s,%.1f,%.1f,%.1f\n", 
                day.date, day.temperature, day.humidity, day.precipitation));
        }
        writer.close();
    }

    static void analyzeWeather(List<WeatherData> data) {
        float avgTemp = (float) data.stream().mapToDouble(d -> d.temperature).average().orElse(0);
        WeatherData maxTemp = data.stream().max(Comparator.comparing(d -> d.temperature)).orElse(null);
        WeatherData minTemp = data.stream().min(Comparator.comparing(d -> d.temperature)).orElse(null);
        float totalPrecip = (float) data.stream().mapToDouble(d -> d.precipitation).sum();

        System.out.println("\nWeather Data Summary:");
        System.out.printf("Average Temperature: %.2fC\n", avgTemp);
        System.out.printf("Highest Temperature: %.1fC on %s\n", maxTemp.temperature, maxTemp.date);
        System.out.printf("Lowest Temperature: %.1fC on %s\n", minTemp.temperature, minTemp.date);
        System.out.printf("Total Precipitation: %.2f mm\n", totalPrecip);
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many days of weather data do you want to enter? ");
        int numDays = sc.nextInt();

        List<WeatherData> weatherData = getWeatherData(numDays);

        String filename = "weather_data.csv";
        writeWeatherData(filename, weatherData);

        System.out.println("\nWeather data has been saved to " + filename);

        analyzeWeather(weatherData);
    }
}
