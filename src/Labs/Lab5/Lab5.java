package Labs.Lab5;
import Labs.InputValidator;
/*
Aaron Board
6/29/2017

This program takes n-sided dice and prints the result
 */

public class Lab5 {
    private static InputValidator inputValidator = new InputValidator();
    public static void main(String[] args) {
        do {
            int numDice = askForNumDice();
            int numSides = askForNumSides();
            rollAllDice(numDice, numSides);
            inputValidator.checkForUserContinue();
        }while (inputValidator.isUserCont());

    }

    private static void printResult(int i, int result){
        System.out.println("Dice "+i+": "+result);
    }

    private static int askForNumSides(){
        System.out.println("How many sides are on the dice (or die)? ");
        return askForInt();
    }

    private static int askForNumDice(){
        System.out.println("How many dice (or die) are there? ");
        return askForInt();
    }

    private static int askForInt(){
        inputValidator.checkForValidInt();
        return inputValidator.getUserInt();
    }
    private static void rollAllDice(int numDice, int numSides){
        Dice dice = new Dice(numSides);
        for (int i = 1; i <= numDice; i++) {
            int result = dice.rollDice();
            printResult(i,result);
        }
    }
}
