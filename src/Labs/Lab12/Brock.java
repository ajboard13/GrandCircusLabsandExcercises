package Labs.Lab12;

/*
Aaron Board

7/10/2017
 */
class Brock extends Player{
    Brock(String name) {
        super(name);
    }


    @Override
    Roshambo generateRoshambo() {
        return Roshambo.ROCK;
    }
}
