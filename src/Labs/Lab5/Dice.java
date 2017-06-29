package Labs.Lab5;

/**
 * Created by user on 6/29/2017.
 */
public class Dice {
    private int numOfSides;

    public Dice(int numOfSides) {
        this.numOfSides = numOfSides;
    }

    public int rollDice(){
        int result = (int) (Math.random() * (numOfSides+1));
        return result;
    }

}
