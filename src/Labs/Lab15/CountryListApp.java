package Labs.Lab15;

import Labs.InputValidator;

import java.util.ArrayList;

/*
Aaron Board

7/11/2017
 */
class CountryListApp {
    private static ArrayList<String> startingCountries = new ArrayList<>();
    private static InputValidator inputValidator = new InputValidator();
    private static CountriesBinaryFile countriesBinaryFile = new CountriesBinaryFile();
    private static CountriesTextFile countriesTextFile = new CountriesTextFile();
    private static boolean isText= false;
    private static boolean userCont = true;

    static void runCountryListApp(){
        System.out.println("Welcome to the Countries Maintenance Application");
        initializeCountries();
        checkHowUserWantsToStoreCountries();
        if (!isText){
            runBinaryApp();
        } else {
            runTextApp();
        }

        System.out.println("Goodbye!");
    }

    private static void runBinaryApp() {
        do {
            int userSelect = getUserSelection();
            checkTheUserSelection(userSelect);
        }while (userCont);
    }

    private static void runTextApp() {

        do {
            int userSelect = getUserSelection();
            checkTheUserSelectionText(userSelect);
        }while (userCont);
    }


    private static void checkHowUserWantsToStoreCountries() {
        System.out.println("Would you like to store countries using text or binary? (t/b)");
        isText = inputValidator.checkForValidChoice(inputValidator.checkForValidChoice("t", "b"), "t", "b");
    }

    private static void initializeCountries() {
        startingCountries.add("USA");
        startingCountries.add("Russia");
        startingCountries.add("China");
        countriesBinaryFile.initializeBinaryCountries(startingCountries);
        countriesTextFile.writeCountriesToFile(startingCountries);
    }


    private static void checkTheUserSelection(int userSelect) {
        switch (userSelect){
            case 1:
                countriesBinaryFile.readBinaryCounties();
                break;
            case 2:
                addCountryToList();
                break;
            case 3:
                deleteCountry();
                break;
            case 4:
                userCont = false;
                break;
            default:
                break;
        }
    }
    private static void checkTheUserSelectionText(int userSelect) {
        switch (userSelect){
            case 1:
                countriesTextFile.readCountries();
                break;
            case 2:
                addCountryToListText();
                break;
            case 3:
                deleteCountryText();
                break;
            case 4:
                userCont = false;
                break;
            default:
                break;
        }
    }

    private static void deleteCountryText() {
        System.out.println("Pick a country to delete:");
        int countryToDeleteIndex;
        for (int i = 0; i < startingCountries.size(); i++) {
            System.out.println((i+1) + " for " + startingCountries.get(i));
        }
        countryToDeleteIndex = (inputValidator.getValidIntBetweenTwoNumbers(1, startingCountries.size())-1);
        startingCountries.remove(countryToDeleteIndex);
        countriesTextFile.writeCountriesToFile(startingCountries);
        System.out.println("Country Deleted!\n");

    }

    private static void addCountryToListText() {
        System.out.print("Enter country: ");
        String country = inputValidator.getNonEmptyString("Not a valid country! \nEnter country: ");
        if (!inputValidator.checkForDuplicateCountry(country)){
            startingCountries.add(country);
            countriesTextFile.addCountry(country);
            System.out.println("Country added!");
        } else {
            System.out.println("Already in list!");
        }
    }

    private static void deleteCountry() {
        System.out.println("Pick a country to delete:");
        int countryToDeleteIndex;
        for (int i = 0; i < startingCountries.size(); i++) {
            System.out.println((i+1) + " for " + startingCountries.get(i));
        }
        countryToDeleteIndex = (inputValidator.getValidIntBetweenTwoNumbers(1, startingCountries.size())-1);
        startingCountries.remove(countryToDeleteIndex);
        countriesBinaryFile.initializeBinaryCountries(startingCountries);
        System.out.println("Country Deleted!\n");
    }

    private static void addCountryToList() {
        System.out.print("Enter country: ");
        String country = inputValidator.getNonEmptyString("Not a valid country! \nEnter country: ");
        if (!inputValidator.checkForDuplicateCountry(country)) {
            startingCountries.add(country);
            countriesBinaryFile.addCountry(country);
            System.out.println("Country added!");
        } else {
            System.out.println("Already in list!");
        }
    }

    private static int getUserSelection() {
        System.out.print("\n1 - See the list of countries\n2 - Add a country\n3 - Delete a country\n4 - Exit\n\nEnter a menu number: \n");
        return inputValidator.getValidIntBetweenTwoNumbers(1,4);
    }
}
