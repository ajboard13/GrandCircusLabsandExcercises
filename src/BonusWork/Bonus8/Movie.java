package BonusWork.Bonus8;

import java.util.Comparator;

/*
Aaron Board

7/7/2017
 */
public class Movie implements Comparable<Movie>{
    private String title;
    private MovieIO.Categories category;

    Movie(String title, MovieIO.Categories category) {
        this.title = title;
        this.category = category;
    }

    MovieIO.Categories getCategory() {
        return category;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return String.format("%-48s%-48s", ("Movie Title: "+title), ("Category: "+category));
    }

    @Override
    public int compareTo(Movie o) {
        return Comparator.comparing(Movie::getTitle)
                .compare(this, o);
    }
}
