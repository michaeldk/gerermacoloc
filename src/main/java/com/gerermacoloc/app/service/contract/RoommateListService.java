package com.gerermacoloc.app.service.contract;

import java.util.List;

import com.gerermacoloc.app.domain.Roommate;
import com.gerermacoloc.app.domain.RoommateList;
import com.gerermacoloc.app.service.generic.GenericService;

public interface RoommateListService extends GenericService<RoommateList> {
	RoommateList findToBuyList(Roommate roommate);
	List<RoommateList> findUserCreatedLists(Roommate roommate);
}
