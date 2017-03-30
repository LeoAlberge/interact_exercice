package com.rest.db;
 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.rest.representations.Movie;
 
public class MovieDB {
     // Class that contains Movie items in an HashMap, Every movie has its own id
    public static HashMap<Integer, Movie> movies = new HashMap<>();
    static{
        movies.put(1, new Movie(1, "King Kong"));
        movies.put(2, new Movie(2, "Cendrion"));
        movies.put(3, new Movie(3, "StarWars"));
    }
     
    public static List<Movie> getMovies(){
        return new ArrayList<Movie>(movies.values());
    }
     
    public static Movie getMovie(Integer id){
        return movies.get(id);
    }
     
}