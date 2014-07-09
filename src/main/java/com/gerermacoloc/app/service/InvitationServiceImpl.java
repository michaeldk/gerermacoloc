package com.gerermacoloc.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerermacoloc.app.domain.Invitation;
import com.gerermacoloc.app.repo.contract.InvitationDao;
import com.gerermacoloc.app.service.contract.InvitationService;
import com.gerermacoloc.app.service.generic.GenericServiceImpl;

@Service
public class InvitationServiceImpl extends GenericServiceImpl<Invitation> implements InvitationService {

    @Autowired
    public InvitationServiceImpl(final InvitationDao dao) {
        super(dao);
    }
	
	public void verifyBusinessRules(Invitation invitation) throws Exception {
	}

}
