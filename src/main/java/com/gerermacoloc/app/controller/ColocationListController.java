package com.gerermacoloc.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gerermacoloc.app.controller.generic.GenericControllerImpl;
import com.gerermacoloc.app.domain.ColocationList;
import com.gerermacoloc.app.form.CreateColocationListForm;
import com.gerermacoloc.app.service.contract.ColocationListService;

/**
 * The colocationLists controller.
 */
@Controller
@RequestMapping("/colocationLists")
public class ColocationListController extends GenericControllerImpl<ColocationList, CreateColocationListForm> {

    @Autowired
    public ColocationListController(final ColocationListService service) {
       super("colocationLists", ColocationList.class.getSimpleName().toLowerCase(), service);
    }

    @Override
    protected void loadEntities(final Model model) {
        super.loadEntities(model);
    }

    @Override
    protected void populateLists(final Model model) {
    }
}
