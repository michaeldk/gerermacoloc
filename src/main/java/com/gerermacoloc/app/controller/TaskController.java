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
import com.gerermacoloc.app.service.contract.RoommateService;
import com.gerermacoloc.app.service.contract.TaskService;

/**
 * The tasks controller.
 */
@Controller
@RequestMapping("/taches")
public class TaskController extends GenericControllerImpl {

    @Autowired
    private TaskService service;
    @Autowired
    private RoommateService roommateService;

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
		model.addAttribute("tasks", this.service.findColocationTasks(coloc, roommate));
		model.addAttribute("roommates", this.roommateService.findRoommatesByColoc(coloc));
		return "taches";
	}
}
