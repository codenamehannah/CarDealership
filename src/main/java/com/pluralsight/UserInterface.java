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
            System.out.println("99) Quit");

            String input = scanner.nextLine().trim();
            switch (input) {
                case "1";
                    processGetByPriceRequest();
                    break;
                case "2";
                    processGetMakeModelRequest();
                    break;
                case "3";
                    processGetYearRequest();
                    break;

            }




        }
    }

    private void processGetByPriceRequest() {
    }
}
