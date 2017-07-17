package BonusWork.Bonus17;

/*
Aaron Board

7/17/2017
*/
public class GameApp {
    public static void main(String[] args) {

        GameCharacter[] characters = createCharacters();

        for (int i = 0; i < characters.length; i++) {
            System.out.printf("\n\nCharacter %d: ", i+1);
            System.out.print(characters[i].play());
        }
    }

    private static GameCharacter[] createCharacters(){
        GameCharacter[] characters = new GameCharacter[5];
        characters[0] = new Warrior("Jon Snow", 35, 40, "Broad Sword");
        characters[1] = new Warrior("Ned Stark", 45, 30, "Two-Handed Sword");
        characters[2] = new Wizard("Merlin", 15,45,40,7);
        characters[3] = new Wizard("Gandolf", 15,40,45,4);
        characters[4] = new Wizard("Dumbledore", 15,50,35,2);

        return characters;
    }
}
