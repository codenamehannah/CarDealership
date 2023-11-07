package com.pluralsight;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;
    public UserInterface(Dealership dealership, DealershipFileManager fileManager) {

    }
    public void display() {
        Scanner scanner = new Scanner(System.in);


        boolean running = true;
        while (running) {
            System.out.println("Welcome to Main Menu. \nChoose from these options: ");
            System.out.println("1) Find vehicles within a price range");
            System.out.println("2) Find vehicles by make/model");
            System.out.println("3 Find vehicles by year range");
            System.out.println("4) Find vehicles by color");
            System.out.println("5) Find vehicles by mileage range");
            System.out.println("6) Find vehicles by type(car, truck, SUV, van");
            System.out.println("7) List All vehicles");
            System.out.println("8) Add a vheicle");
            System.out.println("9) Remove a vehicle");
            System.out.println("Q) Quit");

            String input = scanner.nextLine().trim();
            switch (input) {
                case "1":
                    processGetByPriceRequest();
                    break;
                case "2":
                    processGetMakeModelRequest();
                    break;
                case "3":
                    processGetYearRequest();
                    break;
                case "4":
                    processGetByColorRequest();
                    break;
                case "5":
                  processGetByMileageRequest();
                  break;
                case "6":
                  processGetByVehicleTypeRequest();
                  break;
                case "7":
                  processGetByAllVehiclesRequest();
                  break;
                case "8":
                  processAddVehicleRequest();
                  break;
                case "9":
                  processRemoveVehicleRequest();
                  break;
                case "Q":
                    running = false; // Exit loop and quit the program
                    break;
                default:
                    System.out.println("Invalid option. Please select a valid option.");
            }

            }
            scanner.close(); //close the scanner



        }


    private void helperDisplayVehicles(List<Vehicle> listOfVehicles){
        for(Vehicle vehicle : listOfVehicles) {
            System.out.println(vehicle);
        }

    private void init() {
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        dealership = dealershipFileManager.getDealership();

    }

    private void processRemoveVehicleRequest() {
    }

    private void processAddVehicleRequest() {
        
    }

    private void processGetByAllVehiclesRequest() {
            helperDisplayVehicles(dealership.getAllVehicles());
            }
        
    }

    private void processGetByVehicleTypeRequest() {
        
    }

    private void processGetByMileageRequest() {
        
    }

    private void processGetByColorRequest() {
        
    }

    private void processGetYearRequest() {
        
    }

    private void processGetMakeModelRequest() {
        
    }


    private void processGetByPriceRequest() {
    }
}
