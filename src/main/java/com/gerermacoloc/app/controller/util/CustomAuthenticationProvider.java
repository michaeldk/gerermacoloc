package com.gerermacoloc.app.controller.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import com.gerermacoloc.app.domain.Roommate;
import com.gerermacoloc.app.service.contract.RoommateService;

@Component
public class CustomAuthenticationProvider {
	
	@Autowired
	private RoommateService roommateService;
	
    public Roommate authenticate(String name, String password) throws AuthenticationException {
		Roommate roommate = roommateService.findByEmail(name);
		if (roommate != null && roommate.getPassword().equals(PasswordHelper.hashPassword(name, password))) {
			return roommate;
		} else {
			throw new BadCredentialsException("Email ou mot de passe incorrect.");
		}
	}
}
