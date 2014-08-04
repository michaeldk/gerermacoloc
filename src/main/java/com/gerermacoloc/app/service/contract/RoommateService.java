package com.gerermacoloc.app.service.contract;

import java.util.List;

import com.gerermacoloc.app.domain.Colocation;
import com.gerermacoloc.app.domain.Roommate;
import com.gerermacoloc.app.service.generic.GenericService;

public interface RoommateService extends
		GenericService<Roommate> {
	Roommate findByEmail(String email);
	List<Roommate> findRoommatesByColoc(Colocation coloc);
}
