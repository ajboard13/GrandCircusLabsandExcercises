package Labs.Lab8;

import Labs.InputValidator;

import java.util.stream.IntStream;


class BattingCalculator {
    private static InputValidator inputValidator = new InputValidator();
    private static int[][] playerResultsTable;

    static void runBattingCalculator(){
        do {
            getNumBatters();
            populateArray();
            printResults();
            inputValidator.checkForUserContinue("\n\nWould you like to calculate another team's stats? (y/n)");
        }while (inputValidator.isUserCont());
    }

    private static void getNumBatters(){
        System.out.println("How many batters are there?");
        int numBatters = inputValidator.getValidInt();
        playerResultsTable =  new int [numBatters][4];
    }

    private static void populateArray(){
        for (int i = 0; i < playerResultsTable.length; i++) {
            playerResultsTable[i][0] = i+1;
            playerResultsTable[i][1] = getNumberOfAtBats(i);
            playerResultsTable[i][2] = sumTotalNumberOfBases(playerResultsTable[i][1], i);
        }
    }

    private static void printResults(){
        System.out.println("\nRESULTS:");
        for (int[] aPlayerResultsTable : playerResultsTable) {
            double numAtBats = aPlayerResultsTable[1];
            double totalBases = aPlayerResultsTable[2];
            double onBaseHits = aPlayerResultsTable[3];
            double battingAverage = calculateBattingAverage(onBaseHits, numAtBats);
            double sluggingPercentage = calculateSluggingPercentage(totalBases, numAtBats);
            System.out.printf("\nBatter %d average: %.3f\t\tslugging percentage: %.3f", aPlayerResultsTable[0], battingAverage, sluggingPercentage);
        }
    }


    private static double calculateBattingAverage(double onBaseHits, double atBats) {
        double result;
        try{
            result = onBaseHits / atBats;
        }catch (ArithmeticException e){
            result = 0;
        }
        return result;
    }

    private static double calculateSluggingPercentage(double totalBases, double atBats) {
        double result;
        try{
            result = totalBases / atBats;
        }catch (ArithmeticException e){
            result = 0;
        }
        return result;
    }

    private static int getNumberOfAtBats(int i){
        System.out.println("\nHow many at bats did player "+(i+1)+" have?");
        return inputValidator.getValidInt();
    }

    private static int sumTotalNumberOfBases(int atBats, int j){
        int totalBases;
        int[] result = new int[atBats];
        int numTimesOnBase = 0;
        System.out.println("0 = out, 1 = single, 2 = double, 3 = triple, 4 = home run");
        for (int i = 0; i < atBats; i++) {
            System.out.print("Result for at-bat "+(i+1) +": ");
            result[i] = inputValidator.getValidIntBetweenTwoNumbers(0,4);
            if (result[i] > 0){
                numTimesOnBase++;
            }
        }
        totalBases = IntStream.of(result).sum();
        playerResultsTable[j][3] = numTimesOnBase;
        return totalBases;
    }
}

