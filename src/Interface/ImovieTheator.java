package Interface;

import Model.Movie;

public interface ImovieTheator {
    void addMovie(Movie movie);
    void removeMovie(String movie);
    Movie searchMovie();
    void sortByRating(boolean ascending);

    double averageRating();
}
