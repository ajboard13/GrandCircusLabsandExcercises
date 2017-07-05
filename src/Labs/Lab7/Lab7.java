package Labs.Lab7;

import Labs.InputValidator;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Aaron Board

7/5/2017
 */
public class Lab7 {
    private static InputValidator inputValidator = new InputValidator();
    private static String[][] studentTable = {{"Kim", "Smith", "Pizza", "Grand Rapids"}, {"Aaron", "Smith", "Spaghetti", "Warren"}, {"Jacob", "Smith", "Meatloaf", "Warren"}, {"Sean", "Smith", "Sushi", "Warren"},
            {"Sarah", "Smith", "Pizza", "Sterling Heights"}, {"Katrina", "Smith", "Grilled Cheese", "Warren"}, {"Catherine", "Smith", "Spaghetti", "Taylor"}, {"Dan", "Smith", "Wings", "Warren"},
            {"Matt", "Smith", "Grilled Chicken", "Warren"}, {"Drew", "Smith", "Pizza", "Utica"}, {"Mike", "Smith", "Burgers", "Warren"}, {"Dylan", "Smith", "Pizza", "Sterling Heights"},
            {"Josh", "Smith", "Schwarma", "Sterling Heights"}, {"Jeremy", "Smith", "Roast Beef", "Grand Rapids"}, {"Paul", "Smith", "Pizza", "Kalamazoo"}, {"Steve", "Smith", "Cheese Burgers", "Kalamazoo"},
            {"Kristen", "Smith", "Alfredo", "Sterling Heights"}, {"Anjelica", "Smith", "Burritos", "Sterling Heights"}, {"Troy", "Smith", "Pizza", "Warren"}, {"Heather", "Smith", "Pasta", "Rochester"}};
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int studentSelected;

        System.out.println("Welcome to our Java class!");
        do {
            System.out.println("Which student would you like to learn more about? ");
            studentSelected = inputValidator.getValidIntBetweenTwoNumbers(1, 20)-1;

            String fullName = studentTable[studentSelected][0] + " " + studentTable[studentSelected][1];
            String firstName = studentTable[studentSelected][0];

            System.out.printf("Student %d is %s. What would you like to know about %s? (Enter \"hometown\" or \"favorite food\"): \n"
                    , studentSelected+1,
                    fullName,
                    firstName);
            int infoRequested = getInformationRequested();
            System.out.println(getInformationMessage(infoRequested, studentSelected, firstName));
            inputValidator.checkForUserContinue();
        }while (inputValidator.isUserCont());
        System.out.println("Goodbye!");
    }

    private static int getInformationRequested() {
        boolean validChoice;
        int infoRequested = 0;
        do {
            String choice = input.nextLine();
            validChoice = inputValidator.checkForValidChoice(choice, "hometown", "favorite food");
            if(choice.equalsIgnoreCase("hometown")){
                infoRequested = 3;
            } else if(choice.equalsIgnoreCase("favorite food")){
                infoRequested = 2;
            }else{
                validChoice = false;
            }
        } while (!validChoice);
        return infoRequested;
    }
    private static String getInformationMessage(int infoRequested, int studentSelected, String firstName){
        String infoMessage = null;
        String info = studentTable[studentSelected][infoRequested];
        if (infoRequested == 3){
            infoMessage = firstName+" is from "+info+". would you like to know more?(y or n): ";
        }else if (infoRequested == 2){
            infoMessage = firstName+"'s favorite food is "+info+ ". would you like to know more?(y or n): ";
        }
        return infoMessage;
    }
}
