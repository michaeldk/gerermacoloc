package com.gerermacoloc.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gerermacoloc.app.controller.util.SessionData;
import com.gerermacoloc.app.domain.Colocation;

/**
 * The dashboard controller.
 */
@Controller
@RequestMapping("/dashboard")
public class DashboardController {
    
    /**
     * dashboard view
     */
    @RequestMapping(method = RequestMethod.GET)
    public String defaultHome(final Model model, HttpSession session) {
    	Colocation coloc = SessionData.findColocation(session);
    	if (coloc == null) {
    		return "redirect:/coloc/create";
    	}
    	model.addAttribute("coloc", coloc);
    	return "dashboard";
    }
}
