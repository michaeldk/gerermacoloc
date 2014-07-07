package com.gerermacoloc.app.repo.contract;

import com.gerermacoloc.app.domain.Colocation;
import com.gerermacoloc.app.domain.ColocationTodoList;
import com.gerermacoloc.app.repo.generic.GenericDao;

public interface ColocationTodoListDao extends GenericDao<ColocationTodoList> {
	ColocationTodoList findByColocation(Colocation colocation);
}
