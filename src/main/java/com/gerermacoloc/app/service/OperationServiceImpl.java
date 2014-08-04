package com.gerermacoloc.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerermacoloc.app.domain.Colocation;
import com.gerermacoloc.app.domain.Operation;
import com.gerermacoloc.app.domain.Roommate;
import com.gerermacoloc.app.repo.contract.OperationDao;
import com.gerermacoloc.app.service.contract.OperationService;
import com.gerermacoloc.app.service.generic.GenericServiceImpl;

@Service
public class OperationServiceImpl extends GenericServiceImpl<Operation> implements OperationService {

    @Autowired
    public OperationServiceImpl(final OperationDao dao) {
        super(dao);
    }
	
	public void verifyBusinessRules(Operation payment) throws Exception {
	}

	@Override
	public List<Operation> findOperationsbyRoommate(Roommate roommate) {
		return ((OperationDao) this.dao).findOperationsbyRoommate(roommate);
	}

	@Override
	public List<Operation> findOperationsbyColoc(Colocation coloc) {
		return ((OperationDao) this.dao).findOperationsbyColoc(coloc);
	}

}
