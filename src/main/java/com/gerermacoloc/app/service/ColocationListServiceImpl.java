package com.gerermacoloc.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerermacoloc.app.domain.ColocationList;
import com.gerermacoloc.app.repo.contract.ColocationListDao;
import com.gerermacoloc.app.service.contract.ColocationListService;
import com.gerermacoloc.app.service.generic.GenericServiceImpl;

@Service
public class ColocationListServiceImpl extends GenericServiceImpl<ColocationList> implements ColocationListService {

    @Autowired
    public ColocationListServiceImpl(final ColocationListDao dao) {
        super(dao);
    }
	
	public void verifyBusinessRules(ColocationList ColocationList) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public void create(ColocationList entity) throws Exception {
		// TODO Auto-generated method stub
	}

}
