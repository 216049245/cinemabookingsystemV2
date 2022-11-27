package za.ac.cput.cinemabookingsystem.repository.lookup;

import za.ac.cput.cinemabookingsystem.domain.lookup.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//Responsible for CRUD into a data store: Data structure.
public class MovieRepository {
    private final List<Movie> movieList;
    private static MovieRepository MOVIE_REPOSITORY;

    private MovieRepository() {
        this.movieList = new ArrayList<>();
    }

    public static MovieRepository movieRepository(){
        if (MOVIE_REPOSITORY == null)
            MOVIE_REPOSITORY = new MovieRepository();
        return MOVIE_REPOSITORY;
    }

    public Movie create(Movie movie) {

        this.movieList.add(movie);
        //save into data store and return if successful.
        return movie;
    }

    public Movie update(Movie movie) {
        Optional<Movie> read = read(movie.getId());
        if (read.isPresent()) {
            delete(read.get());
            create(movie);
        }
        //check if movie exists, if yes, update then return if successful.
        return movie;
    }

    public Optional<Movie> read(String id) {
        //find the movie that matches the id and return.
        return this.movieList.stream().filter(m -> m.getId().equalsIgnoreCase(id))
                .findFirst();
    }

    public void delete(Movie movie) {
        this.movieList.remove(movie);
    }

    public List<Movie> findAll() {
        //return all that is stored.
        return null;
    }
}
