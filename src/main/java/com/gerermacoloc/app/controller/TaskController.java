package com.gerermacoloc.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gerermacoloc.app.controller.generic.GenericControllerImpl;
import com.gerermacoloc.app.domain.Colocation;
import com.gerermacoloc.app.form.CreateColocationForm;
import com.gerermacoloc.app.service.contract.ColocationService;

/**
 * The tasks controller.
 */
@Controller
@RequestMapping("/tasks")
public class TaskController extends GenericControllerImpl<Colocation, CreateColocationForm> {

    @Autowired
    public TaskController(final ColocationService service) {
        super("tasks", Colocation.class.getSimpleName().toLowerCase(), service);
    }
    
    @Override
    protected void loadEntities(final Model model) {
        super.loadEntities(model);
    }

    @Override
    protected void populateLists(final Model model) {
    }
}
