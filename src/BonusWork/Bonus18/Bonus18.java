package BonusWork.Bonus18;

import java.util.Objects;
import java.util.Scanner;

/**
 * Created by user on 6/27/2017.
 */
public class Bonus18 {


    public static void main(String[] args) {
        String userName;
        int userChoice;
        boolean userCont;
        Scanner input = new Scanner(System.in);

        System.out.print("What is your name? ");
        userName = input.nextLine();
        System.out.printf("\nHello %s! Would you like to go on an adventure? (y/n) ", userName);
        userCont = Objects.equals(input.next().toLowerCase(), "y");

        while (userCont){
            IslandAdventure islandAdventure = new IslandAdventure(userName);
            islandAdventure.startIslandAdventure();
            System.out.println("Would you like to go agian? (y/n)");
            userCont = Objects.equals(input.next().toLowerCase(), "y");
        }
        System.out.println("\nGoodbye, " + userName + "!");
    }
}


