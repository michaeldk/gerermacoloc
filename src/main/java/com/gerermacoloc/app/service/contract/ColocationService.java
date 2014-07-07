package com.gerermacoloc.app.service.contract;

import com.gerermacoloc.app.domain.Colocation;
import com.gerermacoloc.app.form.CreateColocationForm;
import com.gerermacoloc.app.service.generic.GenericService;

public interface ColocationService extends
		GenericService<Colocation, CreateColocationForm> {
}
