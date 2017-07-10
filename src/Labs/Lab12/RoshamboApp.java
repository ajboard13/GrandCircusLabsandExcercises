package Labs.Lab12;

import Labs.InputValidator;

import java.util.Scanner;

/*
Aaron Board

7/10/2017
 */
public class RoshamboApp {
    private static InputValidator inputValidator = new InputValidator();

    public static void main(String[] args) {

        String userName = getUserName();
        Player opponent = chooseOpponent();
        int userChoice = getUserChoice() - 1;
        Human player = new Human(userName, userChoice);

        System.out.println(player.generateRoshambo());
        System.out.println(opponent.generateRoshambo());

    }

    private static Player chooseOpponent() {
        Brock brock = new Brock("Brock");
        Ash ash = new Ash("Ash");
        String choice;
        System.out.printf("\nWould you like to play against %s or %s (b/a)?", brock.getName(), ash.getName());
        choice = inputValidator.checkForValidChoice("b", "a");
        if (choice.equalsIgnoreCase("b")) {
            return brock;
        } else if (choice.equalsIgnoreCase("a")) {
            return ash;
        } else return null;
    }

    private static String getUserName() {
        System.out.println("\nEnter your name: ");
        return inputValidator.getNonEmptyString("Please enter valid name: ");
    }

    private static int getUserChoice() {
        System.out.println("\nRock, Paper, or Scissors? \n1 for rock\n2 for paper\n3 for scissors");
        return inputValidator.getValidIntBetweenTwoNumbers(1, 3);
    }
}
