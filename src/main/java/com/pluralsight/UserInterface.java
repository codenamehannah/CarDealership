package com.pluralsight;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;
    public UserInterface() {

    }
    public void display() {
        Scanner scanner = new Scanner(System.in);
        init();

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
            scanner.close(); //close scanner when done



        }

    private void processRemoveVehicleRequest() {
    }

    private void processAddVehicleRequest() {
        
    }

    private void processGetByAllVehiclesRequest() {
        
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

}

    private void processGetByPriceRequest() {
    }
}
