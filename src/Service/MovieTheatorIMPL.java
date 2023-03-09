package Service;

import Interface.ImovieTheator;
import Model.Movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MovieTheatorIMPL implements ImovieTheator {
    private static ArrayList<Movie> movies = new ArrayList<Movie>();
    //private  static Scanner scanner=new Scanner(System.in);
    private int numMovies = 0;

    @Override
    public void addMovie(Movie movie) {
        movies.add(movie);
        numMovies++;
    }

    @Override
    public void removeMovie(String movie) {
        movies.remove(movie);
        numMovies--;
    }

    @Override
    public Movie searchMovie() {
        for (Movie movie : movies) {
            if (movie.getTitle().equals(movie)) {
                return movie;
            }
        }
        return null;
    }
    @Override
    public void sortByRating(boolean ascending) {
        if (ascending) {
            Collections.sort(movies, Comparator.comparing(Movie::getRating));
        } else {
            Collections.sort(movies, Comparator.comparing(Movie::getRating).reversed());
        }
    }

    @Override
    public double averageRating() {
        if (numMovies == 0) {
            return 0.0;
        }
        double sum = 0.0;
        for (Movie movie : movies) {
            sum += movie.getRating();
        }
        return sum / numMovies;
    }
}

