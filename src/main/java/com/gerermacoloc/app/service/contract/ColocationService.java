package com.gerermacoloc.app.service.contract;

import com.gerermacoloc.app.domain.Colocation;
import com.gerermacoloc.app.domain.Roommate;
import com.gerermacoloc.app.form.ColocationForm;
import com.gerermacoloc.app.service.generic.GenericService;

public interface ColocationService extends GenericService<Colocation> {
	Colocation create(ColocationForm form, Roommate creator) throws Exception;
}
