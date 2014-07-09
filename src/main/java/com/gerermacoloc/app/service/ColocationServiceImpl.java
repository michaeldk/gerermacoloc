package com.gerermacoloc.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerermacoloc.app.domain.Colocation;
import com.gerermacoloc.app.repo.contract.ColocationDao;
import com.gerermacoloc.app.service.contract.ColocationService;
import com.gerermacoloc.app.service.generic.GenericServiceImpl;

@Service
public class ColocationServiceImpl extends GenericServiceImpl<Colocation> implements ColocationService {

    @Autowired
    public ColocationServiceImpl(final ColocationDao dao) {
        super(dao);
    }
    
    @Override
    public void verifyBusinessRules(Colocation colocation) throws Exception {
	}
	
}
