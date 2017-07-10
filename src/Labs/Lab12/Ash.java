package Labs.Lab12;

/*
Aaron Board

7/10/2017
 */
public class Ash extends Player{
    @Override
    Roshambo generateRoshambo() {
        int randNum = (int) (Math.random() * 3);
        switch (randNum){
            case 0:
                return Roshambo.ROCK;
            case 1:
                return Roshambo.PAPER;
            case 2:
                return Roshambo.SCISSORS;
            default:
                break;
        }
        return null;
    }
}
