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
    private static boolean userCont = true;

    static void runCountryListApp(){
        initializeCountries();
        System.out.println("Welcome to the Countries Maintenance Application");
        do {
            int userSelect = getUserSelection();
            checkTheUserSelection(userSelect);
        }while (userCont);
        System.out.println("Goodbye!");
    }

    private static void initializeCountries() {
        startingCountries.add("USA");
        startingCountries.add("Russia");
        startingCountries.add("China");
        countriesBinaryFile.initializeBinaryCountries(startingCountries);
    }

    private static void checkTheUserSelection(int userSelect) {
        switch (userSelect){
            case 1:
                showCountryList();
                break;
            case 2:
                addCountryToList();
                break;
            case 3:
                userCont = false;
                break;
            default:
                break;
        }
    }

    private static void addCountryToList() {
        System.out.print("Enter country: ");
        String country = inputValidator.getNonEmptyString("Not a valid country! \nEnter country: ");
        startingCountries.add(country);
        countriesBinaryFile.addCountry(country);
        System.out.println("Country added!");
    }

    private static void showCountryList() {
        countriesBinaryFile.readBinaryCounties();
    }

    private static int getUserSelection() {
        System.out.print("\n1 - See the list of countries\n2 - Add a country\n3 - Exit\n\nEnter a menu number: \n");
        return inputValidator.getValidIntBetweenTwoNumbers(1,3);
    }
}
