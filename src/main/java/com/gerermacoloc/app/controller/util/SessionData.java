package com.gerermacoloc.app.controller.util;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gerermacoloc.app.domain.Colocation;
import com.gerermacoloc.app.domain.Roommate;
import com.gerermacoloc.app.service.contract.RoommateService;

/**
 * @author mdekeys
 * Helper class designed to wrap access to session data
 */
@Component
public class SessionData {
	
	@Autowired
	private static RoommateService roommateService;
	
	public static Colocation findColocation(HttpSession session) {
		Colocation coloc = (Colocation) session.getAttribute("colocation");
		if (coloc != null) {
			return coloc;
		}
		Roommate user = findRoommate(session);
		if (user == null) {
			return null;
		}
		coloc = user.getColocation();
		session.setAttribute("colocation", coloc);
		return coloc;
	}
	
	public static Roommate findRoommate(HttpSession session) {
 		return (Roommate) session.getAttribute("user");
	}
	
	public static void clearSession(HttpSession session) {
		session.removeAttribute("colocation");
		session.removeAttribute("user");
	}
}
