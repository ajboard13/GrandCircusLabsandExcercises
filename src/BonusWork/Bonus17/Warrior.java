package BonusWork.Bonus17;

/*
Aaron Board

7/17/2017
 */
public class Warrior extends GameCharacter{

    String weaponType;

    public Warrior(String name, int strength, int intelligence, String weaponType) {
        super(name, strength, intelligence);
        this.weaponType = weaponType;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    String play() {
        return String.format("\nName: %s\nStrength: %d\nIntelligence: %d\nWeapon: %s", getName(), getStrength(), getIntelligence(), weaponType);
    }
}
