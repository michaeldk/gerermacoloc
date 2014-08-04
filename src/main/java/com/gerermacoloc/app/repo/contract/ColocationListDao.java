package com.gerermacoloc.app.repo.contract;

import com.gerermacoloc.app.domain.Colocation;
import com.gerermacoloc.app.domain.ColocationList;
import com.gerermacoloc.app.repo.generic.GenericDao;

public interface ColocationListDao extends GenericDao<ColocationList> {
	ColocationList getColocationList(Colocation coloc);
}
