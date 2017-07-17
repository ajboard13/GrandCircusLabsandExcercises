package BonusWork.Bonus17;

/*
Aaron Board

7/17/2017
 */
public class MagicUsingCharacter extends GameCharacter {

    private int magicalEnergy;

    MagicUsingCharacter(String name, int strength, int intelligence, int magicalEnergy) {
        super(name, strength, intelligence);
        this.magicalEnergy = magicalEnergy;
    }

    public int getMagicalEnergy() {
        return magicalEnergy;
    }

    public void setMagicalEnergy(int magicalEnergy) {
        this.magicalEnergy = magicalEnergy;
    }

    @Override
    String play() {
        return String.format("\nName: %s\nStrength: %d\nIntelligence: %d\nMagicka: %d", super.getName(), super.getStrength(), super.getIntelligence(), magicalEnergy);
    }
}
