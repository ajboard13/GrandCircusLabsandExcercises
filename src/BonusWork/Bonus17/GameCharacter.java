package BonusWork.Bonus17;

/*
Aaron Board

7/17/2017
 */
public abstract class GameCharacter {
    private String name;
    private int strength;
    private int intelligence;

    GameCharacter(String name, int strength, int intelligence) {
        this.name = name;
        this.strength = strength;
        this.intelligence = intelligence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    abstract String play();
}
