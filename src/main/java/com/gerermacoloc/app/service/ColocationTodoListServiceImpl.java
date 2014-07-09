package com.gerermacoloc.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerermacoloc.app.domain.Colocation;
import com.gerermacoloc.app.domain.ColocationTodoList;
import com.gerermacoloc.app.repo.contract.ColocationTodoListDao;
import com.gerermacoloc.app.service.contract.ColocationTodoListService;
import com.gerermacoloc.app.service.generic.GenericServiceImpl;

@Service
public class ColocationTodoListServiceImpl extends GenericServiceImpl<ColocationTodoList> implements ColocationTodoListService {

    @Autowired
    public ColocationTodoListServiceImpl(final ColocationTodoListDao dao) {
        super(dao);
    }
	
	public void verifyBusinessRules(ColocationTodoList ColocationTodoList) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public void create(ColocationTodoList entity) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public ColocationTodoList findByColocation(Colocation colocation) {
		return ((ColocationTodoListService) this.dao).findByColocation(colocation);
	}

}
