package com.pluralsight;

import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone, ArrayList<Vehicle> inventory) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = inventory;
    }
    public List<Vehicle> getVehiclesByPrice(double min, double max){
        List<Vehicle> vehiclesInPriceRange = new ArrayList<>();
        for(Vehicle vehicle : inventory) {
            if (vehicle.getprice() >= min && vehicle.getPrice() <= max) {
                vehiclesInPriceRange.add(vehicle);
            }
        }
        return vehiclesInPriceRange;
        }
       
    }
}
