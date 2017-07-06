package CodeChallenges;

import Labs.InputValidator;

/*
Aaron Board && Vernon Scott

Allow user to input numbers into a 3x3 Array and sum the hourglass
=   =   =
*   =   *
=   =   =

 */
public class TwoDimensionArrayChallenge {
    private static int[][] tableOfNumbers = new int[3][3];
    private static InputValidator inputValidator = new InputValidator();
    public static void main(String[] args) {

        do {
            System.out.println("Please enter 9 integers, one at a time: ");
            populateArray();
            int sumOfHourGlass = SumHourGlass();
            printTable();
            System.out.println("\nSum of the hour glass: " + sumOfHourGlass);
            inputValidator.checkForUserContinue("Would you like to continue? (y/n) ");
        }while (inputValidator.isUserCont());

    }

    private static int SumHourGlass() {
        int sumOfHourGlass = 0;
        for (int i = 0; i < tableOfNumbers.length; i++) {
            for (int j = 0; j < tableOfNumbers.length; j++) {
                if (i ==1){
                    if(j==1){
                        sumOfHourGlass += tableOfNumbers[i][j];
                    }
                }else {
                    sumOfHourGlass += tableOfNumbers[i][j];
                }
            }
        }

//        sumOfHourGlass += tableOfNumbers[0][0];
//        sumOfHourGlass += tableOfNumbers[0][1];
//        sumOfHourGlass += tableOfNumbers[0][2];
//        sumOfHourGlass += tableOfNumbers[1][1];
//        sumOfHourGlass += tableOfNumbers[2][0];
//        sumOfHourGlass += tableOfNumbers[2][1];
//        sumOfHourGlass += tableOfNumbers[2][2];

        return sumOfHourGlass;
    }

    private static void printTable (){
        System.out.println("Your Table: ");
        for (int[] row : tableOfNumbers) {
            System.out.println("");
            for (int j = 0; j < tableOfNumbers.length; j++) {
                System.out.print(row[j] + "\t");

            }
            System.out.println("");
        }

    }

    private static void populateArray(){
        for (int i = 0; i < tableOfNumbers.length; i++) {
            for (int j = 0; j < tableOfNumbers.length; j++) {
                System.out.printf("\nEnter an integer for row %d column %d: ", (i+1), (j+1));
                tableOfNumbers[i][j] = inputValidator.getValidInt();
            }
        }
    }
}
