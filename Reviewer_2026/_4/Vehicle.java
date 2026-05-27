package Reviewer_2026._4;

public class Vehicle {
    private String make;
    private String model;

    public Vehicle(String m, String mz){
        make = m;
        model = mz;
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }
}

class Driver {
    private String name;
    private int age;

    public Driver(String n, int a){
        name = n;
        age = a;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}



class DrivingLicense {
    private Vehicle vehicle;
    private Driver driver;

    public DrivingLicense(){
        vehicle = null;
        driver = null;
        System.out.println("No vehicle or driver assigned.");
    }

    public DrivingLicense(Vehicle v, Driver d){
        vehicle = v;
        driver = d;
    }

    public Vehicle getVehicle(){
        return vehicle;
    }

    public Driver getDriver(){
        return driver;
    }
}
