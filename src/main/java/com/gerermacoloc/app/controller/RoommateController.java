package com.gerermacoloc.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gerermacoloc.app.controller.generic.GenericControllerImpl;
import com.gerermacoloc.app.domain.Roommate;
import com.gerermacoloc.app.form.CreateRoommateForm;
import com.gerermacoloc.app.service.contract.RoommateService;

/**
 * The roommates controller.
 */
@Controller
@RequestMapping("/roommates")
public class RoommateController extends GenericControllerImpl<Roommate, CreateRoommateForm> {

    @Autowired
    public RoommateController(final RoommateService service) {
        super("roommates", Roommate.class.getSimpleName().toLowerCase(), service);
    }
    
    @Override
    protected void loadEntities(final Model model) {
        super.loadEntities(model);
    }

    @Override
    protected void populateLists(final Model model) {
    }
}
