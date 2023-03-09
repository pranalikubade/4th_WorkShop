package Controller;

import Interface.ImovieTheator;
import Model.Movie;
import Service.MovieTheatorIMPL;

public class MovieManagement {
    public static void main(String[] args) {
        ImovieTheator theator = new MovieTheatorIMPL();
//        add movie
        theator.addMovie(new Movie("The Godfather", 9.1, "01-02-2022", "Eternity"));
        theator.addMovie(new Movie("Bramhastra", 8.5, "06-03-2022", "Empress"));
        theator.addMovie(new Movie("KGF", 8.8, "02-01-2023", "Trillium"));
        theator.addMovie(new Movie("The Dark Knight", 7.9, "05-09-2023", "Central"));

        // remove movie from the list
        theator.removeMovie("The Dark Knight");
        System.out.println("Number of movies:"+theator.numMovies);

        //search movie by it's title
        Movie movie = theator.searchMovie();
        System.out.println(movie.getTitle() + "->" + movie.getRating());

        //Sort movies by rating in ascending order
        theator.sortByRating(true);
        for (Movie m : theator.movies) {
            System.out.println(movie.getTitle() + "->" + movie.getRating());
        }
        //calculate average rating
        System.out.println("Average rating:"+ theator.averageRating());
    }
}
