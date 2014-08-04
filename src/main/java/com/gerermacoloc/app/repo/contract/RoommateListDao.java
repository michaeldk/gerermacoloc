package com.gerermacoloc.app.repo.contract;

import java.util.List;

import com.gerermacoloc.app.domain.Roommate;
import com.gerermacoloc.app.domain.RoommateList;
import com.gerermacoloc.app.repo.generic.GenericDao;

public interface RoommateListDao extends GenericDao<RoommateList> {
	RoommateList findToBuyList(Roommate roommate);
	List<RoommateList> findUserCreatedLists(Roommate roommate);
}
