package Reviewer_2026._2;

public class House {
    private String location;
    private double price;
    private int bedrooms;

    public House(String l, double p, int b){
        location = l; price = p; bedrooms = b;
    }

    public String getLocation(){
        return location;
    }

    public double getPrice(){
        return price;
    }

    public int getBedrooms(){
        return bedrooms;
    }

    public void setLocation(String l){
        location = l;
    }
    public void setPrice(double p){
        price = p;


    }
    public void setBedrooms(int b){
        bedrooms = b;
    }

    public String toString(){
        return "House in " + location + " - P" + String.format("%.2f", price) + " - " + Integer.toString(bedrooms) + " bedrooms";
    }
}
