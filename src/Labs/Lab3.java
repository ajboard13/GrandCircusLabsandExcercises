package Labs;

import java.util.Scanner;

public class Lab3 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int userInt;
        boolean userCont;
        System.out.println("Learn your squares and cubes!");
        do {
            userInt = checkForValidInt();

            if (userInt < 0) {
                printPowerTablesForNegativeInts(userInt);
            } else if (userInt >= 0) {
                printPowerTablesForPositiveInts(userInt);
            }
            System.out.println("\nWould you like to go again? (y/n)");
            userCont = input.next().toLowerCase().equalsIgnoreCase("y");
        } while (userCont);

        System.out.println("\nGoodbye!");

    }

    private static void printPowerTablesForPositiveInts(int userInt) {
        printHeader();
        for (int i = 1; i <= userInt; i++) {
            System.out.println(i + "\t\t\t" + (int) Math.pow(i, 2) + "\t\t\t" + (int) Math.pow(i, 3));
        }
    }

    private static void printPowerTablesForNegativeInts(int userInt) {
        printHeader();
        for (int i = -1; i >= userInt; i--) {
            System.out.println(i + "\t\t\t" + (int) Math.pow(i, 2) + "\t\t\t" + (int) Math.pow(i, 3));
        }
    }

    private static void printHeader() {
        System.out.println("Number\t\tSquared\t\tCubed\n" +
                "======\t\t=======\t\t=====");
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
