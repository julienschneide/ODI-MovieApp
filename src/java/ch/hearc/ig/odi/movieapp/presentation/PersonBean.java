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
import java.util.Map;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author silvio.gutierre
 */
@Named("personBean")
@ViewScoped
public class PersonBean implements Serializable {

    @Inject
    Services service;
    private Map<Long, Person> people;
    private Person currentPerson;
    private int currentPersonID;
    
    public Person getCurrentPerson() {
        return currentPerson;
    }

    public int getCurrentPersonID() {
        return currentPersonID;
    }

    public void setCurrentPersonID(int currentPersonID) {
        this.currentPersonID = currentPersonID;
        currentPerson = service.getPeople().get(currentPersonID);
    }    
    
    /**
     * Creates a new instance of PersonBean
     */
    public PersonBean() {
    }

    public void initList() {
        this.people = service.getPeople();
    }
    
        /**
     * Retrieves the customer object corresponding to the request's parameter id
     *
     */
    public void initPerson() {
        String idParam = FacesContext
                .getCurrentInstance()
                .getExternalContext()
                .getRequestParameterMap().get("id");
        if (!(idParam == null || idParam.isEmpty())) {
            currentPersonID = Integer.parseInt(idParam);
            currentPerson = service.getPeople().get(currentPersonID);
        }
    }
    
    public ArrayList<Map.Entry<Long, Person>> getPeople() {
        ArrayList<Map.Entry<Long, Person>> list = new ArrayList<>(people.entrySet());
        return list;
    }
    
}



    

