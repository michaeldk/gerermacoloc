package com.gerermacoloc.app.repo.contract;

import java.util.List;

import com.gerermacoloc.app.domain.Colocation;
import com.gerermacoloc.app.domain.Roommate;
import com.gerermacoloc.app.repo.generic.GenericDao;

public interface RoommateDao extends GenericDao<Roommate> {
	Roommate findByEmail(String email);

	List<Roommate> findRoommatesByColoc(Colocation coloc);
}
