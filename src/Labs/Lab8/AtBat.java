package Labs.Lab8;


public class AtBat {

    private Result basesEarned;
    public enum Result {
        OUT, SINGLE, DOUBLE, TRIPLE, HOMERUN;
    }
    private Result rName;

    AtBat(Result rName) {
       this.rName = rName;
    }

    public int getBasesEarned(){
        return rName.ordinal();
    }

}
