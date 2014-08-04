package com.gerermacoloc.app.controller;

import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gerermacoloc.app.controller.util.SessionData;
import com.gerermacoloc.app.domain.Roommate;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method=RequestMethod.GET)
	public String home(final Locale locale, final Model model, final HttpSession session) {
		Roommate roommate = SessionData.findRoommate(session);
		if (roommate == null) {
			return "redirect:/welcome";
		} else if (roommate.getColocation() == null) {
			return "redirect:/coloc";
		}
		return "redirect:/dashboard";
	}
	
	@RequestMapping(value = "/welcome", method=RequestMethod.GET)
	public String welcome(final Locale locale, final Model model, final HttpSession session) {
		SessionData.clearSession(session);
		return "welcome";
	}
}
