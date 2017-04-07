package com.rest.db;
 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.List;

import com.rest.representations.Movie;
 
public class MovieDB {
     // Class that contains Movie items in an HashMap, Every movie has its own id
    public static HashMap<Integer, Movie> movies = new HashMap<>();
    static{
        movies.put(1, new Movie(1, "King Kong", " Merian Caldwell Cooper - Ernest Beaumont Schoedsack", 1933));
        movies.put(2, new Movie(2, "Star Wars: Episode IV – A New Hope", "George Lucas", 1977));
    }
     
    public static List<Movie> getMovies(){
        return new ArrayList<Movie>(movies.values());
    }

    public static List<Movie> getMoviesByYear(int year){
        ArrayList<Movie> list = new ArrayList<Movie>();
        for(Entry<Integer, Movie> entry : movies.entrySet()) {
            Movie movie = entry.getValue();
            if (movie.getReleaseDate()==year){
                list.add(movie);
            }
        }
        return list;
    }
     
    public static Movie getMovie(Integer id){
        return movies.get(id);
    }

    public static void removeMovie(Integer id){
        movies.remove(id);
    }

    public static void updateMovie( Integer id, Movie movie){
        movies.put(id, movie);
    }

    public static int size(){
        return movies.size();
    }

    public static Integer getAvailableKey(){
        Integer key = 0;
        for(Entry<Integer, Movie> entry : movies.entrySet()) {
            Integer temp_key = entry.getKey();
            if (temp_key > key ){
                key = temp_key;
            }
        }
        key++;
        return key;
    }
}