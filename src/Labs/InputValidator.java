package Labs;

import java.util.Scanner;

public class InputValidator {
    private boolean userCont;
    private int userInt;
    private Scanner input = new Scanner(System.in);

    public int getValidIntBetweenTwoNumbers(int minNum, int maxNum) {
        do {
            System.out.print("\nEnter an integer that's greater than "+minNum+" but less than "+maxNum+": ");
            getValidInt();
            checkForIntBetweenTwoNumbers(minNum, maxNum);
        } while (userInt < minNum && userInt < maxNum);
        return userInt;
    }

    public int getValidInt() {
//        while (!input.hasNextInt()) {
//            input.nextLine();
//            System.out.println("not an integer! Please enter an integer: ");
//        }
        boolean validInt = false;
        do {
            if (input.hasNextInt()) {
                userInt = input.nextInt();
                validInt = true;
            } else {
                System.out.println("not an integer! Please enter an integer: ");
            }
            input.nextLine();
        }while (!validInt);
        return userInt;
    }

    private void checkForIntBetweenTwoNumbers(int minNumber, int maxNumber) {
        while (userInt < minNumber || userInt > maxNumber) {
            System.out.println("Not between "+ minNumber+" and "+maxNumber+"! Please enter an integer: ");
            getValidInt();
        }
    }

    public void checkForUserContinue(String message) {
        boolean validChoice = true;
        do {
            System.out.println(message);
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

    public boolean checkForValidChoice(String answer, String choice1, String choice2){
        boolean validChoice;
        if (answer.equalsIgnoreCase(choice1)) {
            userCont = true;
            validChoice = true;
        } else if (answer.equalsIgnoreCase(choice2)) {
            userCont = false;
            validChoice = true;
        } else {
            System.out.print("\nnot a valid choice! please enter \""+choice1+"\" or \""+choice2+"\": ");
            validChoice = false;
        }
        return validChoice;
    }

    public boolean isUserCont() {
        return userCont;
    }

}
