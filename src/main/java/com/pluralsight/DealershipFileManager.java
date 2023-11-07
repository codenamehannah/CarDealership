package com.pluralsight;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DealershipFileManager {
    private final String filePath; // Set the path to your data file

    public DealershipFileManager(String filePath) throws IOException {
        this.filePath = filePath;
    }

    public Dealership loadDealershipData() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            // Read the first line for dealership information
            String[] dealershipInfo = reader.readLine().split("\\|");
            String name = dealershipInfo[0];
            String address = dealershipInfo[1];
            String phone = dealershipInfo[2];

            Dealership dealership = new Dealership(name, address, phone);

            // Read and ad vehicle information
            while ((line = reader.readLine()) != null) {
                String[] vehicleInfo = line.split("\\|");
                int vin = Integer.parseInt(vehicleInfo[0]);
                int year = Integer.parseInt(vehicleInfo[1]);
                String make = vehicleInfo[2];
                String model = vehicleInfo[3];
                String vehicleType = vehicleInfo[4];
                String color = vehicleInfo[5];
                int odometer = Integer.parseInt(vehicleInfo[6]);
                double price = Double.parseDouble(vehicleInfo[7]);

                Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
                dealership.addVehicle(vehicle);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
    public void saveDealership(Dealership dealership) throws IOException {
        String name = dealership.getName();
        String address = dealership.getAddress();
        String phone = dealership.getPhone();
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
        writer.write(name + "|" + address + "|" + phone);
        writer.newLine();
    }

    private Object dealership;
    // VEHICLES
    ArrayList<Vehicle> vehicles = dealership.getInventory();
    List<Vehicle> vehicles = dealership.getAllVehicles();

                for (Vehicle v : vehicles) {
        int vin = v.getVin();
        int year = v.getYear();
        String make = v.getMake();
        String model = v.getModel();
        String vehicleType = v.getVehicleType();
        String color = v.getColor();
        int odometer = v.getOdometer();
        double price = v.getPrice();
        BufferedWriter writer;
        writer = null;
        writer.write(vin + "|" + year + "|" + make + "|" + model + "|" +
                vehicleType + "|" + color + "|" + odometer + "|" + price);
        writer.newLine();
    }

    public Dealership getDealership() {
        return null;
    }
        writer.close();
        }

}
