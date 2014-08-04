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
import com.gerermacoloc.app.domain.Roommate;
import com.gerermacoloc.app.service.contract.ColocationListService;
import com.gerermacoloc.app.service.contract.RoommateListService;

/**
 * The colocations controller.
 */
@Controller
@RequestMapping("/achatsafaire")
public class ColocationListController extends GenericControllerImpl {

    @Autowired
    private ColocationListService service;
    @Autowired
    private RoommateListService roommateListService;
    
    /**
     * Retrieves the colocation ID from the user's session
     */
    @Override
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
    	model.addAttribute("colocationList", this.service.getColocationList(coloc));
    	model.addAttribute("tobuylist", this.roommateListService.findToBuyList(roommate));
    	return "achatsafaire";
    }
}
