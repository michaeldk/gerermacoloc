package com.gerermacoloc.app.repo.contract;

import java.util.List;

import com.gerermacoloc.app.domain.Colocation;
import com.gerermacoloc.app.domain.Operation;
import com.gerermacoloc.app.domain.Roommate;
import com.gerermacoloc.app.repo.generic.GenericDao;

public interface OperationDao extends GenericDao<Operation> {
	List<Operation> findOperationsbyRoommate(Roommate roommate);
	List<Operation> findOperationsbyColoc(Colocation coloc);
}
