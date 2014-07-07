package com.gerermacoloc.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerermacoloc.app.domain.ListObject;
import com.gerermacoloc.app.form.CreateListObjectForm;
import com.gerermacoloc.app.repo.contract.ListObjectDao;
import com.gerermacoloc.app.service.contract.ListObjectService;
import com.gerermacoloc.app.service.generic.GenericServiceImpl;

@Service
public class ListObjectServiceImpl extends GenericServiceImpl<ListObject, CreateListObjectForm> implements ListObjectService {

    @Autowired
    public ListObjectServiceImpl(final ListObjectDao dao) {
        super(dao);
    }

    @Override
    public CreateListObjectForm createForm() {
        return new CreateListObjectForm();
    }

    @Override
    protected ListObject populateEntity(ListObject element, CreateListObjectForm form) {
    	if (element == null) {
    		element = new ListObject();
    	}
    	// TODO Auto-generated method stub
    	return element;
    }

    @Override
    protected void populateForm(final CreateListObjectForm form, final ListObject element) {
    	// TODO Auto-generated method stub
    }
	
	public void verifyBusinessRules(ListObject ListObject) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public void create(CreateListObjectForm form) throws Exception {
		// TODO Auto-generated method stub
	}

}
