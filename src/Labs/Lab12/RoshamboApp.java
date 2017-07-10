package Labs.Lab12;

import Labs.InputValidator;

/*
Aaron Board

7/10/2017
 */
public class RoshamboApp {
    private static InputValidator inputValidator = new InputValidator();
    private static int playerWins;
    private static int opponentWins;
    private static int playerLoses;
    private static int opponentLoses;

    public static void main(String[] args) {

        System.out.println("Welcome to Rock Paper Scissors!");
        runRockPaperScissors();
        System.out.println("Goodbye!");
    }

    private static void runRockPaperScissors(){
        String userName = getUserName();
        Human player = new Human(userName);
        do {
            Player opponent = chooseOpponent();
            int userChoice = getUserChoice() - 1;
            player.setChoice(userChoice);
            Roshambo playerResult = player.generateRoshambo();
            Roshambo opponentResult = opponent.generateRoshambo();
            System.out.printf("%s: %s\n%s: %s", player.getName(), playerResult, opponent.getName(), opponentResult);
            compareResults(playerResult, opponentResult, player.getName(), opponent.getName());
            printTotalWins(player.getName(), opponent.getName());
            inputValidator.checkForUserContinue("\n\nPlay again? (y/n): ");
        }while (inputValidator.isUserCont());
    }

    private static void compareResults(Roshambo playerResult, Roshambo opponentResult, String playerName, String opponentName) {
        System.out.println();
        String winner = "Everybody";
        if (playerResult == opponentResult){
            System.out.println("Draw!");
        }
        if (playerResult == Roshambo.ROCK){
            if (opponentResult == Roshambo.SCISSORS){
                winner = playerName;
            }
            if (opponentResult == Roshambo.PAPER){
                winner = opponentName;
            }
        }
        if (playerResult == Roshambo.PAPER){
            if (opponentResult == Roshambo.SCISSORS){
                winner = opponentName;
            }
            if (opponentResult == Roshambo.ROCK){
                winner = playerName;
            }
        }
        if (playerResult == Roshambo.SCISSORS){
            if (opponentResult == Roshambo.PAPER){
                winner = playerName;
            }
            if(opponentResult== Roshambo.ROCK){
                winner = opponentName;
            }
        }
        if (winner.equalsIgnoreCase(opponentName)){
            opponentWins++;
            playerLoses++;
        }else if (winner.equalsIgnoreCase(playerName)) {
            playerWins++;
            opponentLoses++;
        }
        printWinner(winner);
    }

    private static void printTotalWins(String playerName, String opponentName){
        System.out.printf("\n\n%32s%32s"+ "\n%-24s %-32d%-32d\n%-24s %-32d%-32d","TOTAL WINS:","TOTAL LOSSES:", playerName, playerWins,playerLoses, opponentName, opponentWins,opponentLoses);
    }

    private static void printWinner(String winner){
        System.out.printf("%s wins!",winner);
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
