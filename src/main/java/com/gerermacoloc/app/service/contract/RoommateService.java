package com.gerermacoloc.app.service.contract;

import com.gerermacoloc.app.domain.Roommate;
import com.gerermacoloc.app.form.CreateRoommateForm;
import com.gerermacoloc.app.service.generic.GenericService;

public interface RoommateService extends
		GenericService<Roommate, CreateRoommateForm> {
	Roommate findByEmail(String email);
}
