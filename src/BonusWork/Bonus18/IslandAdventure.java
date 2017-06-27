package BonusWork.Bonus18;

import java.util.Scanner;

class IslandAdventure {
    private String userName;
    private Scanner input = new Scanner(System.in);

    IslandAdventure(String userName) {
        this.userName = userName;
    }

    void startIslandAdventure() {
        System.out.println("You wake up on an island, there doesn't seem to be anyone around. All you remember is your name, "+ userName + ".");
        adventureStart();
    }

    private void adventureStart() {
        boolean isValidChoice = true;
        do {
            System.out.println("which direction would you like to go?\n1 for straight\n2 for left\n3 for right\n4 for backwards");
            if (input.hasNextInt()) {
                switch (input.nextInt()) {
                    case 1:
                        System.out.println("walking...\n You came across a village! The people appear aggressive, what do you do?");
                        System.out.println("1 to run back\n2 to ask for help");
                        if (input.hasNextInt()) {
                            switch (input.nextInt()){
                                case 1:
                                    break;
                                case 2:
                                    System.out.println("The villagers attack you. You died.");
                                    isValidChoice = false;
                                    break;
                                default:
                                    System.out.println("Not a valid choice!");
                                    break;
                            }
                        }
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Not a valid choice!");
                }
            }else {
                System.out.println("Not a valid choice!");
            }
        }while(isValidChoice);


    }

}
