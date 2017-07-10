package Labs.Lab12;

/*
Aaron Board

7/10/2017
 */
class Ash extends Player{
    Ash(String name) {
        super(name);
    }

    String getName(){
        return super.name;
    }

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
