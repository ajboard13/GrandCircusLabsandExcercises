package Labs;

import java.util.Scanner;

public class InputValidator {
    private boolean userCont;
    private int userInt;
    private Scanner input = new Scanner(System.in);

    public int getValidIntBetweenTwoNumbers(int minNum, int maxNum) {
        do {
            System.out.print("\nEnter an integer that's greater than "+minNum+" but less than "+maxNum+": ");
            checkForValidInt();
            checkForIntBetweenTwoNumbers(minNum, maxNum);
        } while (userInt <= minNum && userInt < maxNum);
        return userInt;
    }

    public void checkForValidInt() {
        while (!input.hasNextInt()) {
            System.out.println("not an integer! Please enter an integer: ");
            input.nextLine();
        }
        userInt = input.nextInt();
    }

    private void checkForIntBetweenTwoNumbers(int minNumber, int maxNumber) {
        while (userInt <= minNumber || userInt > maxNumber) {
            System.out.println("Not between "+ minNumber+" and "+maxNumber+"! Please enter an integer: ");
            checkForValidInt();
        }
    }

    public void checkForUserContinue() {
        boolean validChoice = true;
        do {
            System.out.println("\nWould you like to go again? (y/n)");
            if (input.hasNextLine()) {
                String answer = input.next();
                validChoice = checkForValidChoice(answer);
            }
        } while (!validChoice);
    }

    private boolean checkForValidChoice(String answer){
        boolean validChoice;
        if (answer.equalsIgnoreCase("y")) {
            userCont = true;
            validChoice = true;
        } else if (answer.equalsIgnoreCase("n")) {
            userCont = false;
            validChoice = true;
        } else {
            System.out.print("\nnot a valid choice! please enter y or n: ");
            validChoice = false;
        }
        return validChoice;
    }

    public boolean isUserCont() {
        return userCont;
    }

    public int getUserInt() {
        return userInt;
    }
}
