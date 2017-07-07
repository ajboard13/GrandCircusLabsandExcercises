package BonusWork.Bonus8;

/*
Aaron Board

7/7/2017
 */
public class Movie {
    private String title;
    private MovieIO.Categories category;

    Movie(String title, MovieIO.Categories category) {
        this.title = title;
        this.category = category;
    }

    MovieIO.Categories getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return String.format("%-48s%-48s", ("Movie Title: "+title), ("Category: "+category));
    }
}
