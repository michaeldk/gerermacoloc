package com.gerermacoloc.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerermacoloc.app.domain.Roommate;
import com.gerermacoloc.app.repo.contract.RoommateDao;
import com.gerermacoloc.app.service.contract.RoommateService;
import com.gerermacoloc.app.service.generic.GenericServiceImpl;

@Service
public class RoommateServiceImpl extends GenericServiceImpl<Roommate> implements RoommateService {

    @Autowired
    public RoommateServiceImpl(final RoommateDao dao) {
        super(dao);
    }
	
	public void verifyBusinessRules(Roommate roommate) throws Exception {
	}

	@Override
	public Roommate findByEmail(String email) {
		return ((RoommateDao) this.dao).findByEmail(email);
	}

}
