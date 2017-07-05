package Labs.Lab8;

import Labs.InputValidator;

/*
Aaron Board

7/5/2017
 */
public class Lab8 {
    private static InputValidator inputValidator = new InputValidator();
    public static void main(String[] args) {
        System.out.println("Welcome to Batting Average Calculator!");
        System.out.println("How many batters are there?");
        int numBatters = inputValidator.getValidInt();
        int[][] playerResultsTable = new int [numBatters][3];
        for (int i = 0; i < playerResultsTable.length; i++) {
            playerResultsTable[i][1] = getNumberOfAtBats(i);
            playerResultsTable[i][2] = sumTotalNumberOfBases(playerResultsTable[i][1]);
        }
    }

    private static int getNumberOfAtBats(int i){
        System.out.println("\nHow many at bats did player "+(i+1)+" have?");
        return inputValidator.getValidInt();
    }
    private static int sumTotalNumberOfBases(int atBats){
        int totalBases = 0;
        System.out.println("0 = out, 1 = single, 2 = double, 3 = triple, 4 = home run");
        for (int i = 0; i < atBats; i++) {
            System.out.print("Result for at-bat "+(i+1) +": ");
            totalBases += inputValidator.getValidIntBetweenTwoNumbers(0,4);
        }
        return totalBases;
    }
}
