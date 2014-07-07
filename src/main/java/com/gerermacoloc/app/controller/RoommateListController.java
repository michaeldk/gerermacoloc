package com.gerermacoloc.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gerermacoloc.app.controller.generic.GenericControllerImpl;
import com.gerermacoloc.app.domain.RoommateList;
import com.gerermacoloc.app.form.CreateRoommateListForm;
import com.gerermacoloc.app.service.contract.RoommateListService;

/**
 * The roommateLists controller.
 */
@Controller
@RequestMapping("/roommateLists")
public class RoommateListController extends GenericControllerImpl<RoommateList, CreateRoommateListForm> {

    @Autowired
    public RoommateListController(final RoommateListService service) {
        super("roommateLists", RoommateList.class.getSimpleName().toLowerCase(), service);
    }

    @Override
    protected void loadEntities(final Model model) {
        super.loadEntities(model);
    }

    @Override
    protected void populateLists(final Model model) {
    }
}
