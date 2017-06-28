package Labs;

import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        int userInt = 0;
        boolean validInt = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Learn your squares and cubes!");
        do {
            System.out.println("\nHello, please enter an integer: ");
            if (input.hasNextInt()) {
                userInt = input.nextInt();
                validInt = true;
            } else {
                System.out.println("not an integer!");
                input.nextLine();
            }
        } while (!validInt);

        if (userInt < 0) {
            printPowerTablesForNegativeInts(userInt);
        } else if (userInt >= 0) {
            printPowerTablesForPositiveInts(userInt);
        }

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
}
