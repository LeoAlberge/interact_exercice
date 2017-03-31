package com.rest.controller;
 
import io.dropwizard.auth.Auth;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Set;

import javax.validation.Validator;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.rest.db.MovieDB;
import com.rest.representations.Movie;
 
@Path("/movies")
@Produces(MediaType.APPLICATION_JSON)
public class MovieRESTController {
 
 // This controller class listen to url /movies and response wether all the movie in the JSON format 
 // Wether one movie by urk /movies/id
    private final Validator validator;
 
    public MovieRESTController(Validator validator) {
        this.validator = validator;
    }
 
    @GET
    public Response getMovies() {
        return Response.ok(MovieDB.getMovies()).build();
    }
 
    @GET
    @Path("/{id}")
    public Response getMovieById(@PathParam("id") Integer id) {
    
        Movie movie = MovieDB.getMovie(id);
        if (movie != null)
            return Response.ok(movie).build();
        else
            return Response.status(Status.NOT_FOUND).build();
    }

    //Add methos for create a movie, update a movie by request
}