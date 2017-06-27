package Labs;

import java.util.Objects;
import java.util.Scanner;

import static java.lang.System.out;

public class Lab2 {
    public static void main(String[] args) {
        int userInt;
        boolean userCont;
        String userName;
        Scanner input = new Scanner(System.in);

        System.out.println("Hello, what is your name? ");
        userName = input.next();

        do {
            //input validation
            do {
                System.out.println(userName+", Enter a number between 1 and 100: ");
                if (input.hasNextInt()) {
                    userInt = input.nextInt();
                    if (userInt <= 0) {
                        userInt = 101;
                    }
                } else {
                    System.out.println(userName + ", that is not a number between 1 and 100.");
                    userInt = 101;
                    input.nextLine();
                    input.nextLine();
                }

            } while (userInt > 100);

            if (userInt % 2 == 1) {
                if (userInt > 60) {
                    System.out.println(userInt + " Odd and over 60.");
                } else {
                    System.out.println(userInt + " Odd.");
                }
            } else {
                if (userInt < 25) {
                    System.out.println("Even and less than 25.");
                }
                if (userInt >= 26 && userInt <= 60) {
                    System.out.println("Even.");
                } else {
                    System.out.println(userInt + " Even.");
                }
            }
            out.print("\nContinue?(y/n) ");
            userCont = Objects.equals(input.next().toLowerCase(), "y");
        }while (userCont);
        input.close();
    }
}
