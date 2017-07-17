package BonusWork.Bonus17;

/*
Aaron Board

7/17/2017
 */
public class Wizard extends MagicUsingCharacter{
    private int spellNumber;


    Wizard(String name, int strength, int intelligence, int magicalEnergy, int spellNumber) {
            super(name, strength, intelligence, magicalEnergy);
            this.spellNumber = spellNumber;
    }

    public int getSpellNumber() {
        return spellNumber;
    }

    public void setSpellNumber(int spellNumber) {
        this.spellNumber = spellNumber;
    }

    @Override
    String play() {
        return super.play() + "\nSpell: " + spellNumber;
    }
}
