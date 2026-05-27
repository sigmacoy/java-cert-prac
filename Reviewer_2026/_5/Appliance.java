package Reviewer_2026._5;

public class Appliance {
    private String brand;
    private double powerUsage;
    private boolean isOn;

    public Appliance(String b, double p, boolean i){
        brand = b;
        powerUsage = p;
        isOn = i;
    }

    public String getBrand(){
        return brand;
    }
    public double getPowerUsage(){
        return powerUsage;
    }
    public boolean getIsOn(){
        return isOn;
    }

    public void setBrand(String b){
        brand = b;
    }
    public void setPowerUsage(double p){
        powerUsage = p;
    }
    public void togglePower(){
        isOn = true;
    }

    public void printInfo(){
        System.out.println("Appliance " + brand + " uses " + Double.toString(powerUsage) + " watts and is currently " + (isOn == true ? "on" : "off") + ".");
    }
}

class WashingMachine extends Appliance {
    private int washCycles;
    public WashingMachine(String b, double p){
        super(b, p, false);
        washCycles = 0;
    }

    public void startWashCycle(){
        togglePower();
        washCycles++;
    }

    public int getWashCycles(){
        return washCycles;
    }



    public void printInfo(){
        System.out.println("WashingMachine " + getBrand() + " has completed " + Integer.toString(washCycles) + " wash cycles.");
    }

}
