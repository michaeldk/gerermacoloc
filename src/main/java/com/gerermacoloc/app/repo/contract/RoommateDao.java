package com.gerermacoloc.app.repo.contract;

import com.gerermacoloc.app.domain.Roommate;
import com.gerermacoloc.app.repo.generic.GenericDao;

public interface RoommateDao extends GenericDao<Roommate> {
	Roommate findByEmail(String email);
}
