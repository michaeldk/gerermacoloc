package com.gerermacoloc.app.service.contract;

import com.gerermacoloc.app.domain.Colocation;
import com.gerermacoloc.app.domain.ColocationList;
import com.gerermacoloc.app.service.generic.GenericService;

public interface ColocationListService extends GenericService<ColocationList> {
	ColocationList getColocationList(Colocation coloc);
}
