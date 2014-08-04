package com.gerermacoloc.app.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gerermacoloc.app.controller.util.SessionData;
import com.gerermacoloc.app.domain.Colocation;
import com.gerermacoloc.app.domain.Operation;
import com.gerermacoloc.app.domain.Roommate;
import com.gerermacoloc.app.service.contract.OperationService;
import com.gerermacoloc.app.service.contract.RoommateListService;
import com.gerermacoloc.app.service.contract.TaskService;

/**
 * The dashboard controller.
 */
@Controller
@RequestMapping("/dashboard")
public class DashboardController {
	
	@Autowired
	private TaskService taskService;
	@Autowired
	private RoommateListService roommateListService;
	@Autowired
	private OperationService operationService;
    
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
    	List<Operation> operations = operationService.findOperationsbyRoommate(roommate);
    	model.addAttribute("tasks", taskService.findRoommateTasks(roommate));
    	model.addAttribute("tobuylist", roommateListService.findToBuyList(roommate));
    	model.addAttribute("operations", operations);
    	double balance = 0.0;
    	for (Operation op : operations) {
    		if (op.getRoommateOwed() == roommate) {
    			balance += op.getAmount();
    		} else {
    			balance -= op.getAmount();
    		}
    	}
    	model.addAttribute("operationsBalance", balance);
    	return "dashboard";
    }
}
