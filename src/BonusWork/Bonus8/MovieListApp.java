package BonusWork.Bonus8;

import Labs.InputValidator;

import java.util.ArrayList;


class MovieListApp {
    private static InputValidator inputValidator = new InputValidator();

    static void runMovieListApp(){
        ArrayList<Movie> movies = populateArrayOfMovies();
        do {
            System.out.printf("There are %d movies in the list\n", movies.size());
            int movieCat = selectCategory() - 1;
            ArrayList<Movie> selectedMovies = getMoviesFromCategory(movieCat, movies);
            printSelectedMovies(selectedMovies);
            inputValidator.checkForUserContinue("\nWould you like to search again? (y/n)");
        }while (inputValidator.isUserCont());
        System.out.println("Goodbye!");
    }

    private static void printSelectedMovies(ArrayList<Movie> selectedMovies) {
        System.out.printf("There are %d movies in this category: \n\n" , selectedMovies.size());
        for (Movie movie: selectedMovies){
            System.out.println(movie);
        }
    }

    private static ArrayList<Movie> getMoviesFromCategory(int movieCat, ArrayList<Movie> movies) {
        ArrayList<Movie> selectedMovies = new ArrayList<>();
        for (Movie movie: movies){
            if(movieCat == movie.getCategory().ordinal()){
                selectedMovies.add(movie);
            }
        }
        return selectedMovies;
    }

    private static int selectCategory() {
        System.out.println("What category are you interested in?\n1 for SciFi\n2 for Drama\n3 for Musical\n4 for Comedy\n5 for Horror\n6 for Animated");
        return inputValidator.getValidIntBetweenTwoNumbers(1,6);
    }

    private static ArrayList<Movie> populateArrayOfMovies(){
        ArrayList<Movie> movies = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            movies.add(MovieIO.getMovie(i));
        }
        return movies;
    }
}
