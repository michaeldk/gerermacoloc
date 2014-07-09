package com.gerermacoloc.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerermacoloc.app.domain.ListObject;
import com.gerermacoloc.app.repo.contract.ListObjectDao;
import com.gerermacoloc.app.service.contract.ListObjectService;
import com.gerermacoloc.app.service.generic.GenericServiceImpl;

@Service
public class ListObjectServiceImpl extends GenericServiceImpl<ListObject> implements ListObjectService {

    @Autowired
    public ListObjectServiceImpl(final ListObjectDao dao) {
        super(dao);
    }
	
	public void verifyBusinessRules(ListObject ListObject) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public void create(ListObject entity) throws Exception {
		// TODO Auto-generated method stub
	}

}
