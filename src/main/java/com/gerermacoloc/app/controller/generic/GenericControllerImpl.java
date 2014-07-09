package com.gerermacoloc.app.controller.generic;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gerermacoloc.app.controller.util.DateEditor;

/**
 * A Generic controller implementation, providing default implementation for Create, Update, Delete and Display functions.
 * 
 * @param <T>
 *            an entity to manipulate
 * @param <F>
 *            the form allowing to validate the input
 */
public abstract class GenericControllerImpl implements GenericController {

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class, new DateEditor());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @RequestMapping(method = RequestMethod.GET)
    public abstract String defaultHome(final Model model, HttpSession session);

    /**
     * Load the exception context into the context model. By default, it loads the exception message.
     * 
     * @param model
     *            the context model
     * @param exception
     *            the exception
     */
    protected void loadErrorContext(final Model model, final Exception exception) {
        model.addAttribute("exception", exception.getMessage());
    }
    
    @Override
    public Model getLoadedModel() {
    	//TODO: getLoadedModel
		return null;
    }
}
