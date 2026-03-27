package fileHandling.CodeChum_csv;

/*
Pivot Operation on Sales Data

Create file
File name
sales_data.csv

Write to file
File name
sales_data.csv

Read file
File name
sales_data.csv

Create file
File name
pivoted_sales_data.csv

Write to file
File name
pivoted_sales_data.csv

*/

import java.io.*;
import java.util.*;

class ProductSales {
    String name;
    Map<String, Integer> regionSales = new HashMap<>();

    ProductSales(String name, List<String> regions) {
        this.name = name;
        for (String r : regions) regionSales.put(r, 0);
    }
}

public class Main8 {
    static final List<String> regions = List.of("Central", "East", "North", "South", "West");
    static final List<ProductSales> products = new ArrayList<>();

    static void createInputCSV(String filename) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            bw.write("Date,Product,Region,Sales\n");
            bw.write("2023-01-01,Apple,North,10000\n");
            bw.write("2023-01-02,Banana,South,20000\n");
            bw.write("2023-01-03,Cherry,East,30000\n");
            bw.write("2023-01-04,Apple,West,40000\n");
            bw.write("2023-01-05,Banana,Central,50000\n");
        }
        System.out.println("Input CSV file '" + filename + "' created.");
    }

    static int findOrAddProduct(String name) {
        for (int i = 0; i < products.size(); i++)
            if (products.get(i).name.equals(name))
                return i;
        products.add(new ProductSales(name, regions));
        return products.size() - 1;
    }

    static void parseCSV(String filename) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            br.readLine(); // skip header
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String product = parts[1];
                String region = parts[2];
                int sales = Integer.parseInt(parts[3]);

                int idx = findOrAddProduct(product);
                products.get(idx).regionSales.put(region,
                    products.get(idx).regionSales.get(region) + sales);
            }
        }
    }

    static void writeOutputCSV(String filename) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            bw.write("Product," + String.join(",", regions) + "\n");
            for (ProductSales p : products) {
                bw.write(p.name);
                for (String region : regions)
                    bw.write("," + p.regionSales.get(region));
                bw.write("\n");
            }
        }
        System.out.println("Pivoted sales data has been written to '" + filename + "'.");
    }

    public static void main(String[] args) throws IOException {
        String input = "sales_data.csv", output = "pivoted_sales_data.csv";
        createInputCSV(input);
        parseCSV(input);
        writeOutputCSV(output);
    }
}
