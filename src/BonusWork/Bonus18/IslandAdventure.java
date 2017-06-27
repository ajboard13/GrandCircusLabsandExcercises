package BonusWork.Bonus18;

import java.util.Scanner;

class IslandAdventure {
    private String userName;
    private boolean isValidChoice = true;
    private boolean defeatedWolf = false;
    private boolean retrievedIdol = false;
    private Scanner input = new Scanner(System.in);

    IslandAdventure(String userName) {
        this.userName = userName;
    }

    void startIslandAdventure() {
        System.out.println("\nYou wake up on an island, there doesn't seem to be anyone around. All you remember is your name, "+ userName + ".\n");
        adventureStart();
    }

    private void adventureStart() {
        do {
            System.out.println("which direction would you like to go?\n\n1 for straight\n2 for left\n3 for right\n4 for backwards\n");
            if (input.hasNextInt()) {
                switch (input.nextInt()) {
                    case 1:
                        villageEncounter();
                        break;
                    case 2:
                        forestEncounter();
                        break;
                    case 3:
                        wolfEncounter();
                        break;
                    case 4:
                        beachEncounter();
                        break;
                    default:
                        System.out.println("Not a valid choice!\n");
                }
            }else {
                System.out.println("Not a valid choice!\n");
                input.nextLine();
            }
        }while(isValidChoice);
    }

    private void villageEncounter() {
        if (!defeatedWolf) {
            if(!retrievedIdol) {
                System.out.println("walking...\n You came across a village! The people appear aggressive, what do you do?\n");
                System.out.println("1 to run back\n2 to ask for help\n");
                if (input.hasNextInt()) {
                    switch (input.nextInt()) {
                        case 1:
                            break;
                        case 2:
                            System.out.println("The villagers attack you. You died.\n");
                            isValidChoice = false;
                            break;
                        default:
                            System.out.println("Not a valid choice!\n");
                            break;
                    }
                }
            }else {
                System.out.println("walking...\n You came across a village! The people notice the idol in your hands and approach, what do you do?\n");
                System.out.println("1 to run back\n2 to hand over the idol\n");
                if (input.hasNextInt()) {
                    switch (input.nextInt()) {
                        case 1:
                            System.out.println("The village chases after you for the idol! You Died!");
                            isValidChoice = false;
                            break;
                        case 2:
                            System.out.println("The villagers help you find civilization. Congratulations, "+ userName+"!\n");
                            isValidChoice = false;
                            break;
                        default:
                            System.out.println("Not a valid choice!\n");
                            break;
                    }
                }
            }
        }else {
            System.out.println("walking...\n You came across a village! The people rejoice, what do you do?\n");
            System.out.println("1 to run back\n2 to ask for help\n");
            if (input.hasNextInt()) {
                switch (input.nextInt()) {
                    case 1:
                        break;
                    case 2:
                        System.out.println("The villagers help you find civilization. Congratulations, "+ userName+"!\n");
                        isValidChoice = false;
                        break;
                    default:
                        System.out.println("Not a valid choice!\n");
                        break;
                }
            }
        }

    }

    private void forestEncounter() {
        System.out.println("walking...\n You came across a dark forest! It seems to go on forever, what do you do?\n");
        System.out.println("1 to run back\n2 to go in the forest\n");
        if (input.hasNextInt()) {
            switch (input.nextInt()) {
                case 1:
                    break;
                case 2:
                    System.out.println("You go in the forest.\n");
                    wolfEncounter();
                    break;
                default:
                    System.out.println("Not a valid choice!\n");
                    break;
            }
        }
    }

    private void beachEncounter() {
        System.out.println("walking...\n You came across a beach! the ocean seems to go on forever, what do you do?\n");
        System.out.println("1 to run back\n2 to go for a swim\n");
        if (input.hasNextInt()) {
            switch (input.nextInt()) {
                case 1:
                    break;
                case 2:
                    System.out.println("You are in the water and you see something glimmering at the bottom, what do you do?\n");
                    System.out.println("1 to go back to where you woke up\n2 to swim down and grab it\n");
                    if (input.hasNextInt()) {
                        switch (input.nextInt()) {
                            case 1:
                                break;
                            case 2:
                                sharkEncounter();
                                break;
                            default:
                                System.out.println("Not a valid choice!\n");
                                break;
                        }
                    }
                    break;
                default:
                    System.out.println("Not a valid choice!\n");
                    break;
            }
        }
    }

    private void wolfEncounter(){
        System.out.println("walking...\n You came across a feral wolf! It seems ready to pounce, what do you do?\n");
        System.out.println("1 to run back\n2 to try to intimidate it");
        if (input.hasNextInt()) {
            switch (input.nextInt()) {
                case 1:
                    System.out.println("The wolf chases you down. You died!\n");
                    isValidChoice = false;
                    break;
                case 2:
                    System.out.println("The wolf runs off! A local villager witnessed your bravery and went to tell the tribe. " +
                                        "You return to the spot you woke up.\n");
                    defeatedWolf = true;
                    break;
                default:
                    System.out.println("Not a valid choice!\n");
                    break;
            }
        }
    }

    private void sharkEncounter(){
        System.out.println("You swam down to grab the item, you see a shark coming towards you, what are you going to do?\n");
        System.out.println("1 to swim away\n2 to punch it in the nose or gills");
        if (input.hasNextInt()) {
            switch (input.nextInt()) {
                case 1:
                    System.out.println("The shark chases you down. You died\n");
                    isValidChoice = false;
                    break;
                case 2:
                    System.out.println("You strike the shark, it swims away and you retrieve the item. It appears to be an idol of a goddess. " +
                                        "\nPerhaps belonging to a local tribe. they would be happy to have it returned."
                                        + " You return to where you woke up\n");
                    retrievedIdol = true;
                    break;
                default:
                    System.out.println("Not a valid choice!\n");
                    break;
            }
        }
    }
}
