package Labs.Lab12;

/*
Aaron Board

7/10/2017
 */
public class Human extends Player{
    private int choice;

    public Human(String name, int choice) {
        super(name);
        this.choice = choice;
    }

    public void setChoice(int choice){
        this.choice = choice;
    }


    @Override
    Roshambo generateRoshambo() {
        switch (choice){
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
