/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.movieapp.presentation;

import ch.hearc.ig.odi.movieapp.business.Person;
import ch.hearc.ig.odi.movieapp.service.Services;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author silvio.gutierre
 */
@Named("customerBean")
@ViewScoped
public class PersonBean implements Serializable {

    @Inject
    Services service;
    private List<Person> persons;
    /**
     * Creates a new instance of PersonBean
     */
    public PersonBean() {
    }

    public void initList() {
        this.persons = service.getPeopleList();
    }

}



    

