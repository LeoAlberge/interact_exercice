package com.rest.representations;

import com.rest.representations.CustomDateSerializer;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.joda.time.DateTime;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class Movie {


    private String format = "dd-MM-yyyy";

    @NotNull
    private Integer id;

    @NotBlank @Length(min=2, max=255)
    private String name;

    //@NotBlank
    //private DateTime release_date;

    @NotBlank @Length(min=4,max=4)
    private int release_date;

    @NotBlank 
    private String director_name;

    //Add release date, director ... and access methods
     
    public Movie(){
    }
 
    public Movie(Integer id, String name, String director_name, int year) {
        this.id = id;
        this.name = name;
        this.director_name=director_name;
        this.release_date=year;
        //this.release_date = new DateTime(year, month, day, 0, 0);

    }
 
    public Integer getId() {
        return id;
    }
 
    public void setId(Integer id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDirectorName() {
        return director_name;
    }

    public void setDirectorName(String director_name) {
        this.director_name = director_name;
    }
    
    //@JsonSerialize(using = CustomDateSerializer.class)
    // public DateTime getReleaseDate(){
    //     return release_date;
    // }

    public int getReleaseDate(){
        return release_date;
    }

    // public void setReleaseDate(int year, int month, int day){
    //     this.release_date = new DateTime(year, month, day, 0, 0);
    // }

    public void setReleaseDate(int year){
        this.release_date = year;
    }

   
    @Override
    public String toString() {
        return "Id Movie: " + id + ", Name :" + name + ", Director Name:" + director_name + ", Release Year :" + release_date;
    }
}