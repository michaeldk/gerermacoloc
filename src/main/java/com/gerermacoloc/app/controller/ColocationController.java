package com.gerermacoloc.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gerermacoloc.app.controller.generic.GenericControllerImpl;
import com.gerermacoloc.app.controller.util.SessionData;
import com.gerermacoloc.app.domain.Colocation;
import com.gerermacoloc.app.form.CreateColocationForm;
import com.gerermacoloc.app.service.contract.ColocationService;

/**
 * The colocations controller.
 */
@Controller
@RequestMapping("/coloc")
public class ColocationController extends GenericControllerImpl<Colocation, CreateColocationForm> {

    @Autowired
    public ColocationController (final ColocationService service) {
        super("colocations", Colocation.class.getSimpleName().toLowerCase(), service);
    }
    
    /**
     * Retrieves the colocation ID from the user's session
     */
    @Override
    @RequestMapping(method = RequestMethod.GET)
    public String defaultHome(final Model model, HttpSession session) {
    	Colocation coloc = SessionData.findColocation(session);
    	if (coloc == null) {
    		return "redirect:/coloc/create";
    	}
    	model.addAttribute("coloc", coloc);
    	loadEntities(model);
    	return "display/" + this.name;
    }

    @Override
    protected void loadEntities (final Model model) {
        super.loadEntities(model);
    }

    @Override
    protected void populateLists (final Model model) {
    }
}
