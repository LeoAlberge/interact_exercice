package com.rest.representations;
 
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;


public class Movie {
     
    @NotNull
    private Integer id;

    @NotBlank @Length(min=2, max=255)
    private String name;

    //Add release date, director ... and access methods
     
    public Movie(){
    }
 
    public Movie(Integer id, String name) {
        this.id = id;
        this.name = name;
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
   
    @Override
    public String toString() {
        return "Id Movie: " + id + ", Name :" + name;
    }
}