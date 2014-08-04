package com.gerermacoloc.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gerermacoloc.app.controller.util.SessionData;
import com.gerermacoloc.app.domain.Colocation;
import com.gerermacoloc.app.domain.Roommate;
import com.gerermacoloc.app.service.contract.OperationService;

/**
 * The dashboard controller.
 */
@Controller
@RequestMapping("/operations")
public class OperationController {
    
	@Autowired
	private OperationService service;
	
    /**
     * dashboard view
     */
    @RequestMapping(method = RequestMethod.GET)
    public String defaultHome(final Model model, HttpSession session) {
    	Roommate roommate = SessionData.findRoommate(session);
    	if (roommate == null) {
    		return "redirect:/welcome";
    	} 
    	Colocation coloc = roommate.getColocation();
    	if (coloc == null) {
    		return "redirect:/coloc";
    	}
    	model.addAttribute("colocation", coloc);
    	model.addAttribute("operations", this.service.findOperationsbyColoc(coloc));
    	return "operations";
    }
}
