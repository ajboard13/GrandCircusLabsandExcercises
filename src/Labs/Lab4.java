package Labs;


import java.util.Scanner;

public class Lab4 {
    private static int userInt;
    private static Scanner input = new Scanner(System.in);
    private static boolean userCont;


    public static void main(String[] args) {
        long factorialResult;
        System.out.println("Welcome to the Factorial Calculator!\n");
        do {
            getValidInput();
            factorialResult = calculateFactorial(userInt);
            System.out.println("The factorial of " + userInt + " is " + factorialResult);
            checkForUserContinue();
        } while (userCont);
        System.out.println("Goodbye!");
    }

    private static long calculateFactorial(int n) {
        long result;
        if(n==1)
            return 1;
        result = calculateFactorial(n-1) * n;
        return result;
    }

    private static void getValidInput() {
        do {
            System.out.print("\nEnter an integer that's greater than 0 but less than 20: ");
            checkForValidInt();
            checkForIntBetweenOneAndTen();
        } while (userInt <= 0 && userInt < 20);
    }

    private static void checkForValidInt() {
        while (!input.hasNextInt()) {
            System.out.println("not an integer! Please enter an integer: ");
            input.nextLine();
        }
        userInt = input.nextInt();
    }

    private static void checkForIntBetweenOneAndTen() {
        while (userInt <= 0 || userInt > 20) {
            System.out.println("Not between 1 and 20! Please enter an integer: ");
            checkForValidInt();
        }
    }

    private static void checkForUserContinue() {
        boolean validChoice = true;
        do {
            System.out.println("\nWould you like to go again? (y/n)");
            if (input.hasNextLine()) {
                String answer = input.next();
                validChoice = checkForValidChoice(answer);
            }
        } while (!validChoice);
    }

    private static boolean checkForValidChoice(String answer){
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

}
