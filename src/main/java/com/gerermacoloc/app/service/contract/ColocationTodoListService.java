package com.gerermacoloc.app.service.contract;

import com.gerermacoloc.app.domain.Colocation;
import com.gerermacoloc.app.domain.ColocationTodoList;
import com.gerermacoloc.app.form.CreateColocationTodoListForm;
import com.gerermacoloc.app.service.generic.GenericService;

public interface ColocationTodoListService extends GenericService<ColocationTodoList, CreateColocationTodoListForm> {
	ColocationTodoList findByColocation (Colocation colocation);
}