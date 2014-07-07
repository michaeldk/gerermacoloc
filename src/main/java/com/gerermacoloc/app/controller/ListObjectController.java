package com.gerermacoloc.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gerermacoloc.app.controller.generic.GenericControllerImpl;
import com.gerermacoloc.app.domain.ListObject;
import com.gerermacoloc.app.form.CreateListObjectForm;
import com.gerermacoloc.app.service.contract.ListObjectService;

/**
 * The listobjects controller.
 */
@Controller
@RequestMapping("/listobjects")
public class ListObjectController extends GenericControllerImpl<ListObject, CreateListObjectForm> {

    @Autowired
    public ListObjectController(final ListObjectService service) {
        super("listobjects", ListObject.class.getSimpleName().toLowerCase(), service);
    }

    @Override
    protected void loadEntities(final Model model) {
        super.loadEntities(model);
    }

    @Override
    protected void populateLists(final Model model) {
    }
}
