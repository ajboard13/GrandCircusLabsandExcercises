package Labs.Lab12;

/*
Aaron Board

7/10/2017
 */
public abstract class Player {
    String name;
    Roshambo roshambo;

    abstract Roshambo generateRoshambo();

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
