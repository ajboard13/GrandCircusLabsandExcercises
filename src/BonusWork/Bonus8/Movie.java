package BonusWork.Bonus8;

/*
Aaron Board

7/7/2017
 */
public class Movie {
    private String title;
    private String category;

    Movie(String title, String category) {
        this.title = title;
        this.category = category;
    }

    @Override
    public String toString() {
        return "\nTitle: "+ title+ "\tCategory: "+category;
    }
}
