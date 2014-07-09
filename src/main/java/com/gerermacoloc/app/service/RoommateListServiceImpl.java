package com.gerermacoloc.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		// TODO Auto-generated method stub
	}

}
