package Labs.Lab8;

/**
 * Created by user on 7/5/2017.
 */
public class AtBat {
    public enum Result {
        OUT(0), SINGLE(1), DOUBLE(2), TRIPLE(3), HOMERUN(4);
        private int basesEarned;
        Result(int basesEarned) {
            this.basesEarned = basesEarned;
        }
        public int getBasesEarned(){
            return basesEarned;
        }
    }
    private Result rName;

    AtBat(Result rName) {
       this.rName = rName;
    }

    int basesEarned(Result rName){
        int basesEarned = 0;
        switch (rName){
            case OUT:
                break;
            case SINGLE:
                break;
            case DOUBLE:
                break;
            case TRIPLE:
                break;
            case HOMERUN:
                break;
            default:
                break;
        }
        return basesEarned;
    }
}
