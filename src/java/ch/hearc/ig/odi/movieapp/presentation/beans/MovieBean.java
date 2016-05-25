/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.movieapp.presentation.beans;

import ch.hearc.ig.odi.movieapp.business.Movie;
import ch.hearc.ig.odi.movieapp.service.Services;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Julien
 */
@Named(value = "movieBean")
@RequestScoped
public class MovieBean {
    
    @Inject
    Services services;
    
    public List<Movie> getMovies() {
        return services.getMoviesList();
    }
    
}
