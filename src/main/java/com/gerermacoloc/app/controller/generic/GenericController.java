package com.gerermacoloc.app.controller.generic;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * A Generic controller interface, providing an API for Create, Update, Delete and Display functions. It takes as type parameters a
 * JPA entity and a form.
 * 
 * @param <T>
 *            an entity to manipulate
 * 
 * @param <F>
 *            the form allowing to validate the input
 */
public interface GenericController {

    /**
     * Display the entity home page. Usually a page listing all the entities of the entity type.
     * 
     * @param model
     *            the context model
     * @return the entity home page path
     */
    @RequestMapping(method = RequestMethod.GET)
    public abstract String defaultHome(Model model, HttpSession session);
    
    public abstract Model getLoadedModel();

}
