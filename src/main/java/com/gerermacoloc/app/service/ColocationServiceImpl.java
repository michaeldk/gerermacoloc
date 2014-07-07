package com.gerermacoloc.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerermacoloc.app.domain.Colocation;
import com.gerermacoloc.app.form.CreateColocationForm;
import com.gerermacoloc.app.repo.contract.ColocationDao;
import com.gerermacoloc.app.service.contract.ColocationService;
import com.gerermacoloc.app.service.generic.GenericServiceImpl;

@Service
public class ColocationServiceImpl extends GenericServiceImpl<Colocation, CreateColocationForm> implements ColocationService {

    @Autowired
    public ColocationServiceImpl(final ColocationDao dao) {
        super(dao);
    }

    @Override
    public CreateColocationForm createForm() {
        return new CreateColocationForm();
    }

    @Override
    protected Colocation populateEntity(Colocation element, final CreateColocationForm form) {
    	if (element == null) {
    		element = new Colocation();
    	}
    	element.setName(form.getName());
    	return element;
    }

    @Override
    protected void populateForm(final CreateColocationForm form, final Colocation element) {
    }
    
    @Override
    public void verifyBusinessRules(Colocation colocation) throws Exception {
	}
	
}
