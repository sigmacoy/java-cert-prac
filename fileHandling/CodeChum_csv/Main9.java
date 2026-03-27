package fileHandling.CodeChum_csv;

import java.io.*;
import java.util.*;

/*
CSV Data Analysis - Sales Performance

Create
Write
Read

sales_data.csv
*/

class Entry {
    String name;
    float totalSales;
    int count;

    Entry(String name, float sales) {
        this.name = name;
        this.totalSales = sales;
        this.count = 1;
    }
}

public class Main9 {
    static List<Entry> products = new ArrayList<>();
    static List<Entry> salespeople = new ArrayList<>();

    static void createCSV(String filename) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
        bw.write("Date,Product,Salesperson,Amount\n");
        bw.write("2024-05-01,Laptop,Emma,1200.00\n");
        bw.write("2024-05-01,Desktop,Liam,980.00\n");
        bw.write("2024-05-02,Tablet,Olivia,600.00\n");
        bw.write("2024-05-03,Laptop,Emma,1300.00\n");
        bw.write("2024-05-04,Tablet,Noah,550.00\n");
        bw.write("2024-05-04,Desktop,Olivia,970.00\n");
        bw.write("2024-05-05,Laptop,Emma,1150.00\n");
        bw.write("2024-05-06,Desktop,Liam,1010.00\n");
        bw.write("2024-05-06,Tablet,Noah,580.00\n");
        bw.write("2024-05-07,Laptop,Emma,1180.00\n");
        bw.close();
    }

    static void addOrUpdate(List<Entry> list, String name, float amount) {
        for (Entry e : list)
            if (e.name.equals(name)) {
                e.totalSales += amount;
                e.count++;
                return;
            }
        list.add(new Entry(name, amount));
    }

    static void analyzeCSV(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line = br.readLine(); // skip header
        float total = 0;
        int entries = 0;

        while ((line = br.readLine()) != null) {
            String[] parts = line.split(",");
            String product = parts[1], person = parts[2];
            float amount = Float.parseFloat(parts[3]);

            total += amount;
            entries++;

            addOrUpdate(products, product, amount);
            addOrUpdate(salespeople, person, amount);
        }
        br.close();

        String topProduct = "", topPerson = "";
        float maxProduct = 0, maxPerson = 0;

        for (Entry p : products)
            if (p.totalSales > maxProduct) {
                topProduct = p.name;
                maxProduct = p.totalSales;
            }

        for (Entry s : salespeople)
            if (s.totalSales > maxPerson) {
                topPerson = s.name;
                maxPerson = s.totalSales;
            }

        System.out.printf("Total sales amount: $%.2f\n", total);
        System.out.println("Top-selling product: " + topProduct);
        System.out.println("Top-performing salesperson: " + topPerson);
        System.out.printf("Average sale amount: $%.2f\n", (entries > 0 ? total / entries : 0));
        System.out.println("Number of sales by product:");
        for (Entry p : products)
            System.out.println(p.name + ": " + p.count);
    }

    public static void main(String[] args) throws IOException {
        String filename = "sales_data.csv";
        createCSV(filename);
        analyzeCSV(filename);
    }
}
