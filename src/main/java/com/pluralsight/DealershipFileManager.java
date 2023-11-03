package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DealershipFileManager {
    private String filePath; // Set the path to your data file

    public DealershipFileManager(String filePath) {
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
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
