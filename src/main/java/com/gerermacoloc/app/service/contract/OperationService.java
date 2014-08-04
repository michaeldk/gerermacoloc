package com.gerermacoloc.app.service.contract;

import java.util.List;

import com.gerermacoloc.app.domain.Colocation;
import com.gerermacoloc.app.domain.Operation;
import com.gerermacoloc.app.domain.Roommate;
import com.gerermacoloc.app.service.generic.GenericService;

public interface OperationService extends
		GenericService<Operation> {
	List<Operation> findOperationsbyRoommate(Roommate roommate);
	List<Operation> findOperationsbyColoc(Colocation coloc);
}
