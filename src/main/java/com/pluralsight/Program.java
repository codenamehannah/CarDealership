package com.pluralsight;

public class Program  {
    public static void main(String[] args) {
        String filePath = "inventory.csv"; // Setting the path to the file
        DealershipFileManager fileManager = new DealershipFileManager(filePath);


        //Load dealership data from the inventory.csv file
        Dealership dealership = fileManager.loadDealershipData();

        if (dealership == null) {
            System.out.println("Failed to load dealership data. Exiting Program");
            return;
        }
        UserInterface userInterface = new UserInterface(dealership, fileManager);
        userInterface.display(); //Call the display method for user interaction
    }
}
