package Labs.Lab12;

/*
Aaron Board

7/10/2017
*/
public enum Roshambo {
    ROCK("Rock"),
    PAPER("Paper"),
    SCISSORS("Scissors");

    private String friendlyName;



    Roshambo(String value) {
        friendlyName = value;
    }


    @Override
    public String toString() {
        return friendlyName;
    }
}
