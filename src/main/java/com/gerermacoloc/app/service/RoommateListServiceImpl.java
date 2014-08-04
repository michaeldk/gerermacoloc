package com.gerermacoloc.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerermacoloc.app.domain.Roommate;
import com.gerermacoloc.app.domain.RoommateList;
import com.gerermacoloc.app.repo.contract.RoommateListDao;
import com.gerermacoloc.app.service.contract.RoommateListService;
import com.gerermacoloc.app.service.generic.GenericServiceImpl;

@Service
public class RoommateListServiceImpl extends GenericServiceImpl<RoommateList> implements RoommateListService {

    @Autowired
    public RoommateListServiceImpl(final RoommateListDao dao) {
        super(dao);
    }
	
	public void verifyBusinessRules(RoommateList RoommateList) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public void create(RoommateList entity) throws Exception {
		verifyBusinessRules(entity);
		((RoommateListDao) this.dao).create(entity);
	}

	@Override
	public RoommateList findToBuyList(Roommate roommate) {
		RoommateList list = ((RoommateListDao) this.dao).findToBuyList(roommate);
		if (list == null) {
			list = new RoommateList();
			list.setName("Achats à faire");
			list.setOwner(roommate);
			list.setType("TOBUYLIST");
			try {
				this.create(list);
			} catch (Exception e) {
				// will not happen
			}
		}
		return list;
	}

	@Override
	public List<RoommateList> findUserCreatedLists(Roommate roommate) {
		return ((RoommateListDao) this.dao).findUserCreatedLists(roommate);
	}
}
