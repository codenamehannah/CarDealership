package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }
    public List<Vehicle> getVehiclesByPrice(double min, double max){
        List<Vehicle> vehiclesInPriceRange = new ArrayList<>();
        for(Vehicle vehicle : inventory) {
            if (vehicle.getPrice() >= min && vehicle.getPrice() <= max) {
                vehiclesInPriceRange.add(vehicle);
            }
        }
        return vehiclesInPriceRange;
        }
     public List<Vehicle> getVehiclesByMakeModel (String make, String model) {
        List <Vehicle> vehiclesByMakeModel = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getMake().equalsIgnoreCase(make) && vehicle.getModel().equalsIgnoreCase(model)) {
                vehiclesByMakeModel.add(vehicle);
            }
        }
        return vehiclesByMakeModel;
    }

    public List<Vehicle> getVehiclesByColor(String color) {
        List<Vehicle> vehiclesByColor = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getColor().equalsIgnoreCase(color)) {
                vehiclesByColor.add(vehicle);
            }
        }
        return vehiclesByColor;
    }
    public List<Vehicle> getVehiclesByMileage(int min, int max) {
        List<Vehicle> vehiclesInMileageRange = new ArrayList<>();
        for (Vehicle vehicle : inventory ) {
            if (vehicle.getOdometer() >= min && vehicle.getOdometer() <= max) {
                vehiclesInMileageRange.add(vehicle);
            }
        }
        return vehiclesInMileageRange;
    }

    public List<Vehicle> getVehiclesByType (String vehicleType) {
        List<Vehicle> vehiclesByType = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getVehicleType().equalsIgnoreCase(vehicleType)) {
                vehiclesByType.add(vehicle);
            }
        }
        return vehiclesByType;
    }
    public List<Vehicle> getAllVehicles() {
        return inventory; //Return a copy of the inventory list.
    }

    public void addVehicle (Vehicle vehicle) {
    inventory.add(vehicle);

    }
    public void removeVehicle(Vehicle vehicle) {
        inventory.remove(vehicle);
    }

}
