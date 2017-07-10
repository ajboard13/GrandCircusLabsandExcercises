package Labs.Lab9;

import Labs.InputValidator;

import java.util.ArrayList;
import java.util.Scanner;

/*
Aaron Board

7/7/2017
 */
class CarApp {

    private ArrayList<Car> carList;
    private Scanner input = new Scanner(System.in);
    private InputValidator inputValidator = new InputValidator();
    private int listSize;
    private int startingIndex;


    void runCarApp() {
        do {
            findStartingIndex();
            populateCarList();
            System.out.println("ALL CARS:");
            printStudentResults();
            inputValidator.checkForUserContinue("\nWould you like to run another list of cars? (y/n)");
        } while (inputValidator.isUserCont());
    }

    private void askForNumberOfCars() {
        System.out.println("Enter number of cars: ");
        listSize = inputValidator.getValidPositiveInt();
        carList = new ArrayList<>(listSize);
    }

    private void askHowManyCarsToAdd() {
        System.out.println("How many cars do you wish to add: ");
        listSize += inputValidator.getValidPositiveInt();
    }

    private void findStartingIndex() {
        if (listSize != 0) {
            if (checkIfUserWantsToKeepList()) {
                if (checkIfUserWantsToAppendToList()) {
                    startingIndex = carList.size();
                    askHowManyCarsToAdd();
                }
                startingIndex = carList.size();
            } else {
                askForNumberOfCars();
            }
        } else {
            askForNumberOfCars();
        }
    }

    private void populateCarList() {
        for (int i = startingIndex; i < listSize; i++) {
            System.out.printf("\nCar %d make: ", (i + 1));
            String make = inputValidator.getNonEmptyString("Please enter a valid car make: ");
            System.out.printf("Car %d model: ", (i + 1));
            String model = inputValidator.getNonEmptyString("please enter a valid car model: ");
            System.out.printf("Car %d year: ", (i + 1));
            int year = inputValidator.getValidPositiveInt();
            System.out.printf("Car %d price: ", (i + 1));
            double price = inputValidator.getValidDouble("Please enter a valid price: ");
            carList.add(new Car(make,model,year,price));
        }
    }

    private boolean checkIfUserWantsToAppendToList() {
        System.out.println("Would you like to add more cars to the original list? (y/n) ");
        return inputValidator.checkForValidChoice(input.nextLine(), "y", "n");
    }

    private void printStudentResults() {
        System.out.println();
        for (Car car : carList) {
            System.out.println(car.toString());
        }
    }

    private boolean checkIfUserWantsToKeepList() {
        System.out.println("Would you like to keep the same list? (y/n)");
        return inputValidator.checkForValidChoice(input.nextLine(), "y", "n");
    }

}
