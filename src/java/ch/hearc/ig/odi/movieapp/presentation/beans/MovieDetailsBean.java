/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.movieapp.presentation.beans;

import ch.hearc.ig.odi.movieapp.business.Movie;
import ch.hearc.ig.odi.movieapp.service.Services;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Julien
 */
@SessionScoped
@Named(value = "movieDetailsBean")
public class MovieDetailsBean implements Serializable{
    
    @Inject Services services;
    private Movie movie;
    /**
     * Creates a new instance of MovieDetailsBean
     */
    public MovieDetailsBean() {
    }
    
    public String showMovie(Movie movie){
        this.movie = movie;
        return "movieDetails";
    }
    
}
