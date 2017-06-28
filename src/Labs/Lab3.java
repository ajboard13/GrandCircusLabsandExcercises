package Labs;

import java.util.Scanner;

public class Lab3 {
    private static Scanner input = new Scanner(System.in);
    private static int userInt;

    public static void main(String[] args) {
        boolean userCont;
        System.out.println("Learn your squares and cubes!");
        do {
            userInt = checkForValidInt();
            if (userInt < 0) {
                printPowerTablesForNegativeInts();
            } else if (userInt >= 0) {
                printPowerTablesForPositiveInts();
            }
            System.out.println("\nWould you like to go again? (y/n)");
            userCont = input.next().equalsIgnoreCase("y");
        } while (userCont);

        System.out.println("\nGoodbye!");

    }

    private static void printPowerTablesForPositiveInts() {
        printHeader();
        for (int i = 0; i <= userInt; i++) {
            System.out.printf("\n%16d%16d%16d", i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
        }
    }

    private static void printPowerTablesForNegativeInts() {
        printHeader();
        for (int i = -1; i >= userInt; i--) {
            System.out.printf("\n%16d%16d%16d", i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
        }
    }

    private static void printHeader() {
        System.out.printf("%16s%16s%16s\n%16s%16s%16s",
                            "Number",
                            "Squared",
                            "Cubed",
                            "======",
                            "=======",
                            "=====");
    }

    private static int checkForValidInt(){
        boolean validInt;
        int userInt = 0;
        do {
            System.out.println("\nHello, please enter an integer: ");
            if (input.hasNextInt()) {
                userInt = input.nextInt();
                validInt = true;
            } else {
                System.out.println("not an integer!");
                validInt = false;
                input.nextLine();
                input.nextLine();
            }
        } while (!validInt);
        return userInt;
    }
}
