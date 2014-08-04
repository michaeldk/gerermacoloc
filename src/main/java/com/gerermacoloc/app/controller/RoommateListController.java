package com.gerermacoloc.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gerermacoloc.app.controller.generic.GenericControllerImpl;
import com.gerermacoloc.app.controller.util.SessionData;
import com.gerermacoloc.app.domain.Colocation;
import com.gerermacoloc.app.domain.Roommate;
import com.gerermacoloc.app.service.contract.RoommateListService;

/**
 * The roommateLists controller.
 */
@Controller
@RequestMapping("/meslistes")
public class RoommateListController extends GenericControllerImpl {

    @Autowired
    private RoommateListService service;

	@Override
	public String defaultHome(Model model, HttpSession session) {
		Roommate roommate = SessionData.findRoommate(session);
    	if (roommate == null) {
    		return "redirect:/welcome";
    	} 
    	Colocation coloc = roommate.getColocation();
    	if (coloc == null) {
    		return "redirect:/coloc";
    	}
    	model.addAttribute("tobuylist", this.service.findToBuyList(roommate));
    	model.addAttribute("listes", this.service.findUserCreatedLists(roommate));
		return "meslistes";
	}
}
