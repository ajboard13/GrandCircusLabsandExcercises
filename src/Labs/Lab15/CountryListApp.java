package Labs.Lab15;

import Labs.InputValidator;
import Labs.Lab15.dao.CountriesDao;
import Labs.Lab15.factory.DaoFactory;

import java.util.ArrayList;

/*
Aaron Board

7/11/2017
 */
class CountryListApp {
    private static ArrayList<String> startingCountries = new ArrayList<>();
    private static InputValidator inputValidator = new InputValidator();
    private static CountriesDao dao;
    private static boolean userCont = true;

    static void runCountryListApp(){
        System.out.println("Welcome to the Countries Maintenance Application");
        System.out.println("\n1 for text\n2 for binary");
        dao = DaoFactory.getInstance(inputValidator.getValidIntBetweenTwoNumbers(1,2));
        initializeCountries();
        dao.writeCountries(startingCountries);
        do {
            checkTheUserSelection(getUserSelection());
        }while (userCont);

        System.out.println("Goodbye!");
    }


    private static void initializeCountries() {
        startingCountries.add("USA");
        startingCountries.add("Russia");
        startingCountries.add("China");
    }


    private static void checkTheUserSelection(int userSelect) {
        switch (userSelect){
            case 1:
                dao.read();
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

    private static void deleteCountry() {
        System.out.println("Pick a country to delete:");
        int countryToDeleteIndex;
        for (int i = 0; i < startingCountries.size(); i++) {
            System.out.println((i+1) + " for " + startingCountries.get(i));
        }
        countryToDeleteIndex = (inputValidator.getValidIntBetweenTwoNumbers(1, startingCountries.size())-1);
        startingCountries.remove(countryToDeleteIndex);
        dao.writeCountries(startingCountries);
        System.out.println("Country Deleted!\n");
    }

    private static void addCountryToList() {
        System.out.print("Enter country: ");
        String country = inputValidator.getNonEmptyString("Not a valid country! \nEnter country: ");
        if (!inputValidator.checkForDuplicateCountry(country,  dao.getPath())) {
            startingCountries.add(country);
            dao.addCountry(country);
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
