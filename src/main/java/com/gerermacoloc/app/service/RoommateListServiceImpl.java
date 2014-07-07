package com.gerermacoloc.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerermacoloc.app.domain.RoommateList;
import com.gerermacoloc.app.form.CreateRoommateListForm;
import com.gerermacoloc.app.repo.contract.RoommateListDao;
import com.gerermacoloc.app.service.contract.RoommateListService;
import com.gerermacoloc.app.service.generic.GenericServiceImpl;

@Service
public class RoommateListServiceImpl extends GenericServiceImpl<RoommateList, CreateRoommateListForm> implements RoommateListService {

    @Autowired
    public RoommateListServiceImpl(final RoommateListDao dao) {
        super(dao);
    }

    @Override
    public CreateRoommateListForm createForm() {
        return new CreateRoommateListForm();
    }

    @Override
    protected RoommateList populateEntity(RoommateList element, CreateRoommateListForm form) {
    	if (element == null) {
    		element = new RoommateList();
    	}
    	// TODO Auto-generated method stub
    	return element;
    }

    @Override
    protected void populateForm(final CreateRoommateListForm form, final RoommateList element) {
    	// TODO Auto-generated method stub
    }
	
	public void verifyBusinessRules(RoommateList RoommateList) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public void create(CreateRoommateListForm form) throws Exception {
		// TODO Auto-generated method stub
	}

}
