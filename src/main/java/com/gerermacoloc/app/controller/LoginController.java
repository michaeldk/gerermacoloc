package com.gerermacoloc.app.controller;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gerermacoloc.app.controller.util.CustomAuthenticationProvider;
import com.gerermacoloc.app.domain.Roommate;
 
@Controller
public class LoginController {;
	@Autowired
	private CustomAuthenticationProvider customAuthenticationProvider;

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public @ResponseBody HashMap<String, String> login(@RequestParam(value="userName") String userName, @RequestParam(value="password") String password, HttpSession session) {
        Roommate roommate = null;
        HashMap<String, String> returnValue = new HashMap<String, String>();
    	try {
    		roommate = customAuthenticationProvider.authenticate(userName, password);
            session.setAttribute("user", roommate);
            session.setAttribute("colocation", roommate.getColocation());
            returnValue.put("login", "success");
        	return returnValue;
        } catch (AuthenticationException ex) {
        	returnValue.put("login", "failure");
        	return returnValue;
        }
    }
}